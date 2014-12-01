package org.scalajs

import scala.scalajs.js

package object jquery extends js.GlobalScope {
  val jQuery: JQueryStatic = js.native
}
