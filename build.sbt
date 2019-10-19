lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js jQuery"

normalizedName := "scalajs-jquery"

version := "0.9.6-SNAPSHOT"

organization := "be.doeraene"

libraryDependencies +=
  "org.scala-js" %%% "scalajs-dom" % "0.9.7"

scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings")

// Work around https://github.com/scala-js/scala-js/issues/3612
scalacOptions in (Compile, doc) := {
  val prev = (scalacOptions in (Compile, doc)).value
  if (scalaJSVersion.startsWith("0.6.") && scalaVersion.value.startsWith("2.13."))
    prev.filter(_ != "-Xfatal-warnings")
  else
    prev
}

homepage := Some(url("http://scala-js.org/"))

licenses += ("BSD 3-Clause", url("http://opensource.org/licenses/BSD-3-Clause"))

scmInfo := Some(ScmInfo(
    url("https://github.com/scala-js/scala-js-jquery"),
    "scm:git:git@github.com:scala-js/scala-js-jquery.git",
    Some("scm:git:git@github.com:scala-js/scala-js-jquery.git")))

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := (
  <developers>
    <developer>
      <id>sjrd</id>
      <name>Sébastien Doeraene</name>
      <url>https://github.com/sjrd/</url>
    </developer>
  </developers>
)

pomIncludeRepository := { _ => false }
