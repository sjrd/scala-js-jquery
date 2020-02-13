scala-js-jquery
===============

[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-0.6.29.svg)](https://www.scala-js.org/)
[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-1.0.0-M8.svg)](https://www.scala-js.org/)

Static types for the jQuery API for [Scala.js](http://www.scala-js.org/) programs.

**This library is a fork of [sjrd/scala-js-jquery](https://github.com/sjrd/scala-js-jquery) to maintain for newer Scala.js and jQuery**.

Usage
-----

## For jQuery 3 (recommended)

Add the following to your sbt build definition:

```scala
libraryDependencies += "net.exoego" %%% "scalajs-jquery3" % "0.9.6"
```

Enjoy types in Scala file:

```scala
import net.exoego.scalajs.jquery._

jQuery("button".on("click", () => println("hello world"))
```
    
This aritifcat is built and published for 

* Scala.js 0.6.29 and later, and Scala.js 1.0.0-M8
* with Scala 2.11, 2.12, 2.13
* for [jQuery 3.4.1 based on this TypeScript definition and manually tweaked](https://github.com/DefinitelyTyped/DefinitelyTyped/tree/b0503ac10547e9e087febf36e83c600a62c444bb/types/jquery)

It will likely be published as is for later versions of Scala and Scala.js as
well.


## For jQuery 3 in org.scalajs.jquery package

This artifact provides type aliases as bridge from the original package
`org.scalajs.jquery` to the updated `net.exoego.scalajs.jquery` package.

It  will allow you to update type facade to jQuery 3 with minimum code change.
But you should expect some minor rewrites, since 

* Original `org.scalajs.jquery` offers non strict types for jQuery 1/2.
* `net.exoego.scalajs.jquery` offers stricter types are for jQuery 3.

Add the following to your sbt build definition:

```scala
libraryDependencies += "net.exoego" %%% "scalajs-jquery3-compat" % "0.9.6"
```

You may use type aliases in `org.scalajs.jquery`:

```scala
import org.scalajs.jquery._

jQuery("button".on("click", () => println("hello world"))
```
    
## For jQuery 1/2

This is a drop-in replacement for original `"be.doeraene" %%% "scalajs-jquery" % "0.9.5"` artifact.

**Caution: Sources of `scalajs-jquery2` are just copy of [sjrd/scala-js-jquery](https://github.com/sjrd/scala-js-jquery) and published for newer Scala.js & Scala. [The actual supported jQuery version is unknown](https://github.com/sjrd/scala-js-jquery/issues/1#issuecomment-33003326). It is unlikely to update type facade for this artifact by me (contribution are welcome).**

Add the following to your sbt build definition:

```scala
libraryDependencies += "net.exoego" %%% "scalajs-jquery2" % "0.9.6"
```

Enjoy types in Scala file:

```scala
import org.scalajs.jquery._

jQuery("button".on("click", () => println("hello world"))
```
    
then enjoy the types available in `org.scalajs.jquery`.

This aritifcat is built and published for Scala.js 0.6.29 and later,
and Scala.js 1.0.0-M8, with Scala 2.11, 2.12, 2.13. It will
likely be published as is for later versions of Scala and Scala.js as
well.



Using [Scala.js Bundler](https://scalacenter.github.io/scalajs-bundler)
-----------------------------------------------------------------------

If you want to use Scala.js Bundler (sbt plugin must be enabled in `project/plugins.sbt`) to import jQuery as npm module, then add the following lines to your sbt build definition:

```scala
enablePlugins(ScalaJSBundlerPlugin)

libraryDependencies += "net.exoego" %%% "scalajs-jquery3" % "0.9.6"

npmDependencies in Compile ++= Seq(
  "jquery" -> "3.4.1"
)
```

Then define a `jquery` object in your Scala code using the `@JSImport` annotation to get access to the exported `jQuery` object.
A simple example on how to use the Scala.js JQuery facade this way is shown here:

```scala
import net.exoego.scalajs.jquery.{ JQueryStatic => jquery }

object Main {
  override def main(): Unit = {
    jquery("body").html("Hello world!")
  }
}
```

Running the sbt task `fastOptJS::webpack` will generate a JavaScript bundle (`...-fastopt-bundle.js`) including jquery as specified in the `npmDependencies` sbt build definition setting.
