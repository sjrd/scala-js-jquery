scalaJSSettings

name := "Scala.js jQuery"

normalizedName := "scalajs-jquery"

version := "0.4"

organization := "org.scala-lang.modules.scalajs"

scalaVersion := "2.10.4"

crossScalaVersions := Seq("2.10.4", "2.11.0")

libraryDependencies +=
  "org.scala-lang.modules.scalajs" %% "scalajs-dom" % "0.4"

homepage := Some(url("http://scala-js.org/"))

licenses += ("BSD New", url("https://github.com/scala-js/scala-js/blob/master/LICENSE"))
