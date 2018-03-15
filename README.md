scala-js-jquery
===============

[![Build Status](https://travis-ci.org/scala-js/scala-js-jquery.svg?branch=master)](https://travis-ci.org/scala-js/scala-js-jquery)
[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-0.6.17.svg)](https://www.scala-js.org/)
[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-1.0.0-M3.svg)](https://www.scala-js.org/)

Static types for the jQuery API for [Scala.js](http://www.scala-js.org/) programs.

Usage
-----

Add the following to your sbt build definition:

    libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.3"

then enjoy the types available in `org.scalajs.jquery`.

scalajs-jquery 0.9.3 is built and published for Scala.js 0.6.17 and later and
Scala.js 1.0.0-M3, with Scala 2.10, 2.11, 2.12 and 2.13.0-M3.

Include JavaScript
------------------

scala-js-jquery provides the types, not the `jquery.js` file itself.
If you want it to be included in the final `client-jsdeps.js`, you can add the desired version to `jsDependencies`, e.g.,

    jsDependencies +=
      "org.webjars" % "jquery" % "2.1.3" / "2.1.3/jquery.js"

Using [Scala.js Bundler](https://scalacenter.github.io/scalajs-bundler)
-----------------------------------------------------------------------

If you want to use Scala.js Bundler (sbt plugin must be enabled in `project/plugins.sbt`) to import jQuery as npm module, then add the following lines to your sbt build definition:

```
enablePlugins(ScalaJSBundlerPlugin)

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.3"

npmDependencies in Compile ++= Seq(
  "jquery" -> "2.1.3"
)
```

Next define a `jquery` object in your Scala code using the `@JSImport` annotation to get access to the exported `jQuery` object.
A simple example on how to use the Scala.js JQuery facade this way is shown here:

```
import org.scalajs.jquery.JQueryStatic
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("jquery", JSImport.Namespace)
object jquery extends JQueryStatic

object Main extends js.JSApp {
  @js.annotation.JSExport
  override def main(): Unit = {
    jquery("body").html("Hello world!")
  }
}
```

Running the sbt task `fastOptJS::webpack` will generate a JavaScript bundle (`...-fastopt-bundle.js`) including jquery as specified in the `npmDependencies` sbt build definition setting.

License
-------

Copyright (c) 2002-2017 EPFL

All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

*   Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.
*   Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.
*   Neither the name of the EPFL nor the names of its contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
