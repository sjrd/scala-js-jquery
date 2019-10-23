package net.exoego.scalajs

import net.exoego.scalajs.jquery.JQuery.{ Ajax, PlainObject }
import org.scalajs.dom.{ DocumentFragment, Element, Node }
import org.scalajs.dom.raw.DOMList

import scala.scalajs.js
import scala.scalajs.js.|

package object jquery {
  type ArrayLike[T] = js.Array[T] | DOMList[T] | JQuery[T]
  type TransportSuccessCallback = js.Function4[Int, Ajax.TextStatus, PlainObject[_], String, Unit]
  type ContentLike = JQuery.htmlString | JQuery.TypeOrArray[JQuery.Node | JQuery[JQuery.Node]]
  type ToTarget = JQuery.Selector | JQuery.htmlString | JQuery.TypeOrArray[Element | DocumentFragment] | JQuery[Element]
  type InsertTarget = JQuery.Selector | JQuery.htmlString | JQuery.TypeOrArray[Node] | JQuery[Node]
}
