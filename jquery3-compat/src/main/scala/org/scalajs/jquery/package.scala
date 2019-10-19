package org.scalajs

import org.scalajs.dom.Element

import scala.scalajs.js

package object jquery {
  val jQuery: JQueryStatic = js.Dynamic.global.jQuery.asInstanceOf[JQueryStatic]

  type JQuery = net.exoego.scalajs.jquery.JQuery[Element]
  type JQueryAjaxSettings = net.exoego.scalajs.jquery.JQuery.AjaxSettings
  type JQueryCallback = net.exoego.scalajs.jquery.JQuery.Callbacks
  type JQueryPromise = net.exoego.scalajs.jquery.JQuery.Promise[js.Any,js.Any,js.Any]
  type JQueryDeferred = net.exoego.scalajs.jquery.JQuery.Deferred[js.Any,js.Any,js.Any]
  type JQuerySupport = net.exoego.scalajs.jquery.JQuerySupport
  type JQueryStatic = net.exoego.scalajs.jquery.JQueryStatic
  type JQueryEventObject = net.exoego.scalajs.jquery.JQuery.Event
  type JQueryTransport = net.exoego.scalajs.jquery.JQuery.Transport
  type JQueryXHR =  net.exoego.scalajs.jquery.JQuery.jqXHR
}
