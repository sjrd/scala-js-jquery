lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

crossScalaVersions in ThisBuild := {
  val allVersions = Seq("2.12.10", "2.11.12", "2.10.7", "2.13.1")
  if (scalaJSVersion.startsWith("0.6."))
    allVersions
  else
    allVersions.filter(!_.startsWith("2.10."))
}
scalaVersion in ThisBuild := (crossScalaVersions in ThisBuild).value.head

name := "Scala.js jQuery"

normalizedName := "scalajs-jquery"

version := "1.0.0"

organization := "be.doeraene"

libraryDependencies +=
  "org.scala-js" %%% "scalajs-dom" % "1.0.0"

scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings")

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
