scalaJSSettings

name := "Scala.js jQuery"

normalizedName := "scalajs-jquery"

version := "0.1-SNAPSHOT"

organization := "org.scala-lang.modules.scalajs"

crossScalaVersions := Seq("2.10.2", "2.11.0-M7")

libraryDependencies +=
  "org.scala-lang.modules.scalajs" %% "scalajs-dom" % "0.1-SNAPSHOT"
