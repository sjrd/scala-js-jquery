package org.scalajs

import scala.scalajs.js

package object jquery {
  val jQuery: JQueryStatic = js.Dynamic.global.jQuery.asInstanceOf[JQueryStatic]
}
