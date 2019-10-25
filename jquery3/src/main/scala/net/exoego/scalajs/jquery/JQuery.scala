package net.exoego.scalajs.jquery

import net.exoego.scalajs.jquery.JQuery.Ajax.{ CompleteCallback, ErrorCallback, StatusCodeCallbacks, SuccessCallback }
import org.scalajs.dom.{ Comment, DocumentFragment, ErrorEvent, EventTarget, Node, ProgressEvent, Text, TouchList, Window, XMLHttpRequest, XMLHttpRequestEventTarget }
import org.scalajs.dom.html._

import scala.scalajs.js
import scala.scalajs.js.annotation.{ JSBracketAccess, JSGlobal, JSName }
import scala.scalajs.js.|

@js.native
trait JQuery[TElement] extends js.Iterable[TElement] {
  var jquery: String = js.native
  var length: Int = js.native

  def add(selector: JQuery.Selector, context: Element): this.type = js.native
  def add(selector_or_html: String): this.type = js.native
  def add(elements: JQuery.Node): this.type = js.native
  def add(elements: js.Array[JQuery.Node]): this.type = js.native
  def add(selection: JQuery[Element]): this.type = js.native

  def addBack(): this.type = js.native
  def addBack(selector: JQuery.Selector): this.type = js.native

  def addClass(className: JQuery.TypeOrArray[String]): this.type = js.native
  def addClass(function: js.ThisFunction2[TElement, Int, String, String]): this.type = js.native

  def after(contents: ContentLike*): this.type = js.native
  def after(function: js.ThisFunction2[TElement, Int, String, ContentLike]): this.type = js.native

  def ajaxComplete(handler: js.ThisFunction3[Document, JQuery.TriggeredEvent[Document, Unit, Document, Document], JQuery.jqXHR, JQuery.AjaxSettings, Any]): this.type = js.native
  def ajaxComplete(handler: js.ThisFunction2[Document, JQuery.TriggeredEvent[Document, Unit, Document, Document], JQuery.jqXHR, Any]): this.type = js.native
  def ajaxComplete(handler: js.ThisFunction1[Document, JQuery.TriggeredEvent[Document, Unit, Document, Document], Any]): this.type = js.native
  def ajaxComplete(handler: js.ThisFunction0[Document, Any]): this.type = js.native
  def ajaxComplete(handler: js.Function0[Any]): this.type = js.native
  def ajaxComplete(handler: Boolean): this.type = js.native

  def ajaxError(handler: js.ThisFunction4[Document, JQuery.TriggeredEvent[Document, Unit, Document, Document], JQuery.jqXHR, JQuery.AjaxSettings, String, Any]): this.type = js.native
  def ajaxError(handler: js.ThisFunction3[Document, JQuery.TriggeredEvent[Document, Unit, Document, Document], JQuery.jqXHR, JQuery.AjaxSettings, Any]): this.type = js.native
  def ajaxError(handler: js.ThisFunction2[Document, JQuery.TriggeredEvent[Document, Unit, Document, Document], JQuery.jqXHR, Any]): this.type = js.native
  def ajaxError(handler: js.ThisFunction1[Document, JQuery.TriggeredEvent[Document, Unit, Document, Document], Any]): this.type = js.native
  def ajaxError(handler: js.ThisFunction0[Document, Any]): this.type = js.native
  def ajaxError(handler: js.Function0[Any]): this.type = js.native
  def ajaxError(handler: Boolean): this.type = js.native

  def ajaxSend(handler: js.ThisFunction3[Document, JQuery.TriggeredEvent[Document, Unit, Document, Document], JQuery.jqXHR, JQuery.AjaxSettings, Any]): this.type = js.native
  def ajaxSend(handler: js.ThisFunction2[Document, JQuery.TriggeredEvent[Document, Unit, Document, Document], JQuery.jqXHR, Any]): this.type = js.native
  def ajaxSend(handler: js.ThisFunction1[Document, JQuery.TriggeredEvent[Document, Unit, Document, Document], Any]): this.type = js.native
  def ajaxSend(handler: js.ThisFunction0[Document, Any]): this.type = js.native
  def ajaxSend(handler: js.Function0[Any]): this.type = js.native
  def ajaxSend(handler: Boolean): this.type = js.native

  def ajaxStart(handler: js.ThisFunction0[Document, Unit]): this.type = js.native
  def ajaxStart(handler: js.Function0[Unit]): this.type = js.native
  def ajaxStart(handler: Boolean): this.type = js.native

  def ajaxStop(handler: js.ThisFunction0[Document, Unit]): this.type = js.native
  def ajaxStop(handler: js.Function0[Unit]): this.type = js.native
  def ajaxStop(handler: Boolean): this.type = js.native

  def ajaxSuccess(handler: js.ThisFunction4[Document, JQuery.TriggeredEvent[Document, Unit, Document, Document], JQuery.jqXHR, JQuery.AjaxSettings, JQuery.PlainObject[js.Any], Any]): this.type = js.native
  def ajaxSuccess(handler: js.ThisFunction3[Document, JQuery.TriggeredEvent[Document, Unit, Document, Document], JQuery.jqXHR, JQuery.AjaxSettings, Any]): this.type = js.native
  def ajaxSuccess(handler: js.ThisFunction2[Document, JQuery.TriggeredEvent[Document, Unit, Document, Document], JQuery.jqXHR, Any]): this.type = js.native
  def ajaxSuccess(handler: js.ThisFunction1[Document, JQuery.TriggeredEvent[Document, Unit, Document, Document], Any]): this.type = js.native
  def ajaxSuccess(handler: js.ThisFunction0[Document, Any]): this.type = js.native
  def ajaxSuccess(handler: js.Function0[Any]): this.type = js.native
  def ajaxSuccess(handler: Boolean): this.type = js.native

