import sbt._
import sbt.Keys._

lazy val root = project.in(file("."))
  .aggregate(jquery2, jquery3, jquery3Compat)
  .settings(MySettings.commonSettings)
  .settings(MySettings.publishingSettings)
  .settings(MySettings.nonPublishingSetting)
  .settings(libraryDependencies := Seq.empty)

lazy val jquery2 = project.in(file("jquery2"))
  .enablePlugins(ScalaJSPlugin)
  .settings(MySettings.commonSettings)
  .settings(MySettings.publishingSettings)
  .settings(
    name := "scalajs-jquery2"
  )

lazy val jquery3 = project.in(file("jquery3"))
  .enablePlugins(ScalaJSPlugin)
  .settings(MySettings.commonSettings)
  .settings(MySettings.publishingSettings)
  .settings(
    name := "scalajs-jquery3"
  )

lazy val jquery3Compat = project.in(file("jquery3-compat"))
  .enablePlugins(ScalaJSPlugin)
  .settings(MySettings.commonSettings)
  .settings(MySettings.publishingSettings)
  .settings(
    name := "scalajs-jquery3-compat"
  )
  .dependsOn(jquery3)
