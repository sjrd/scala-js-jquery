import com.jsuereth.sbtpgp.SbtPgp.autoImport.PgpKeys
import sbt.Keys._
import sbt._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import xerial.sbt.Sonatype.SonatypeKeys

object MySettings {

  lazy val commonSettings = Seq(
    organization := "net.exoego",
    libraryDependencies ++= Def.setting(Seq(
      "org.scala-js" %%% "scalajs-dom" % "1.0.0"
    )).value,
    scalacOptions ++= {
      val scalajsOptions = if (scalaJSVersion.startsWith("0.6."))
        Seq("-P:scalajs:sjsDefinedByDefault")
      else
        Seq()
      Seq("-deprecation", "-feature", "-Xfatal-warnings") ++ scalajsOptions
    },
    // Work around https://github.com/scala-js/scala-js/issues/3612
    scalacOptions in(Compile, doc) := {
      val prev = (scalacOptions in(Compile, doc)).value
      if (scalaJSVersion.startsWith("0.6.") && scalaVersion.value.startsWith("2.13."))
        prev.filter(_ != "-Xfatal-warnings")
      else
        prev
    }
  )

  lazy val nonPublishingSetting = Seq(
    skip in publish := true,
    publishArtifact := false,
    publish := {},
    publishLocal := {}
  )

  lazy val publishingSettings = Seq(
    licenses += ("BSD 3-Clause", url("http://opensource.org/licenses/BSD-3-Clause")),
    scmInfo := Some(ScmInfo(
      url("https://github.com/exoego/scala-js-jquery"),
      "scm:git:git@github.com:exoego/scala-js-jquery.git",
      Some("scm:git:git@github.com:exoego/scala-js-jquery.git")
    )),
    homepage := scmInfo.value.map(_.browseUrl),
    developers := List(
      Developer(
        id = "exoego",
        name = "TATSUNO Yasuhiro",
        email = "ytatsuno.jp@gmail.com",
        url = url("https://www.exoego.net")
      )
    ),
    publishArtifact in Test := false,
    publishArtifact in (Compile, packageDoc) := true,
    publishArtifact in (Compile, packageSrc) := true,
    publishArtifact in packageDoc := false,
    pomIncludeRepository := { _ =>
      false
    },
    publishConfiguration := publishConfiguration.value.withOverwrite(true),
    publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true),
    publishTo in ThisBuild := SonatypeKeys.sonatypePublishToBundle.value,
    publishMavenStyle := true,
    publishArtifact in packageDoc := false,
    sources in (Compile, doc) := Seq.empty,
  )

}
