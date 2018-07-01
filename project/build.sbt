val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.24")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)
