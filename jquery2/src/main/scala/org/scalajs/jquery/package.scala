package org.scalajs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

package object jquery {
  @js.native
  @JSImport(module = "jquery", name = "jQuery", globalFallback = "jQuery")
  object jQuery extends JQueryStatic
}
