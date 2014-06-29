scala-js-jquery
===============

Static types for the jQuery API for [Scala.js](http://www.scala-js.org/) programs.

Usage
-----

Add the following to your sbt build definition:

    libraryDependencies += "org.scala-lang.modules.scalajs" %%% "scalajs-jquery" % "0.6"

then enjoy the types available in `org.scalajs.jquery`.

scalajs-jquery 0.6 is built and published for Scala.js 0.5.0 and following in
the 0.5.x series, with both Scala 2.10 and 2.11.

The API was generated automatically. The API often uses js.Any where other more
specific types could be used but scala's type checking will prevent. In some cases
you will need to cast to the appropriate type to allow compilation to succeed.
jQuery allows many different types of parameters for the same function. If you find
that you are constantly type casting the API and have confirmed that the jQuery
API allows a specific type of object to be provided as a parameter, send a pull
request to add that API enhancement.

jQuery allows two types of elements, HTML elements and SVG elements. This API
wrapper is biased towards HTML manipulation so you will see that for map/filter/each
the HTMLElement has been used as a parameter or return value versus the more
generic Element. This design choice is based on the desire to make HTML
element manipulation better supported at the expense of the less common SVG
scenario.


License
-------

Copyright (c) 2002-2014 EPFL

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
