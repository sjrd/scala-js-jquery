lazy val root = project.in(file(".")).enablePlugins(ScalaJSPlugin)

name := "Scala.js jQuery"

normalizedName := "scalajs-jquery"

version := "0.7.0"

organization := "org.scala-lang.modules.scalajs"

scalaVersion := "2.11.4"

crossScalaVersions := Seq("2.10.4", "2.11.4")

libraryDependencies +=
  "org.scala-js" %%%! "scalajs-dom" % "0.7.0"

jsDependencies +=
  "org.webjars" % "jquery" % "1.10.2" / "jquery.js"

jsDependencies in Test += RuntimeDOM

homepage := Some(url("http://scala-js.org/"))

licenses += ("BSD New", url("https://github.com/scala-js/scala-js/blob/master/LICENSE"))
