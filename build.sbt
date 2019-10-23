import sbt._
import sbt.Keys._

lazy val root = project.in(file("."))
  .aggregate(jquery2, jquery3, jquery3Compat)

lazy val jquery2 = project.in(file("jquery2"))
  .enablePlugins(ScalaJSPlugin)
  .settings(commonSettings)
  .settings(
    name := "scalajs-jquery2"
  )

lazy val jquery3 = project.in(file("jquery3"))
  .enablePlugins(ScalaJSPlugin)
  .settings(commonSettings)
  .settings(
    name := "scalajs-jquery3"
  )

lazy val jquery3Compat = project.in(file("jquery3-compat"))
  .enablePlugins(ScalaJSPlugin)
  .settings(commonSettings)
  .settings(
    name := "scalajs-jquery3-compat"
  )
  .dependsOn(jquery3)

lazy val commonSettings = Seq(
  version := "0.9.6-SNAPSHOT",
  organization := "net.exoego",
  libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.9.7"
  ),
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
  },
  licenses += ("BSD 3-Clause", url("http://opensource.org/licenses/BSD-3-Clause")),
  scmInfo := Some(ScmInfo(
    url("https://github.com/exoego/scala-js-jquery"),
    "scm:git:git@github.com:exoego/scala-js-jquery.git",
    Some("scm:git:git@github.com:exoego/scala-js-jquery.git"))),
)