  def animate(properties: JQuery.PlainObject[_], duration: JQuery.Duration, easing: String, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def animate(properties: JQuery.PlainObject[_], duration: JQuery.Duration, easing: String): this.type = js.native
  def animate(properties: JQuery.PlainObject[_], duration: JQuery.Duration, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def animate(properties: JQuery.PlainObject[_], duration: JQuery.Duration): this.type = js.native
  def animate(properties: JQuery.PlainObject[_], easing: String, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def animate(properties: JQuery.PlainObject[_], easing: String): this.type = js.native
  def animate(properties: JQuery.PlainObject[_], complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def animate(properties: JQuery.PlainObject[_], options: JQuery.EffectsOptions[TElement]): this.type = js.native
  def animate(properties: JQuery.PlainObject[_]): this.type = js.native

  def append(contents: ContentLike*): this.type = js.native
  def append(funсtion: js.ThisFunction2[TElement, Int, String, ContentLike]): this.type = js.native

  def appendTo(target: ToTarget): this.type = js.native

  def attr(attributeName: String, value: String | Double | Null): this.type = js.native
  def attr(attributeName: String, function: js.ThisFunction2[TElement, Int, String, String | Double | Null]): this.type = js.native
  def attr(attributes: JQuery.PlainObject[String | Double | Null]): this.type = js.native
  def attr(attributeName: String): js.UndefOr[String] = js.native

  def before(contents: ContentLike*): this.type = js.native
  def before(function: js.ThisFunction2[TElement, Int, String, ContentLike]): this.type = js.native

  @deprecated("Use on", "jQuery 3.0.0")
  def bind(eventType: String, eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  @deprecated("Use on", "jQuery 3.0.0")
  def bind(eventType: String, eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  @deprecated("Use on", "jQuery 3.0.0")
  def bind(eventType: String, eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  @deprecated("Use on", "jQuery 3.0.0")
  def bind(eventType: String, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  @deprecated("Use on", "jQuery 3.0.0")
  def bind(eventType: String, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  @deprecated("Use on", "jQuery 3.0.0")
  def bind(eventType: String, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  @deprecated("Use on", "jQuery 3.0.0")
  def bind(eventType: String, handler: js.UndefOr[Null]): this.type = js.native
  @deprecated("Use on", "jQuery 3.0.0")
  def bind(eventType: String, preventBubble: Boolean): this.type = js.native
  @deprecated("Use on", "jQuery 3.0.0")
  def bind(events: JQuery.TypeEventHandlers[TElement]): this.type = js.native

  def blur(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def blur(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def blur(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def blur(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def blur(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def blur(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def blur(handler: Boolean): this.type = js.native
  def blur(): this.type = js.native

  def change(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def change(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def change(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def change(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def change(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def change(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def change(handler: Boolean): this.type = js.native
  def change(): this.type = js.native

  def children(selector: JQuery.Selector): this.type = js.native
  def children(): this.type = js.native

  def clearQueue(queueName: String): this.type = js.native
  def clearQueue(): this.type = js.native

  def click(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def click(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def click(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def click(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def click(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def click(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def click(handler: Boolean): this.type = js.native
  def click(): this.type = js.native

  def clone(withDataAndEvents: Boolean, deepWithDataAndEvents: Boolean): this.type = js.native
  def clone(withDataAndEvents: Boolean): this.type = js.native
  override def clone(): this.type = js.native

  def closest(selector: JQuery.Selector, context: Element): this.type = js.native
  def closest(selector: JQuery.Selector): this.type = js.native
  def closest(selection: JQuery[Element]): this.type = js.native
  def closest(element: Element): this.type = js.native

  def contents(): JQuery[Element | Text | Comment | Document] = js.native

  def contextmenu(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def contextmenu(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def contextmenu(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def contextmenu(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def contextmenu(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def contextmenu(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native

  def contextmenu(handler: Boolean): this.type = js.native

  def contextmenu(): this.type = js.native

  def css(propertyName: String, value: js.UndefOr[String | Double]): this.type = js.native
  def css(propertyName: String, function: js.ThisFunction2[TElement, Int, String, js.UndefOr[String | Double]]): this.type = js.native
  def css(properties: JQuery.PlainObject[String | Double | js.ThisFunction2[TElement, Int, String, js.UndefOr[String | Double]]]): this.type = js.native
  def css(propertyName: String): String = js.native
  def css(propertyNames: js.Array[String]): JQuery.PlainObject[String] = js.native

  def data(obj: JQuery.PlainObject[js.Any]): this.type = js.native
  def data(key: String, value: js.Any): this.type = js.native
  def data(key: String): js.Dynamic = js.native
  def data(): JQuery.PlainObject[js.Any] = js.native

  def dblclick(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def dblclick(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def dblclick(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def dblclick(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def dblclick(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def dblclick(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def dblclick(handler: Boolean): this.type = js.native
  def dblclick(): this.type = js.native

  def delay(duration: JQuery.Duration, queueName: String): this.type = js.native
  def delay(duration: JQuery.Duration): this.type = js.native

  @deprecated("Use on", "jQuery 3.0.0")
  def delegate(selector: JQuery.Selector, eventType: String, eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  @deprecated("Use on", "jQuery 3.0.0")
  def delegate(selector: JQuery.Selector, eventType: String, eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  @deprecated("Use on", "jQuery 3.0.0")
  def delegate(selector: JQuery.Selector, eventType: String, eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  @deprecated("Use on", "jQuery 3.0.0")
  def delegate(selector: JQuery.Selector, eventType: String, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  @deprecated("Use on", "jQuery 3.0.0")
  def delegate(selector: JQuery.Selector, eventType: String, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  @deprecated("Use on", "jQuery 3.0.0")
  def delegate(selector: JQuery.Selector, eventType: String, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  @deprecated("Use on", "jQuery 3.0.0")
  def delegate(selector: JQuery.Selector, eventType: String, handler: Boolean): this.type = js.native
  @deprecated("Use on", "jQuery 3.0.0")
  def delegate(selector: JQuery.Selector, events: JQuery.TypeEventHandlers[TElement]): this.type = js.native

  def dequeue(queueName: String): this.type = js.native
  def dequeue(): this.type = js.native

  def detach(selector: JQuery.Selector): this.type = js.native
  def detach(): this.type = js.native

  def each(funсtion: js.Function2[Int, TElement, Unit]): this.type = js.native
  def each(funсtion: js.ThisFunction0[TElement, Unit]): this.type = js.native

  def empty(): this.type = js.native

  def end(): this.type = js.native

  def eq(index: Int): this.type = js.native

  def extend(obj: js.Object): this.type = js.native

  def fadeIn(duration: JQuery.Duration, easing: String, complete: js.ThisFunction0[TElement, Any]): this.type = js.native
  def fadeIn(duration: JQuery.Duration, easing: String, complete: js.Function0[Any]): this.type = js.native
  def fadeIn(duration: JQuery.Duration, easing: String): this.type = js.native
  def fadeIn(duration: JQuery.Duration, complete: js.ThisFunction0[TElement, Any]): this.type = js.native
  def fadeIn(duration: JQuery.Duration, complete: js.Function0[Any]): this.type = js.native
  def fadeIn(easing: String, complete: js.ThisFunction0[TElement, Any]): this.type = js.native
  def fadeIn(easing: String, complete: js.Function0[Any]): this.type = js.native
  def fadeIn(duration: JQuery.Duration): this.type = js.native
  def fadeIn(easing: String): this.type = js.native
  def fadeIn(complete: js.ThisFunction0[TElement, Any]): this.type = js.native
  def fadeIn(complete: js.Function0[Any]): this.type = js.native
  def fadeIn(options: JQuery.EffectsOptions[TElement]): this.type = js.native
  def fadeIn(): this.type = js.native

  def fadeOut(duration: JQuery.Duration, easing: String, complete: js.ThisFunction0[TElement, Any]): this.type = js.native
  def fadeOut(duration: JQuery.Duration, easing: String, complete: js.Function0[Any]): this.type = js.native
  def fadeOut(duration: JQuery.Duration, easing: String): this.type = js.native
  def fadeOut(duration: JQuery.Duration, complete: js.ThisFunction0[TElement, Any]): this.type = js.native
  def fadeOut(duration: JQuery.Duration, complete: js.Function0[Any]): this.type = js.native
  def fadeOut(easing: String, complete: js.ThisFunction0[TElement, Any]): this.type = js.native
  def fadeOut(easing: String, complete: js.Function0[Any]): this.type = js.native
  def fadeOut(duration: JQuery.Duration): this.type = js.native
  def fadeOut(easing: String): this.type = js.native
  def fadeOut(complete: js.ThisFunction0[TElement, Any]): this.type = js.native
  def fadeOut(complete: js.Function0[Any]): this.type = js.native
  def fadeOut(options: JQuery.EffectsOptions[TElement]): this.type = js.native
  def fadeOut(): this.type = js.native

  def fadeTo(duration: JQuery.Duration, opacity: Double, easing: String, complete: js.ThisFunction0[TElement, Any]): this.type = js.native
  def fadeTo(duration: JQuery.Duration, opacity: Double, easing: String, complete: js.Function0[Any]): this.type = js.native
  def fadeTo(duration: JQuery.Duration, opacity: Double, easing: String): this.type = js.native
  def fadeTo(duration: JQuery.Duration, opacity: Double, complete: js.ThisFunction0[TElement, Any]): this.type = js.native
  def fadeTo(duration: JQuery.Duration, opacity: Double, complete: js.Function0[Any]): this.type = js.native
  def fadeTo(duration: JQuery.Duration, opacity: Double): this.type = js.native

  def fadeToggle(duration: JQuery.Duration, easing: String, complete: js.ThisFunction0[TElement, Any]): this.type = js.native
  def fadeToggle(duration: JQuery.Duration, easing: String, complete: js.Function0[Any]): this.type = js.native
  def fadeToggle(duration: JQuery.Duration, easing: String): this.type = js.native
  def fadeToggle(duration: JQuery.Duration, complete: js.ThisFunction0[TElement, Any]): this.type = js.native
  def fadeToggle(duration: JQuery.Duration, complete: js.Function0[Any]): this.type = js.native
  def fadeToggle(easing: String, complete: js.ThisFunction0[TElement, Any]): this.type = js.native
  def fadeToggle(easing: String, complete: js.Function0[Any]): this.type = js.native
  def fadeToggle(duration: JQuery.Duration): this.type = js.native
  def fadeToggle(easing: String): this.type = js.native
  def fadeToggle(complete: js.ThisFunction0[TElement, Any]): this.type = js.native
  def fadeToggle(complete: js.Function0[Any]): this.type = js.native
  def fadeToggle(options: JQuery.EffectsOptions[TElement]): this.type = js.native
  def fadeToggle(): this.type = js.native

  def filter(selector: JQuery.Selector): this.type = js.native
  def filter(elements: JQuery.TypeOrArray[Element]): this.type = js.native
  def filter(function: js.Function2[Int, TElement, Boolean]): this.type = js.native
  def filter(function: js.ThisFunction0[TElement, Boolean]): this.type = js.native
  def filter(selection: JQuery[Element]): this.type = js.native

  def find(selector: JQuery.Selector): this.type = js.native
  def find(element: Element): this.type = js.native
  def find(element: JQuery[Element]): this.type = js.native

  def finish(): this.type = js.native
  def finish(queue: String): this.type = js.native

  def first(): this.type = js.native

  def focus(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def focus(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def focus(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def focus(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def focus(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def focus(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def focus(handler: Boolean): this.type = js.native
  def focus(): this.type = js.native

  def focusin(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def focusin(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def focusin(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def focusin(handler: Boolean): this.type = js.native
  def focusin(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def focusin(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def focusin(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def focusin(): this.type = js.native

  def focusout(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def focusout(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def focusout(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def focusout(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def focusout(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def focusout(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def focusout(handler: Boolean): this.type = js.native
  def focusout(): this.type = js.native

  @JSName("get") def getOrUndefined(index: Int): js.UndefOr[TElement] = js.native
  def get(index: Int): TElement = js.native
  def get(): js.Array[TElement] = js.native

  def has(selector: JQuery.Selector): this.type = js.native
  def has(contained: Element): this.type = js.native

  def hasClass(className: String): Boolean = js.native

  def height(value: String | Double): this.type = js.native
  def height(function: js.ThisFunction2[TElement, Int, Double, String | Double]): this.type = js.native
  def height(): Double = js.native

  def hide(duration: JQuery.Duration, easing: String, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def hide(duration: JQuery.Duration, easing: String): this.type = js.native
  def hide(duration: JQuery.Duration, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def hide(duration: JQuery.Duration): this.type = js.native
  def hide(complete: js.ThisFunction0[TElement, Unit] ): this.type = js.native
  def hide(options: JQuery.EffectsOptions[TElement]): this.type = js.native
  def hide(): this.type = js.native

  def hover(handlerIn: Boolean, handlerOut: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def hover(handlerIn: Boolean, handlerOut: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def hover(handlerIn: Boolean, handlerOut: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def hover(handlerIn: Boolean, handlerOut: Boolean): this.type = js.native
  def hover(handlerIn: JQuery.TypeEventHandler0[TElement], handlerOut: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def hover(handlerIn: JQuery.TypeEventHandler0[TElement], handlerOut: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def hover(handlerIn: JQuery.TypeEventHandler0[TElement], handlerOut: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def hover(handlerIn: JQuery.TypeEventHandler1[TElement], handlerOut: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def hover(handlerIn: JQuery.TypeEventHandler1[TElement], handlerOut: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def hover(handlerIn: JQuery.TypeEventHandler1[TElement], handlerOut: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def hover(handlerIn: JQuery.TypeEventHandler2[TElement], handlerOut: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def hover(handlerIn: JQuery.TypeEventHandler2[TElement], handlerOut: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def hover(handlerIn: JQuery.TypeEventHandler2[TElement], handlerOut: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def hover(handlerIn: JQuery.TypeEventHandler0[TElement], handlerOut: Boolean): this.type = js.native
  def hover(handlerIn: JQuery.TypeEventHandler1[TElement], handlerOut: Boolean): this.type = js.native
  def hover(handlerIn: JQuery.TypeEventHandler2[TElement], handlerOut: Boolean): this.type = js.native
  def hover(handlerInOut: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def hover(handlerInOut: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def hover(handlerInOut: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def hover(handlerInOut: Boolean): this.type = js.native

  def html(htmlString: JQuery.htmlString): this.type = js.native
  def html(node: JQuery.Node): this.type = js.native
  def html(function: js.ThisFunction2[TElement, Int, JQuery.htmlString, JQuery.htmlString | JQuery.Node]): this.type = js.native
  def html(): String = js.native

  def index(selector: JQuery.Selector): Int = js.native
  def index(element: Element | JQuery[Element]): Int = js.native
  def index(): Int = js.native

  def innerHeight(value: String | Double): this.type = js.native
  def innerHeight(function: js.ThisFunction2[TElement, Int, Double, String | Double]): this.type = js.native
  def innerHeight(): Double = js.native

  def innerWidth(value: String | Double): this.type = js.native
  def innerWidth(function: js.ThisFunction2[TElement, Int, Double, String | Double]): this.type = js.native
  def innerWidth(): Double = js.native

  def insertAfter(target: InsertTarget): this.type = js.native

  def insertBefore(target: InsertTarget): this.type = js.native

  def is(selector: JQuery.Selector): Boolean = js.native
  def is(function: js.Function2[Int, TElement, Boolean]): Boolean = js.native
  def is(function: js.ThisFunction1[TElement, Int, Boolean]): Boolean = js.native
  def is(function: js.ThisFunction0[TElement, Boolean]): Boolean = js.native
  def is(selection: JQuery[Element]): Boolean = js.native
  def is(elements: JQuery.TypeOrArray[Element]): Boolean = js.native

  def keydown(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def keydown(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def keydown(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def keydown(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def keydown(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def keydown(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def keydown(handler: Boolean): this.type = js.native
  def keydown(): this.type = js.native

  def keypress(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def keypress(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def keypress(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def keypress(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def keypress(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def keypress(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def keypress(handler: Boolean): this.type = js.native
  def keypress(): this.type = js.native

  def keyup(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def keyup(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def keyup(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def keyup(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def keyup(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def keyup(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def keyup(handler: Boolean): this.type = js.native
  def keyup(): this.type = js.native

  def last(): this.type = js.native

  def load(url: String, data: String | js.Object, complete: js.ThisFunction3[TElement, String, JQuery.Ajax.TextStatus, JQuery.jqXHR, Unit]): this.type = js.native
  def load(url: String, data: String | js.Object): this.type = js.native
  def load(url: String, complete: js.ThisFunction3[TElement, String, JQuery.Ajax.TextStatus, JQuery.jqXHR, Unit]): this.type = js.native
  def load(url: String): this.type = js.native

  def map[TReturn](callback: js.Function2[Int, TElement, JQuery.TypeOrArray[TReturn]]): JQuery[TReturn] = js.native
  def map[TReturn](callback: js.ThisFunction1[TElement, Int, JQuery.TypeOrArray[TReturn]]): JQuery[TReturn] = js.native
  def map[TReturn](callback: js.ThisFunction0[TElement, JQuery.TypeOrArray[TReturn]]): JQuery[TReturn] = js.native

  @JSName("map") def flatMap[TReturn](callback: js.Function2[Int, TElement, js.Array[TReturn]]): JQuery[TReturn] = js.native
  @JSName("map") def flatMap[TReturn](callback: js.ThisFunction1[TElement, Int, js.Array[TReturn]]): JQuery[TReturn] = js.native
  @JSName("map") def flatMap[TReturn](callback: js.ThisFunction0[TElement, js.Array[TReturn]]): JQuery[TReturn] = js.native

  def mousedown(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def mousedown(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def mousedown(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def mousedown(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def mousedown(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def mousedown(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def mousedown(handler: Boolean): this.type = js.native
  def mousedown(): this.type = js.native

  def mouseenter(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def mouseenter(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def mouseenter(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def mouseenter(handler: Boolean): this.type = js.native
  def mouseenter(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def mouseenter(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def mouseenter(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def mouseenter(): this.type = js.native

  def mouseleave(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def mouseleave(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def mouseleave(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def mouseleave(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def mouseleave(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def mouseleave(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def mouseleave(handler: Boolean): this.type = js.native
  def mouseleave(): this.type = js.native

  def mousemove(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def mousemove(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def mousemove(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def mousemove(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def mousemove(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def mousemove(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def mousemove(handler: Boolean): this.type = js.native
  def mousemove(): this.type = js.native

  def mouseout(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def mouseout(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def mouseout(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def mouseout(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def mouseout(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def mouseout(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def mouseout(handler: Boolean): this.type = js.native
  def mouseout(): this.type = js.native

  def mouseover(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def mouseover(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def mouseover(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def mouseover(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def mouseover(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def mouseover(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def mouseover(handler: Boolean): this.type = js.native
  def mouseover(): this.type = js.native

  def mouseup(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def mouseup(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def mouseup(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def mouseup(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def mouseup(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def mouseup(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def mouseup(handler: Boolean): this.type = js.native
  def mouseup(): this.type = js.native

  def next(): this.type = js.native
  def next(selector: JQuery.Selector): this.type = js.native

  def nextAll(): this.type = js.native
  def nextAll(selector: String): this.type = js.native

  def nextUntil(selector: JQuery.Selector, filter: JQuery.Selector): this.type = js.native
  def nextUntil(selector: JQuery.Selector): this.type = js.native
  def nextUntil(element: Element, filter: JQuery.Selector): this.type = js.native
  def nextUntil(element: Element): this.type = js.native
  def nextUntil(element: JQuery[Element], filter: JQuery.Selector): this.type = js.native
  def nextUntil(element: JQuery[Element]): this.type = js.native
  def nextUntil(): this.type = js.native

  def not(selector: JQuery.Selector): this.type = js.native
  def not(elements: JQuery.TypeOrArray[Element]): this.type = js.native
  def not(selection: JQuery[Element]): this.type = js.native
  def not(function: js.Function2[Int, TElement, Boolean]): this.type = js.native
  def not(function: js.ThisFunction1[TElement, Int, Boolean]): this.type = js.native
  def not(function: js.ThisFunction0[TElement,  Boolean]): this.type = js.native

  def off(events: String, selector: JQuery.Selector, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def off(events: String, selector: JQuery.Selector, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def off(events: String, selector: JQuery.Selector, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def off(events: String, selector: JQuery.Selector, handler: Boolean): this.type = js.native
  def off(events: String, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def off(events: String, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def off(events: String, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def off(events: String, handler: Boolean): this.type = js.native
  def off(events: String): this.type = js.native
  def off(event: JQuery.TriggeredEvent[TElement, js.Any, EventTarget, EventTarget]): this.type = js.native
  def off(): this.type = js.native
  @JSName("off") def offEvents(events: JQuery.TypeEventHandlers[TElement], selector: JQuery.Selector): this.type = js.native
  @JSName("off") def offEvents(events: JQuery.TypeEventHandlers[TElement]): this.type = js.native

  def offset(coordinates: JQuery.CoordinatesPartial): this.type = js.native
  def offset(function: js.ThisFunction2[TElement, Int, JQuery.Coordinates, JQuery.CoordinatesPartial]): this.type = js.native
  def offset(): JQuery.Coordinates = js.native

  def offsetParent(): this.type = js.native

  def on(events: String, selector: JQuery.Selector, data: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def on(events: String, selector: JQuery.Selector, data: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def on(events: String, selector: JQuery.Selector, data: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def on(events: String, selector: JQuery.Selector, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def on(events: String, selector: JQuery.Selector, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def on(events: String, selector: JQuery.Selector, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def on(events: String, selector: JQuery.Selector, handler: Boolean): this.type = js.native
  def on(events: String, data: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def on(events: String, data: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def on(events: String, data: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def on(events: String, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def on(events: String, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def on(events: String, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def on(events: String, handler: Boolean): this.type = js.native
  @JSName("on") def onEvents(events: JQuery.TypeEventHandlers[TElement], selector: JQuery.Selector, data: js.Any): this.type = js.native
  @JSName("on") def onEvents(events: JQuery.TypeEventHandlers[TElement], selector: JQuery.Selector): this.type = js.native
  @JSName("on") def onEvents(events: JQuery.TypeEventHandlers[TElement], data: js.Any): this.type = js.native
  @JSName("on") def onEvents(events: JQuery.TypeEventHandlers[TElement]): this.type = js.native

  def one(events: String, selector: JQuery.Selector, data: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def one(events: String, selector: JQuery.Selector, data: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def one(events: String, selector: JQuery.Selector, data: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def one(events: String, selector: JQuery.Selector, handler: JQuery.TypeEventHandler0[TElement] ): this.type = js.native
  def one(events: String, selector: JQuery.Selector, handler: JQuery.TypeEventHandler1[TElement] ): this.type = js.native
  def one(events: String, selector: JQuery.Selector, handler: JQuery.TypeEventHandler2[TElement] ): this.type = js.native
  def one(events: String, selector: JQuery.Selector, handler: Boolean): this.type = js.native
  def one(events: String, data: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def one(events: String, data: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def one(events: String, data: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def one(events: String, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def one(events: String, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def one(events: String, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def one(events: String, handler: Boolean): this.type = js.native
  def one(events: JQuery.TypeEventHandlers[TElement], selector: JQuery.Selector, data: js.Any): this.type = js.native
  def one(events: JQuery.TypeEventHandlers[TElement], selector: JQuery.Selector): this.type = js.native
  def one(events: JQuery.TypeEventHandlers[TElement], data: js.Any): this.type = js.native
  def one(events: JQuery.TypeEventHandlers[TElement]): this.type = js.native

  def outerHeight(value: String | Double, includeMargin: Boolean): this.type = js.native
  def outerHeight(value: String | Double): this.type = js.native
  def outerHeight(function: js.ThisFunction2[TElement, Int, Double, String | Double]): this.type = js.native
  def outerHeight(includeMargin: Boolean): js.UndefOr[Double] = js.native
  def outerHeight(): js.UndefOr[Double] = js.native

  def outerWidth(value_function: String | Double, includeMargin: Boolean): this.type = js.native
  def outerWidth(value_function: String | Double): this.type = js.native
  def outerWidth(function: js.ThisFunction2[TElement, Int, Double, String | Double]): this.type = js.native
  def outerWidth(includeMargin: Boolean): js.UndefOr[Double] = js.native
  def outerWidth(): js.UndefOr[Double] = js.native

  def parent(): this.type = js.native
  def parent(selector: JQuery.Selector): this.type = js.native

  def parents(): this.type = js.native
  def parents(selector: JQuery.Selector): this.type = js.native

  def parentsUntil(selector: JQuery.Selector, filter: JQuery.Selector): this.type = js.native
  def parentsUntil(selector: JQuery.Selector): this.type = js.native
  def parentsUntil(element: Element, filter: JQuery.Selector): this.type = js.native
  def parentsUntil(element: Element): this.type = js.native
  def parentsUntil(element: JQuery[Element], filter: JQuery.Selector): this.type = js.native
  def parentsUntil(element: JQuery[Element]): this.type = js.native
  def parentsUntil(): this.type = js.native

  def position(): JQuery.Coordinates = js.native

  def prepend(contents: ContentLike*): this.type = js.native
  def prepend(funсtion: js.ThisFunction2[TElement, Int,String, ContentLike]): this.type = js.native

  def prependTo(target: ToTarget): this.type = js.native

  def prev(selector: JQuery.Selector): this.type = js.native
  def prev(): this.type = js.native

  def prevAll(selector: JQuery.Selector): this.type = js.native
  def prevAll(): this.type = js.native

  def prevUntil(selector: JQuery.Selector, filter: JQuery.Selector): this.type = js.native
  def prevUntil(selector: JQuery.Selector): this.type = js.native
  def prevUntil(element: Element, filter: JQuery.Selector): this.type = js.native
  def prevUntil(element: Element): this.type = js.native
  def prevUntil(element: JQuery[Element], filter: JQuery.Selector): this.type = js.native
  def prevUntil(element: JQuery[Element]): this.type = js.native
  def prevUntil(): this.type = js.native

  def promise[T <: js.Object](`type`: String, target: T): T with JQuery.Promise[this.type, js.Any, js.Any] = js.native
  def promise[T <: js.Object](target: T): T with JQuery.Promise[this.type, js.Any, js.Any] = js.native
  def promise(`type`: String): JQuery.Promise[this.type, js.Any, js.Any] = js.native
  def promise(): JQuery.Promise[this.type, js.Any, js.Any] = js.native

  def prop(propertyName: String, value: String | Double | Boolean | js.Object | Null): this.type = js.native
  def prop(propertyName: String, function: js.ThisFunction2[TElement, Int, js.UndefOr[String | Double | Boolean | js.Object | Null], js.Any]): this.type = js.native
  def prop(properties: JQuery.PlainObject[_]): this.type = js.native
  def prop(propertyName: String): js.UndefOr[String | Double | Boolean | js.Object | Null] = js.native

  def pushStack(elements: ArrayLike[Element], name: String, args: js.Array[_]): this.type = js.native
  def pushStack(elements: ArrayLike[Element]): this.type = js.native

  def queue(queueName: String, newQueue: JQuery.TypeOrArray[JQuery.QueueFunction[TElement]]): this.type = js.native
  def queue(newQueue: JQuery.TypeOrArray[JQuery.QueueFunction[TElement]]): this.type = js.native
  def queue(queueName: String): JQuery.Queue[Node] = js.native
  def queue(): JQuery.Queue[Node] = js.native

  def ready(handler: js.Function1[JQueryStatic, Unit]): this.type = js.native

  def remove(selector: String): this.type = js.native
  def remove(): this.type = js.native

  def removeAttr(attributeName: String): this.type = js.native

  def removeClass(className: JQuery.TypeOrArray[String]): this.type = js.native
  def removeClass(function: js.ThisFunction2[TElement, Int, String, String] ): this.type = js.native
  def removeClass( ): this.type = js.native

  def removeData(name: JQuery.TypeOrArray[String]): this.type = js.native
  def removeData(): this.type = js.native

  def removeProp(propertyName: String): this.type = js.native

  def replaceAll(target: JQuery.Selector | JQuery[Element] | JQuery.TypeOrArray[Element]): this.type = js.native

  def replaceWith(newContent: JQuery.htmlString): this.type = js.native
  def replaceWith(newContent: JQuery[JQuery.Node]): this.type = js.native
  def replaceWith(newContent: Element): this.type = js.native
  def replaceWith(newContent: js.Array[Element]): this.type = js.native
  def replaceWith(newContent: JQuery.Node): this.type = js.native
  def replaceWith(function: js.ThisFunction2[TElement, Int,JQuery.htmlString, JQuery.htmlString | JQuery[JQuery.Node] | JQuery.TypeOrArray[Element] | JQuery.Node]): this.type = js.native

  def resize(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def resize(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def resize(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def resize(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def resize(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def resize(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def resize(handler: Boolean): this.type = js.native
  def resize(): this.type = js.native

  def scroll(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def scroll(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def scroll(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def scroll(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def scroll(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def scroll(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def scroll(handler: Boolean): this.type = js.native
  def scroll(): this.type = js.native

  def scrollLeft(value: Double): this.type = js.native
  def scrollLeft(): Double = js.native

  def scrollTop(value: Double): this.type = js.native
  def scrollTop(): Double = js.native

  def select(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def select(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def select(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def select(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def select(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def select(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def select(handler: Boolean): this.type = js.native
  def select(): this.type = js.native

  def serialize(): String = js.native

  def serializeArray(): js.Array[JQuery.NameValuePair] = js.native

  def show(duration: JQuery.Duration, easing: String, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def show(duration: JQuery.Duration, easing: String): this.type = js.native
  def show(duration: JQuery.Duration, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def show(duration: JQuery.Duration): this.type = js.native
  def show(complete: js.ThisFunction0[TElement, Unit] ): this.type = js.native
  def show(options: JQuery.EffectsOptions[TElement]): this.type = js.native
  def show(): this.type = js.native

  def siblings(selector: JQuery.Selector): this.type = js.native
  def siblings(): this.type = js.native

  def slice(start: Int, end: Int): this.type = js.native
  def slice(start: Int): this.type = js.native

  def slideDown(duration: JQuery.Duration, easing: String, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def slideDown(duration: JQuery.Duration, easing: String): this.type = js.native
  def slideDown(duration: JQuery.Duration, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def slideDown(easing:  String, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def slideDown(duration: JQuery.Duration): this.type = js.native
  def slideDown(easing: String): this.type = js.native
  def slideDown(complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def slideDown(options: JQuery.EffectsOptions[TElement]): this.type = js.native
  def slideDown(): this.type = js.native

  def slideToggle(duration: JQuery.Duration, easing: String, complete: js.ThisFunction0[TElement, Unit] ): this.type = js.native
  def slideToggle(duration: JQuery.Duration, easing: String): this.type = js.native
  def slideToggle(duration: JQuery.Duration, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def slideToggle(easing: String, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def slideToggle(duration: JQuery.Duration): this.type = js.native
  def slideToggle(easing: String): this.type = js.native
  def slideToggle(complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def slideToggle(options: JQuery.EffectsOptions[TElement]): this.type = js.native
  def slideToggle(): this.type = js.native

  def slideUp(duration: JQuery.Duration, easing: String, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def slideUp(duration: JQuery.Duration, easing: String): this.type = js.native
  def slideUp(duration: JQuery.Duration, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def slideUp(easing: String, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def slideUp(duration: JQuery.Duration): this.type = js.native
  def slideUp(easing: String): this.type = js.native
  def slideUp(complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def slideUp(options: JQuery.EffectsOptions[TElement]): this.type = js.native
  def slideUp(): this.type = js.native

  def stop(queue: String, clearQueue: Boolean, jumpToEnd: Boolean): this.type = js.native
  def stop(queue: String, clearQueue: Boolean): this.type = js.native
  def stop(queue: String): this.type = js.native
  def stop(clearQueue: Boolean, jumpToEnd: Boolean): this.type = js.native
  def stop(clearQueue: Boolean): this.type = js.native
  def stop(): this.type = js.native

  def submit(eventData: js.Any, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def submit(eventData: js.Any, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def submit(eventData: js.Any, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def submit(handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  def submit(handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  def submit(handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  def submit(handler: Boolean): this.type = js.native
  def submit(): this.type = js.native

  def text(text: String | Double | Boolean): this.type = js.native
  def text(function: js.ThisFunction2[TElement, Int, String, String | Double | Boolean]): this.type = js.native
  def text(): String = js.native

  def toArray(): js.Array[TElement] = js.native

  def toggle(duration: JQuery.Duration, easing: String, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def toggle(duration: JQuery.Duration, easing: String): this.type = js.native
  def toggle(duration: JQuery.Duration, complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def toggle(duration: JQuery.Duration): this.type = js.native
  def toggle(complete: js.ThisFunction0[TElement, Unit]): this.type = js.native
  def toggle(options: JQuery.EffectsOptions[TElement]): this.type = js.native
  def toggle(display: Boolean): this.type = js.native

  def toggle(): this.type = js.native

  def toggleClass(function: js.ThisFunction3[TElement, Int, String, Boolean, String], state: Boolean): this.type = js.native
  def toggleClass(function: js.ThisFunction3[TElement, Int, String, Boolean, String]): this.type = js.native
  def toggleClass(className: String): this.type = js.native
  def toggleClass(state: Boolean): this.type = js.native
  def toggleClass(): this.type = js.native

  def trigger(eventType: String, extraParameters: js.Array[js.Any] | JQuery.PlainObject[js.Any]): this.type = js.native
  def trigger(eventType: String): this.type = js.native
  def trigger(event: JQuery.Event, extraParameters: js.Array[js.Any] | JQuery.PlainObject[js.Any]): this.type = js.native
  def trigger(event: JQuery.Event): this.type = js.native

  def triggerHandler(eventType: String, extraParameters: js.Array[js.Any] | JQuery.PlainObject[js.Any]): js.Dynamic = js.native
  def triggerHandler(eventType: String): js.Dynamic = js.native
  def triggerHandler(event: JQuery.Event, extraParameters: js.Array[js.Any] | JQuery.PlainObject[js.Any]): js.Dynamic = js.native
  def triggerHandler(event: JQuery.Event): js.Dynamic = js.native

  @deprecated("Use off", "jQuery 3.0.0")
  def unbind(event: String, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  @deprecated("Use off", "jQuery 3.0.0")
  def unbind(event: String, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  @deprecated("Use off", "jQuery 3.0.0")
  def unbind(event: String, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  @deprecated("Use off", "jQuery 3.0.0")
  def unbind(event: String, handler: Boolean): this.type = js.native
  @deprecated("Use off", "jQuery 3.0.0")
  def unbind(event: String): this.type = js.native
  @deprecated("Use off", "jQuery 3.0.0")
  def unbind(event: JQuery.TriggeredEvent[TElement, js.Any, EventTarget, EventTarget]): this.type = js.native
  @deprecated("Use off", "jQuery 3.0.0")
  def unbind(): this.type = js.native

  @deprecated("Use off", "jQuery 3.0.0")
  def undelegate(selector: JQuery.Selector, eventType: String, handler: JQuery.TypeEventHandler0[TElement]): this.type = js.native
  @deprecated("Use off", "jQuery 3.0.0")
  def undelegate(selector: JQuery.Selector, eventType: String, handler: JQuery.TypeEventHandler1[TElement]): this.type = js.native
  @deprecated("Use off", "jQuery 3.0.0")
  def undelegate(selector: JQuery.Selector, eventType: String, handler: JQuery.TypeEventHandler2[TElement]): this.type = js.native
  @deprecated("Use off", "jQuery 3.0.0")
  def undelegate(selector: JQuery.Selector, eventType: String, handler: Boolean): this.type = js.native
  @deprecated("Use off", "jQuery 3.0.0")
  def undelegate(selector: JQuery.Selector, eventType: String): this.type = js.native
  @deprecated("Use off", "jQuery 3.0.0")
  def undelegate(selector: JQuery.Selector, events: JQuery.TypeEventHandlers[TElement]): this.type = js.native
  @deprecated("Use off", "jQuery 3.0.0")
  def undelegate(namespace: String): this.type = js.native
  @deprecated("Use off", "jQuery 3.0.0")
  def undelegate(): this.type = js.native

  def unwrap(selector: JQuery.Selector): this.type = js.native
  def unwrap(): this.type = js.native

  def `val`(value: String | Double | js.Array[String]): this.type = js.native
  def `val`(function: js.ThisFunction2[TElement, Int, String, String]): this.type = js.native
  def `val`(): js.UndefOr[String | Double | js.Array[String]] = js.native
  @JSName("val") def value(value: String | Double | js.Array[String]): this.type = js.native
  @JSName("val") def value(function: js.ThisFunction2[TElement, Int, String, String]): this.type = js.native
  @JSName("val") def value(): js.UndefOr[String | Double | js.Array[String]] = js.native

  def width(function: js.ThisFunction2[TElement, Int, Double, String | Double]): this.type = js.native
  def width(value: String | Double): this.type = js.native
  def width(): Double = js.native

  def wrap(wrappingElement: JQuery.Selector | JQuery.htmlString | Element | JQuery[Element]): this.type = js.native
  def wrap(function: js.ThisFunction1[TElement, Int, String | JQuery[Element]]): this.type = js.native

  def wrapAll(wrappingElement: JQuery.Selector | JQuery.htmlString | Element | JQuery[Element]): this.type = js.native
  def wrapAll(function: js.ThisFunction0[TElement, String | JQuery[Element]]): this.type = js.native

  def wrapInner(wrappingElement: JQuery.Selector | JQuery.htmlString | Element | JQuery[Element]): this.type = js.native
  def wrapInner(function: js.ThisFunction1[TElement, Int, String | JQuery[Element] | Element]): this.type = js.native

  @JSBracketAccess
  def apply(n: Int): TElement = js.native

  @JSBracketAccess
  def update(n: Int, v: TElement): Unit = js.native
}


object JQuery {
  type _Falsy = Boolean | Null | Unit | Int | String
  type AnimationHook[TElement] = js.Function1[Tween[TElement], Unit]
  type CSSHooks = js.Dictionary[CSSHook]
  type Duration = Double | String
  type EasingMethod = js.Function1[Double, Double]
  type Easings = js.Dictionary[EasingMethod]
  type htmlString = String
  type Node = Element | Text | Comment | DocumentFragment
  type PlainObject[T] = js.Dictionary[T]
  type PropHooks = js.Dictionary[PropHook[Node]]
  type Queue[TElement] = js.Array[QueueFunction[TElement]]
  type QueueFunction[TElement] = js.ThisFunction1[TElement, js.Function0[Unit], Unit]
  type Selector = String
  type SpecialEventHooks = js.Dictionary[SpecialEventHook[EventTarget, _]]
  type Thenable[T] = js.Thenable[T]
  type Tweener[TElement] = js.ThisFunction2[Animation[TElement], String, Double, Tween[TElement]]
  type TypeOrArray[T] = T | js.Array[T]
  type ValHooks = js.Dictionary[ValHook]

  type EventHandler[TCurrentTarget, TData] = js.ThisFunction1[TCurrentTarget, TriggeredEvent[TCurrentTarget, TData, EventTarget, EventTarget], Any]
  type TypeEventHandler1[TCurrentTarget] = js.Function1[TriggeredEvent[TCurrentTarget, Unit, EventTarget, EventTarget], Any]
  type TypeEventHandler2[TCurrentTarget] = js.ThisFunction1[TCurrentTarget, TriggeredEvent[TCurrentTarget, Unit, EventTarget, EventTarget], Any]
  type TypeEventHandler0[TCurrentTarget] = js.Function0[Any]
  type TypeEventHandlers[TCurrentTarget] = js.Dictionary[TypeEventHandler1[TCurrentTarget] | TypeEventHandler0[TCurrentTarget] | TypeEventHandler2[TCurrentTarget] | Boolean]

  trait PropHook[TElement] extends js.Object {
    var get: js.UndefOr[js.Function1[Tween[TElement], js.Any]] = js.undefined
    var set: js.UndefOr[js.Function1[Tween[TElement], Unit]] = js.undefined
  }

  @js.native
  trait Callbacks extends js.Object {
    def add(callback: TypeOrArray[js.Function], callbacks: TypeOrArray[js.Function]*): this.type = js.native

    def disable(): this.type = js.native

    def disabled(): Boolean = js.native

    def empty(): this.type = js.native

    def fire(args: js.Any*): this.type = js.native

    def fired(): Boolean = js.native

    def fireWith(context: js.Object, args: ArrayLike[js.Any]): this.type = js.native
    def fireWith(context: js.Object): this.type = js.native

    def has(): Boolean = js.native
    def has(callback: js.Function): Boolean = js.native

    def lock(): this.type = js.native

    def locked(): Boolean = js.native

    def remove(callbacks: js.Function*): this.type = js.native
  }

  @js.native
  trait Animation[TElement] extends Promise3[Animation[TElement], Animation[TElement], Animation[TElement], Boolean | Unit, Boolean, Double, Nothing, Nothing, Double] {
    var duration: Double = js.native
    var elem: TElement = js.native
    var props: PlainObject[js.Any] = js.native
    var opts: EffectsOptions[TElement] = js.native
    var originalProps: PlainObject[js.Any] = js.native
    var originalOpts: EffectsOptions[TElement] = js.native
    var startTime: Double = js.native
    var tweens: js.Array[Tween[TElement]] = js.native

    def createTween(propName: String, finalValue: Double): Tween[TElement] = js.native

    def stop(gotoEnd: Boolean): this.type = js.native
  }

  @js.native
  trait EventStatic extends js.Object {
    def apply[T <: js.Object](event: String, properties: T): Event with T = js.native
    def apply(event: String): Event = js.native
  }

  @js.native
  trait EventExtensions extends js.Object {
    var special: SpecialEventHooks = js.native
  }

  @js.native
  trait Effects extends js.Object {
    @deprecated("No longer needed in browsers that supports requestAnimationFrame", "jQuery 3.0.0")
    var interval: Double = js.native
    var off: Boolean = js.native
    var step: PlainObject[AnimationHook[Node]] = js.native

    def stop(): Unit = js.native

    def tick(): Unit = js.native

    def timer(tickFunction: TickFunction[js.Any]): Unit = js.native
  }

  @js.native
  trait TickFunction[TElement] extends js.Object {
    var anim: Animation[TElement] = js.native
    var elem: TElement = js.native
    var queue: Boolean | String = js.native

    def apply(): js.Dynamic = js.native
  }

  @js.native
  trait HandleObject[TTarget, TData] extends js.Object {
    def `type`: String = js.native

    def origType: String = js.native

    def namespace: String = js.native

    def selector: String | Unit | Null = js.native

    def data: TData = js.native

    def handler: EventHandler[TTarget, TData] = js.native
  }

  trait SpecialEventHook[TTarget, TData] extends js.Object {
    var noBubble: js.UndefOr[Boolean] = js.undefined
    var bindType: js.UndefOr[String] = js.undefined
    var delegateType: js.UndefOr[String] = js.undefined
    var preDispatch: js.UndefOr[js.ThisFunction1[TTarget, Event, Unit]] = js.undefined
    var postDispatch: js.UndefOr[js.ThisFunction1[TTarget, Event, Unit]] = js.undefined
    var setup: js.UndefOr[js.ThisFunction3[TTarget, TData, String, EventHandler[TTarget, TData], Unit]] = js.undefined
    var teardown: js.UndefOr[js.ThisFunction0[TTarget, Unit]] = js.undefined
    var add: js.UndefOr[js.ThisFunction1[TTarget, HandleObject[TTarget, TData], Unit]] = js.undefined
    var remove: js.UndefOr[js.ThisFunction1[TTarget, HandleObject[TTarget, TData], Unit]] = js.undefined
    var trigger: js.UndefOr[js.ThisFunction2[TTarget, Event, TData, Unit]] = js.undefined
    var _default: js.UndefOr[js.Function2[TriggeredEvent[TTarget, TData, EventTarget, EventTarget], TData, Unit]] = js.undefined
    var handle: js.UndefOr[js.ThisFunction2[TTarget, TriggeredEvent[TTarget, TData, EventTarget, EventTarget] with HasHandleObj[TTarget,TData], js.Any, Unit]] = js.undefined
  }

  trait HasHandleObj[TTarget,TData] extends js.Object {
     var handleObj: HandleObject[TTarget,TData]
  }

  trait CSSHook extends js.Object {
    var get: js.UndefOr[js.Function3[Element, js.Any, js.Any, Unit]] = js.undefined
    var set: js.UndefOr[js.Function3[Element, js.Any, js.Any, Unit]] = js.undefined
  }

  trait ValHook extends js.Object {
    var get: js.UndefOr[js.Function1[Element, js.Any]] = js.undefined
    var set: js.UndefOr[js.Function2[Element, js.Any, Unit]] = js.undefined
  }

  @js.native
  trait TweenStatic extends js.Object {
    var propHooks: PropHooks = js.native

    def apply[TElement](elem: TElement, options: EffectsOptions[TElement], prop: String, end: Double, easing: String, unit: String): Tween[TElement] = js.native
    def apply[TElement](elem: TElement, options: EffectsOptions[TElement], prop: String, end: Double, easing: String): Tween[TElement] = js.native
    def apply[TElement](elem: TElement, options: EffectsOptions[TElement], prop: String, end: Double): Tween[TElement] = js.native
  }

  @js.native
  trait Tween[TElement] extends js.Object {
    var easing: String = js.native
    var elem: TElement = js.native
    var end: Double = js.native
    var now: Double = js.native
    var options: EffectsOptions[TElement] = js.native
    var pos: js.UndefOr[Double] = js.native
    var prop: String = js.native
    var start: Double = js.native
    var unit: String = js.native

    def cur(): js.Dynamic = js.native

    def run(progress: Double): this.type = js.native
  }

  @js.native
  trait AnimationStatic extends js.Object {
    def apply[TElement](element: TElement, props: PlainObject[js.Any], opts: EffectsOptions[TElement]): Animation[TElement] = js.native

    def prefilter[TElement](callback: js.ThisFunction3[Animation[TElement], TElement, PlainObject[_], EffectsOptions[TElement], Animation[TElement] | _Falsy | Unit], prepend: Boolean): Unit = js.native
    def prefilter[TElement](callback: js.ThisFunction3[Animation[TElement], TElement, PlainObject[_], EffectsOptions[TElement], Animation[TElement] | _Falsy | Unit]): Unit = js.native

    def tweener(props: String, callback: Tweener[js.Any]): Unit = js.native
  }

  @js.native
  trait PickXMLHttpRequest extends js.Object {
    var onabort: js.UndefOr[js.Function1[js.Any, _]] = js.native
    var onerror: js.UndefOr[js.Function1[ErrorEvent, _]] = js.native
    var onload: js.UndefOr[js.Function1[Event, _]] = js.native
    var onloadend: js.UndefOr[js.Function1[ProgressEvent, _]] = js.native
    var onloadstart: js.UndefOr[js.Function1[js.Any, _]] = js.native
    var onprogress: js.UndefOr[js.Function1[ProgressEvent, _]] = js.native
    var onreadystatechange: js.UndefOr[js.Function1[Event, _]] = js.native
    var ontimeout: js.UndefOr[js.Function1[Event, _]] = js.native
    var responseType: js.UndefOr[String] = js.native
    var timeout: js.UndefOr[Double] = js.native
    var upload: js.UndefOr[XMLHttpRequestEventTarget] = js.native
    var withCredentials: js.UndefOr[Boolean] = js.native

    var readyState: js.UndefOr[_] = js.native
    var responseXML: js.UndefOr[_] = js.native
    var responseText: js.UndefOr[_] = js.native
    var status: js.UndefOr[Int] = js.native
    var statusText: js.UndefOr[String] = js.native
  }

  @js.native
  trait jqXHR extends Promise3[js.Any, jqXHR, Nothing, Ajax.SuccessTextStatus, Ajax.ErrorTextStatus, Nothing, jqXHR, String, Nothing] with PickXMLHttpRequest {
    var responseJSON: js.UndefOr[js.Any] = js.native

    def abort(statusText: String): this.type = js.native
    def abort(): this.type = js.native

    def statusCode(map: Ajax.StatusCodeCallbacks): this.type = js.native

    def overrideMimeType(): this.type = js.native

    def getAllResponseHeaders(): String = js.native
    def getResponseHeader(name: String): String = js.native
    def setRequestHeader(name: String, value: String): Unit = js.native
  }

  object jqXHR {
    type DoneCallback[TResolve] = Deferred.Callback3[TResolve, Ajax.SuccessTextStatus, jqXHR]
    type FailCallback[TjqXHR] = Deferred.Callback3[TjqXHR, Ajax.ErrorTextStatus, String]
    type AlwaysCallback[TResolve] = Deferred.Callback3[TResolve | jqXHR, Ajax.TextStatus, jqXHR | String]
  }

  @js.native
  trait SpeedSettings[TElement] extends js.Object {
    var duration: js.UndefOr[Duration] = js.native
    var easing: js.UndefOr[String] = js.native

    def complete(`this`: TElement): Unit = js.native
  }

  trait AjaxSettings extends js.Object {
    var accepts: js.UndefOr[PlainObject[String]] = js.undefined
    var async: js.UndefOr[Boolean] = js.undefined
    var beforeSend: js.UndefOr[js.ThisFunction2[js.Any, jqXHR, this.type, Boolean]] = js.undefined
    var cache: js.UndefOr[Boolean] = js.undefined
    var complete: js.UndefOr[TypeOrArray[CompleteCallback]] = js.undefined
    var contents: js.UndefOr[PlainObject[js.RegExp]] = js.undefined
    var contentType: js.UndefOr[String | Boolean] = js.undefined
    var context: js.UndefOr[js.Any] = js.undefined
    var converters: js.UndefOr[PlainObject[js.Function1[js.Any, Any] | Boolean]] = js.undefined
    var crossDomain: js.UndefOr[Boolean] = js.undefined
    var data: js.UndefOr[PlainObject[js.Any] | String] = js.undefined
    var dataFilter: js.UndefOr[js.Function2[String, String, js.Any]] = js.undefined
    var dataType: js.UndefOr[String] = js.undefined
    var error: js.UndefOr[TypeOrArray[ErrorCallback]] = js.undefined
    var global: js.UndefOr[Boolean] = js.undefined
    var headers: js.UndefOr[PlainObject[String | Null | Unit]] = js.undefined
    var ifModified: js.UndefOr[Boolean] = js.undefined
    var isLocal: js.UndefOr[Boolean] = js.undefined
    var jsonp: js.UndefOr[String | Boolean] = js.undefined
    var jsonpCallback: js.UndefOr[String | js.Function0[String]] = js.undefined
    var method: js.UndefOr[String] = js.undefined
    var mimeType: js.UndefOr[String] = js.undefined
    var password: js.UndefOr[String] = js.undefined
    var processData: js.UndefOr[Boolean] = js.undefined
    var scriptCharset: js.UndefOr[String] = js.undefined
    var statusCode: js.UndefOr[StatusCodeCallbacks] = js.undefined
    var success: js.UndefOr[TypeOrArray[SuccessCallback]] = js.undefined
    var timeout: js.UndefOr[Double] = js.undefined
    var traditional: js.UndefOr[Boolean] = js.undefined
    var `type`: js.UndefOr[String] = js.undefined
    var url: js.UndefOr[String] = js.undefined
    var username: js.UndefOr[String] = js.undefined
    var xhr: js.UndefOr[js.Function0[XMLHttpRequest]] = js.undefined
    var xhrFields: js.UndefOr[XHRFields] = js.undefined
  }

  object Ajax {
    type SuccessTextStatus = String
    type ErrorTextStatus = String
    type TextStatus = SuccessTextStatus | ErrorTextStatus
    type SuccessCallback = js.Function3[js.Any, SuccessTextStatus, jqXHR, Unit]
    type ErrorCallback = js.Function3[jqXHR, ErrorTextStatus, String, Unit]
    type CompleteCallback = js.Function2[jqXHR, TextStatus, Unit]
    type StatusCodeCallbacks = js.Dictionary[SuccessCallback | SuccessCallback]
  }

  @js.native
  trait XHRFields extends PickXMLHttpRequest {
    var msCaching: js.UndefOr[String] = js.native
  }

  trait NameValuePair extends js.Object {
    var name: String
    var value: js.UndefOr[String] = js.undefined
  }

  type Promise3[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN] = PromiseBase[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, Nothing, Nothing, Nothing]
  type Promise2[TR, TJ, TN, UR, UJ, UN] = Promise3[TR, TJ, TN, UR, UJ, UN, Nothing, Nothing, Nothing]

  @js.native
  trait Promise[TR, TJ, TN] extends PromiseBase[TR, TJ, TN, TR, TJ, TN, TR, TJ, TN, TR, TJ, TN] {
  }

  @js.native
  trait PromiseBase[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN] extends js.Promise[TR] {

    def always(alwaysCallback: TypeOrArray[Deferred.CallbackBase[TR | TJ, UR | UJ, VR | VJ, SR | SJ]], alwaysCallbacks: TypeOrArray[Deferred.CallbackBase[TR | TJ, UR | UJ, VR | VJ, SR | SJ]]*): this.type = js.native

    def done(doneCallback: TypeOrArray[Deferred.CallbackBase[TR, UR, VR, SR]], doneCallbacks: TypeOrArray[Deferred.CallbackBase[TR, UR, VR, SR]]*): this.type = js.native

    def fail(failCallback: TypeOrArray[Deferred.CallbackBase[TJ, UJ, VJ, SJ]], failCallbacks: TypeOrArray[Deferred.CallbackBase[TJ, UJ, VJ, SJ]]*): this.type = js.native

    def progress(progressCallback: TypeOrArray[Deferred.CallbackBase[TN, UN, VN, SN]], progressCallbacks: TypeOrArray[Deferred.CallbackBase[TN, UN, VN, SN]]*): this.type = js.native

    def promise[TTarget <: js.Object](target: TTarget): this.type with TTarget = js.native

    def promise(): this.type = js.native

    def state(): String = js.native

    @deprecated("Use then and fail", "jQuery 1.8")
    def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](doneFilter: js.Function3[TR,UR,VR, PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]], failFilter: js.Function3[TJ,UJ,VJ,PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]], progressFilter: js.Function3[TN,UN,VN,PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]]): PromiseBase[ARD | ARF | ARP, AJD | AJF | AJP, AND | ANF | ANP, BRD | BRF | BRP, BJD | BJF | BJP, BND | BNF | BNP, CRD | CRF | CRP, CJD | CJF | CJP, CND | CNF | CNP, RRD | RRF | RRP, RJD | RJF | RJP, RND | RNF | RNP] = js.native

    @deprecated("Use then and fail", "jQuery 1.8")
    def pipe[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](doneFilter: Null, failFilter: js.Function3[TJ,UJ,VJ,PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]], progressFilter: js.Function3[TN,UN,VN,PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]]): PromiseBase[ARF | ARP, AJF | AJP, ANF | ANP, BRF | BRP, BJF | BJP, BNF | BNP, CRF | CRP, CJF | CJP, CNF | CNP, RRF | RRP, RJF | RJP, RNF | RNP] = js.native

    def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](doneFilter: js.Function3[TR,UR,VR, PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]], failFilter: Null, progressFilter: js.Function3[TN,UN,VN,PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]]): PromiseBase[ARD | ARP, AJD | AJP, AND | ANP, BRD | BRP, BJD | BJP, BND | BNP, CRD | CRP, CJD | CJP, CND | CNP, RRD | RRP, RJD | RJP, RND | RNP] = js.native

    def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](doneFilter: js.Function3[TR,UR,VR, PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]], failFilter: js.Function3[TJ,UJ,VJ,PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]]): PromiseBase[ARD | ARF, AJD | AJF, AND | ANF, BRD | BRF, BJD | BJF, BND | BNF, CRD | CRF, CJD | CJF, CND | CNF, RRD | RRF, RJD | RJF, RND | RNF] = js.native

    def pipe[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](doneFilter: Null, failFilter: Null, progressFilter: js.Function3[TN,UN,VN,PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]]): PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP] = js.native

    def pipe[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](doneFilter: Null, failFilter: Null): PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP] = js.native

    def pipe[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](doneFilter: Null, failFilter: js.Function3[TJ,UJ,VJ,PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]]): PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF] = js.native

    def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND](doneFilter: js.Function3[TR,UR,VR, PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]]): PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND] = js.native

    def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](doneFilter: js.Function3[TR,UR,VR,PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND] | Thenable[ARD] | ARD], failFilter: js.Function3[TJ,UJ,VJ,PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF] | Thenable[ARF] | ARF], progressFilter: js.Function3[TN,UN,VN,PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP] | Thenable[ANP] | ANP]): PromiseBase[ARD | ARF | ARP, AJD | AJF | AJP, AND | ANF | ANP, BRD | BRF | BRP, BJD | BJF | BJP, BND | BNF | BNP, CRD | CRF | CRP, CJD | CJF | CJP, CND | CNF | CNP, RRD | RRF | RRP, RJD | RJF | RJP, RND | RNF | RNP] = js.native

    def `then`[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](doneFilter: Null, failFilter: js.Function3[TJ,UJ,VJ,PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF] | Thenable[ARF] | ARF], progressFilter: js.Function3[TN,UN,VN,PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP] | Thenable[ANP] | ANP]): PromiseBase[ARF | ARP, AJF | AJP, ANF | ANP, BRF | BRP, BJF | BJP, BNF | BNP, CRF | CRP, CJF | CJP, CNF | CNP, RRF | RRP, RJF | RJP, RNF | RNP] = js.native

    def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](doneFilter: js.Function3[TR,UR,VR,PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]], failFilter: Null, progressFilter: js.Function3[TN,UN,VN,PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP] | Thenable[ANP] | ANP]): PromiseBase[ARD | ARP, AJD | AJP, AND | ANP, BRD | BRP, BJD | BJP, BND | BNP, CRD | CRP, CJD | CJP, CND | CNP, RRD | RRP, RJD | RJP, RND | RNP] = js.native

    def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](doneFilter: js.Function3[TR,UR,VR,PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]], failFilter: js.Function3[TJ,UJ,VJ,PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF] | Thenable[ARF] | ARF]): PromiseBase[ARD | ARF, AJD | AJF, AND | ANF, BRD | BRF, BJD | BJF, BND | BNF, CRD | CRF, CJD | CJF, CND | CNF, RRD | RRF, RJD | RJF, RND | RNF] = js.native

    def `then`[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](doneFilter: Null, failFilter: Null, progressFilter: js.Function3[TN,UN,VN,PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP] | Thenable[ANP] | ANP]): PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP] = js.native

    def `then`[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](doneFilter: Null, failFilter: Null): PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP] = js.native

    def `then`[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](doneFilter: Null, failFilter: js.Function3[TJ,UJ,VJ,PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF] | Thenable[ARF] | ARF]): PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF] = js.native

    def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND](doneFilter: js.Function3[TR,UR,VR,PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND] | Thenable[ARD] | ARD]): PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND] = js.native

    def `catch`[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](failFilter: js.Function3[TJ,UJ,VJ,PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF] | Thenable[ARF] | ARF]): PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF] = js.native
  }

  trait Transport extends js.Object {
    def send(headers: PlainObject[_], completeCallback: TransportSuccessCallback): Unit
    def abort(): Unit
  }

  @js.native
  trait Deferred[TR, TJ, TN] extends Promise[TR,TJ,TN] {
    def notify(args: TN*): this.type = js.native

    def notifyWith(context: js.Object, args: ArrayLike[TN]): this.type = js.native
    def notifyWith(context: js.Object): this.type = js.native

    def reject(args: TJ*): this.type = js.native

    def rejectWith(context: js.Object, args: ArrayLike[TJ]): this.type = js.native
    def rejectWith(context: js.Object): this.type = js.native

    def resolve(args: TR*): this.type = js.native

    def resolveWith(context: js.Object, args: ArrayLike[TR]): this.type = js.native
    def resolveWith(context: js.Object): this.type = js.native
  }

  @js.native
  trait DeferredStatic extends js.Object {
    var exceptionHook: js.Any = js.native

    def apply[TR, TJ, TN](beforeStart: js.Function1[Deferred[TR, TJ, TN], Unit]): Deferred[TR, TJ, TN] = js.native
    def apply[TR, TJ, TN](): Deferred[TR, TJ, TN] = js.native
  }

  object Deferred {
    type CallbackBase[T, U, V, R] = js.Function
    type Callback[T] = js.Function
    type Callback3[T, U, V] = CallbackBase[T, U, V, Nothing]
    type DoneCallback[TResolve] = Callback[TResolve]
    type FailCallback[TReject] = Callback[TReject]
    type AlwaysCallback[TResolve, TReject] = Callback[TResolve | TReject]
    type ProgressCallback[TNotify] = Callback[TNotify]

    @js.native
    @JSGlobal("Deferred")
    object Deferred extends js.Object {
      type CallbackBase[T, U, V, R] = js.Function
      type Callback[T] = js.Function
    }

  }

  @js.native
  trait Coordinates extends js.Object {
    var left: Double = js.native
    var top: Double = js.native
  }

  trait CoordinatesPartial extends js.Object {
    var left: js.UndefOr[Double] = js.undefined
    var top: js.UndefOr[Double] = js.undefined
  }

  trait EffectsOptions[TElement] extends js.Object {
    var duration: js.UndefOr[Duration] = js.undefined
    var easing: js.UndefOr[String] = js.undefined
    var queue: js.UndefOr[Boolean | String] = js.undefined
    var specialEasing: js.UndefOr[PlainObject[String]] = js.undefined
    var always: js.UndefOr[js.ThisFunction2[TElement, Animation[TElement], Boolean, Unit]] = js.undefined
    var complete: js.UndefOr[js.ThisFunction0[TElement, Unit]] = js.undefined
    var done: js.UndefOr[js.ThisFunction2[TElement, Animation[TElement], Boolean, Unit]] = js.undefined
    var fail: js.UndefOr[js.ThisFunction2[TElement, Animation[TElement], Boolean, Unit]] = js.undefined
    var progress: js.UndefOr[js.ThisFunction3[TElement, Animation[TElement], Double, Double, Unit]] = js.undefined
    var start: js.UndefOr[js.ThisFunction1[TElement, Animation[TElement], Unit]] = js.undefined
    var step: js.UndefOr[js.ThisFunction2[TElement, Double, Animation[TElement], Unit]] = js.undefined
  }

  @js.native
  trait TriggeredEvent[TDelegateTarget, TData, TCurrentTarget <: EventTarget, TTarget <: EventTarget] extends Event {
    override val currentTarget: TCurrentTarget = js.native
    var delegateTarget: TDelegateTarget = js.native
    override val target: TTarget = js.native
    var data: TData = js.native
    var namespace: js.UndefOr[String] = js.native
    var originalEvent: js.UndefOr[org.scalajs.dom.Event] = js.native
    var result: js.UndefOr[js.Any] = js.native
  }

  @js.native
  trait Event extends org.scalajs.dom.Event {
    var altKey: js.UndefOr[Boolean] = js.native
    var button: js.UndefOr[Int] = js.native
    var buttons: js.UndefOr[Int] = js.native
    var changedTouches: js.UndefOr[TouchList] = js.native
    var char: js.UndefOr[String] = js.native
    var charCode: js.UndefOr[Double] = js.native
    var clientX: js.UndefOr[Double] = js.native
    var clientY: js.UndefOr[Double] = js.native
    var ctrlKey: js.UndefOr[Boolean] = js.native
    var detail: js.UndefOr[Double] = js.native
    var key: js.UndefOr[String] = js.native
    var keyCode: js.UndefOr[Int] = js.native
    var metaKey: js.UndefOr[Boolean] = js.native
    var offsetX: js.UndefOr[Double] = js.native
    var offsetY: js.UndefOr[Double] = js.native
    var pageX: js.UndefOr[Int] = js.native
    var pageY: js.UndefOr[Int] = js.native
    var pointerId: js.UndefOr[Double] = js.native
    var pointerType: js.UndefOr[String] = js.native
    var relatedTarget: js.UndefOr[EventTarget] =js.native
    var screenX: js.UndefOr[Double] = js.native
    var screenY: js.UndefOr[Double] = js.native
    var shiftKey: js.UndefOr[Boolean] = js.native
    var targetTouches: js.UndefOr[TouchList] = js.native
    var toElement: js.UndefOr[Element] = js.native
    var touches: js.UndefOr[TouchList] = js.native
    var view: js.UndefOr[Window] = js.native
    var which: js.UndefOr[Int] = js.native

    def isDefaultPrevented(): Boolean = js.native

    def isImmediatePropagationStopped(): Boolean = js.native

    def isPropagationStopped(): Boolean = js.native
  }


}
