package net.exoego.scalajs.jquery

import org.scalajs.dom.{ Node, Window }
import org.scalajs.dom.html.{ Document, Element }
import org.scalajs.dom.raw.{ HTMLElement, HTMLSelectElement }

import scala.scalajs.js
import scala.scalajs.js.|


@js.native
trait JQueryStatic extends js.Object {
  var ajaxSettings: JQuery.AjaxSettings = js.native
  var Animation: JQuery.AnimationStatic = js.native
  def Callbacks(): JQuery.Callbacks = js.native
  def Callbacks(flags: String): JQuery.Callbacks = js.native
  var cssHooks: JQuery.CSSHooks = js.native
  var cssNumber: JQuery.PlainObject[Boolean] = js.native
  var Deferred: JQuery.DeferredStatic = js.native
  var easing: JQuery.Easings = js.native
  var Event: JQuery.EventStatic = js.native
  var event: JQuery.EventExtensions = js.native
  // Sizzle.Selectors is unknown
  // var expr: JQuery.Selectors = js.native
  // Can't provide access to prototype in Scala.js
  // def fn: JQuery = js.native
  var fx: JQuery.Effects = js.native
  var isReady: Boolean = js.native
  var ready: JQuery.Thenable[JQueryStatic] = js.native
  @deprecated("Use Modernizr or similar. Removed in jQuery 3.0.", "jQuery 1.9")
  var support: JQuerySupport = js.native
  var timers: js.Array[JQuery.TickFunction[js.Any]] = js.native
  var Tween: JQuery.TweenStatic = js.native
  var valHooks: JQuery.ValHooks = js.native

  def apply(window: Window, discriminator: Boolean): JQueryStatic = js.native
  def apply(window: Window): JQuery[Element] = js.native
  def apply(html: JQuery.htmlString, attributes: JQuery.PlainObject[_]): JQuery[Element] = js.native
  def apply(html: JQuery.htmlString, ownerDocument: Document): JQuery[Element] = js.native
  def apply(selector: JQuery.Selector, context: Element | Document | JQuery[Element]): JQuery[Element] = js.native
  def apply(selector: JQuery.Selector): JQuery[Element] = js.native
  def apply(elements: Element | ArrayLike[Element]): JQuery[Element] = js.native
  def apply(selection: JQuery[Element]): JQuery[Element] = js.native
  def apply[T <: js.Any](array: js.Array[T]): JQuery[T] = js.native
  def apply(obj: js.Any): JQuery[Element] = js.native
  def apply(element: HTMLSelectElement): JQuery[HTMLSelectElement] = js.native
  def apply(callback: js.ThisFunction1[Document, JQueryStatic, Unit]): JQuery[Document] = js.native
  def apply(): JQuery[Element] = js.native

  def ajax(url: String, settings: JQuery.AjaxSettings): JQuery.jqXHR = js.native
  def ajax(url: String): JQuery.jqXHR = js.native
  def ajax(settings: JQuery.AjaxSettings): JQuery.jqXHR = js.native
  def ajax(): JQuery.jqXHR = js.native

  def ajaxPrefilter(dataTypes: String, handler: js.Function3[JQuery.AjaxSettings, JQuery.AjaxSettings, JQuery.jqXHR, String | Unit]): Unit = js.native
  def ajaxPrefilter(handler: js.Function3[JQuery.AjaxSettings, JQuery.AjaxSettings, JQuery.jqXHR, String | Unit]): Unit = js.native

  def ajaxSetup(options: JQuery.AjaxSettings): JQuery.AjaxSettings = js.native

  def ajaxTransport(dataType: String, handler: js.Function3[JQuery.AjaxSettings, JQuery.AjaxSettings, JQuery.jqXHR, JQuery.Transport | Unit]): Unit = js.native

  @deprecated("Undocumented and used internally. Alternative not specified", "jQuery 3.3.0")
  def camelCase(value: String): String = js.native

  def contains(container: Element, contained: Element): Boolean = js.native

  def css(elem: Element, name: String): js.Dynamic = js.native

  def data[T <: String | Double | Boolean | js.Object | Null](element: Element | Document | Window, key: String, value: T): T = js.native
  def data[T <: String | Double | Boolean | js.Object | Null](element: Element | Document | Window, key: String): js.UndefOr[T] = js.native
  def data(element: Element | Document | Window): JQuery.PlainObject[js.Any] = js.native

  def dequeue(element: Element): Unit = js.native
  def dequeue(element: Element, queueName: String): Unit = js.native

  def each[T](array: ArrayLike[T], callback: js.Function2[Int, T, Any]): ArrayLike[T] = js.native
  def each[T](array: ArrayLike[T], callback: js.ThisFunction1[T, Int, Any]): ArrayLike[T] = js.native
  def each[T](array: ArrayLike[T], callback: js.ThisFunction0[T, Any]): ArrayLike[T] = js.native
  def each[T <: js.Object](obj: T, callback: js.Function2[String, js.Any, Any]): T = js.native
  def each[T <: js.Object](obj: T, callback: js.ThisFunction1[js.Any, String, Any]): T = js.native
  def each[T <: js.Object](obj: T, callback: js.ThisFunction0[js.Any, Any]): T = js.native

  def error(message: js.Any): js.Dynamic = js.native

  def escapeSelector(selector: JQuery.Selector): JQuery.Selector = js.native

  def extend[T, U, V, W, X, Y, Z](deep: Boolean, target: T, object1: U, object2: V, object3: W, object4: X, object5: Y, object6: Z): T with U with V with W with X with Y with Z = js.native
  def extend[T, U, V, W, X, Y](deep: Boolean, target: T, object1: U, object2: V, object3: W, object4: X, object5: Y): T with U with V with W with X with Y = js.native
  def extend[T, U, V, W, X](deep: Boolean, target: T, object1: U, object2: V, object3: W, object4: X): T with U with V with W with X = js.native
  def extend[T, U, V, W](deep: Boolean, target: T, object1: U, object2: V, object3: W): T with U with V with W = js.native
  def extend[T, U, V](deep: Boolean, target: T, object1: U, object2: V): T with U with V = js.native
  def extend[T, U](deep: Boolean, target: T, object1: U): T with U = js.native
  def extend[T](deep: Boolean, target: T): this.type with T = js.native
  def extend(deep: Boolean, target: js.Any, object1: js.Any, objectN: js.Any*): js.Dynamic = js.native
  def extend[T, U, V, W, X, Y, Z](target: T, object1: U, object2: V, object3: W, object4: X, object5: Y, object6: Z): T with U with V with W with X with Y with Z = js.native
  def extend[T, U, V, W, X, Y](target: T, object1: U, object2: V, object3: W, object4: X, object5: Y): T with U with V with W with X with Y = js.native
  def extend[T, U, V, W, X](target: T, object1: U, object2: V, object3: W, object4: X): T with U with V with W with X = js.native
  def extend[T, U, V, W](target: T, object1: U, object2: V, object3: W): T with U with V with W = js.native
  def extend[T, U, V](target: T, object1: U, object2: V): T with U with V = js.native
  def extend[T, U](target: T, object1: U): T with U = js.native
  def extend[T](target: T): this.type with T = js.native
  def extend(target: js.Any, object1: js.Any, objectN: js.Any*): js.Dynamic = js.native

  def get(url: String, data: JQuery.PlainObject[_] | String, success: JQuery.jqXHR.DoneCallback[_] | Null, dataType: String): JQuery.jqXHR = js.native
  def get(url: String, data: JQuery.PlainObject[_] | String, success: JQuery.jqXHR.DoneCallback[_] | Null): JQuery.jqXHR = js.native
  def get(url: String, success: JQuery.jqXHR.DoneCallback[_] | Null, dataType: String): JQuery.jqXHR = js.native
  def get(url: String, success: JQuery.jqXHR.DoneCallback[_]): JQuery.jqXHR = js.native
  def get(url: String, data: JQuery.PlainObject[_] | String): JQuery.jqXHR = js.native
  def get(url: String): JQuery.jqXHR = js.native
  def get(settings: JQuery.AjaxSettings): JQuery.jqXHR = js.native
  def get(): JQuery.jqXHR = js.native

  def getJSON(url: String, data: JQuery.PlainObject[_] | String, success: JQuery.jqXHR.DoneCallback[_]): JQuery.jqXHR = js.native
  def getJSON(url: String, success: JQuery.jqXHR.DoneCallback[_]): JQuery.jqXHR = js.native
  def getJSON(url: String, data: JQuery.PlainObject[_] | String): JQuery.jqXHR = js.native
  def getJSON(url: String): JQuery.jqXHR = js.native

  def getScript(url: String, success: JQuery.jqXHR.DoneCallback[String | Unit]): JQuery.jqXHR = js.native
  def getScript(url: String): JQuery.jqXHR = js.native
  def getScript(options: JQuery.AjaxSettings): JQuery.jqXHR = js.native

  def globalEval(code: String): Unit = js.native

  def grep[T](array: ArrayLike[T], funсtion: js.Function2[T, Int, Boolean], invert: Boolean): js.Array[T] = js.native
  def grep[T](array: ArrayLike[T], funсtion: js.Function2[T, Int, Boolean]): js.Array[T] = js.native

  def hasData(element: Element | Document | Window | JQuery.PlainObject[_]): Boolean = js.native

  @deprecated("Use jQuery.when(jQuery.ready, jQuery.Deferred(waitForMyDependencies))", "jQuery 3.2.0")
  def holdReady(hold: Boolean): Unit = js.native

  def htmlPrefilter(html: JQuery.htmlString): JQuery.htmlString = js.native

  def inArray[T](value: T, array: js.Array[T], fromIndex: Int): Int = js.native
  def inArray[T](value: T, array: js.Array[T]): Int = js.native

  @deprecated("Use Array.isArray", "jQuery 3.2.0")
  def isArray(obj: js.Any): Boolean = js.native

  def isEmptyObject(obj: js.Any): Boolean = js.native

  @deprecated("Use typeof x === 'function'", "jQuery 3.3.0")
  def isFunction(obj: js.Any): Boolean = js.native

  @deprecated("Internal use only. Alternative not specified", "jQuery 3.3.0")
  def isNumeric(value: js.Any): Boolean = js.native

  def isPlainObject(obj: js.Any): Boolean = js.native

  @deprecated("Alternative not specified", "jQuery 3.3.0")
  def isWindow(obj: js.Any): Boolean = js.native

  def isXMLDoc(node: Node): Boolean = js.native

  def makeArray[T](obj: ArrayLike[T]): js.Array[T] = js.native

  def map[T, R](array: ArrayLike[T], callback: js.Function2[T, Int, JQuery.TypeOrArray[R] | Null ]): js.Array[R] = js.native
  def map[T, R](array: ArrayLike[T], callback: js.Function1[T, JQuery.TypeOrArray[R] | Null ]): js.Array[R] = js.native
  def map[T, R](obj: js.Dictionary[T], callback: js.Function2[T, String, JQuery.TypeOrArray[R] | Null]): js.Array[R] = js.native
  def map[T, R](obj: js.Dictionary[T], callback: js.Function1[T, JQuery.TypeOrArray[R] | Null]): js.Array[R] = js.native
  def map[R](obj: js.Object, callback: js.Function2[js.Any, String, JQuery.TypeOrArray[R] | Null]): js.Array[R] = js.native
  def map[R](obj: js.Object, callback: js.Function1[js.Any, JQuery.TypeOrArray[R] | Null]): js.Array[R] = js.native

  def merge[T, U](first: ArrayLike[T], second: ArrayLike[U]): js.Array[T | U] = js.native

  def noConflict(removeAll: Boolean): this.type = js.native
  def noConflict(): this.type = js.native

  @deprecated("Undocumented. Alternative not specified", "jQuery 3.2.0")
  def nodeName(elem: Node, name: String): Boolean = js.native

  def noop(): Unit = js.native

  @deprecated("Use Date.now", "jQuery 3.3.0")
  def now(): Double = js.native

  def param(obj: js.Array[JQuery.NameValuePair] | js.Object, traditional: Boolean): String = js.native
  def param(obj: js.Array[JQuery.NameValuePair] | js.Object): String = js.native

  def parseHTML(data: String, context: Document | Null, keepScripts: Boolean): js.Array[JQuery.Node] = js.native
  def parseHTML(data: String, context: Document): js.Array[JQuery.Node] = js.native
  def parseHTML(data: String, keepScripts: Boolean): js.Array[JQuery.Node] = js.native
  def parseHTML(data: String): js.Array[JQuery.Node] = js.native

  @deprecated("Use js.JSON.parse", "jQuery 3.0.0")
  def parseJSON(json: String): js.Dynamic = js.native
  def parseXML(data: String): js.Dynamic = js.native

  def post[T <: js.Object](url: String, data: JQuery.PlainObject[_] | String, success: JQuery.jqXHR.DoneCallback[T] | Null, dataType: String): JQuery.jqXHR = js.native
  def post[T <: js.Object](url: String, data: JQuery.PlainObject[_] | String, success: JQuery.jqXHR.DoneCallback[T] | Null): JQuery.jqXHR = js.native
  def post[T <: js.Object](url: String, success: JQuery.jqXHR.DoneCallback[T] | Null, dataType: String): JQuery.jqXHR = js.native
  def post[T <: js.Object](url: String, success: JQuery.jqXHR.DoneCallback[T]): JQuery.jqXHR = js.native
  def post[T <: js.Object](url: String, data: JQuery.PlainObject[_] | String): JQuery.jqXHR = js.native
  def post(url: String): JQuery.jqXHR = js.native
  def post(settings: JQuery.AjaxSettings): JQuery.jqXHR = js.native
  def post(): JQuery.jqXHR = js.native

  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F, G](funсtion: js.Function7[A, B, C, D, E, F, G, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F](funсtion: js.Function6[A, B, C, D, E, F, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E](funсtion: js.Function5[A, B, C, D, E, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D](funсtion: js.Function4[A, B, C, D, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C](funсtion: js.Function3[A, B, C, TReturn], context: Null | Unit, a: A, b: B, c: C): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B](funсtion: js.Function2[A, B, TReturn], context: Null | Unit, a: A, b: B): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A](funсtion: js.Function1[A, TReturn], context: Null | Unit, a: A): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn](funсtion: js.Function0[TReturn], context: Null | Unit): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F, G, T](funсtion: js.Function8[A, B, C, D, E, F, G, T, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F, T](funсtion: js.Function7[A, B, C, D, E, F, T, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, T](funсtion: js.Function6[A, B, C, D, E, T, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, T](funсtion: js.Function5[A, B, C, D, T, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, T](funсtion: js.Function4[A, B, C, T, TReturn], context: Null | Unit, a: A, b: B, c: C): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, T](funсtion: js.Function3[A, B, T, TReturn], context: Null | Unit, a: A, b: B): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, T](funсtion: js.Function2[A, T, TReturn], context: Null | Unit, a: A): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, T](funсtion: js.Function1[T, TReturn], context: Null | Unit): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F, G, T, U](funсtion: js.Function9[A, B, C, D, E, F, G, T, U, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F, T, U](funсtion: js.Function8[A, B, C, D, E, F, T, U, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, T, U](funсtion: js.Function7[A, B, C, D, E, T, U, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, T, U](funсtion: js.Function6[A, B, C, D, T, U, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, T, U](funсtion: js.Function5[A, B, C, T, U, TReturn], context: Null | Unit, a: A, b: B, c: C): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, T, U](funсtion: js.Function4[A, B, T, U, TReturn], context: Null | Unit, a: A, b: B): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, T, U](funсtion: js.Function3[A, T, U, TReturn], context: Null | Unit, a: A): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, T, U](funсtion: js.Function2[T, U, TReturn], context: Null | Unit): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F, G, T, U, V](funсtion: js.Function10[A, B, C, D, E, F, G, T, U, V, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F, T, U, V](funсtion: js.Function9[A, B, C, D, E, F, T, U, V, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, T, U, V](funсtion: js.Function8[A, B, C, D, E, T, U, V, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, T, U, V](funсtion: js.Function7[A, B, C, D, T, U, V, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, T, U, V](funсtion: js.Function6[A, B, C, T, U, V, TReturn], context: Null | Unit, a: A, b: B, c: C): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, T, U, V](funсtion: js.Function5[A, B, T, U, V, TReturn], context: Null | Unit, a: A, b: B): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, T, U, V](funсtion: js.Function4[A, T, U, V, TReturn], context: Null | Unit, a: A): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, T, U, V](funсtion: js.Function3[T, U, V, TReturn], context: Null | Unit): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F, G, T, U, V, W](funсtion: js.Function11[A, B, C, D, E, F, G, T, U, V, W, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F, T, U, V, W](funсtion: js.Function10[A, B, C, D, E, F, T, U, V, W, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, T, U, V, W](funсtion: js.Function9[A, B, C, D, E, T, U, V, W, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, T, U, V, W](funсtion: js.Function8[A, B, C, D, T, U, V, W, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, T, U, V, W](funсtion: js.Function7[A, B, C, T, U, V, W, TReturn], context: Null | Unit, a: A, b: B, c: C): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, T, U, V, W](funсtion: js.Function6[A, B, T, U, V, W, TReturn], context: Null | Unit, a: A, b: B): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, T, U, V, W](funсtion: js.Function5[A, T, U, V, W, TReturn], context: Null | Unit, a: A): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, T, U, V, W](funсtion: js.Function4[T, U, V, W, TReturn], context: Null | Unit): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F, G, T, U, V, W, X](funсtion: js.Function12[A, B, C, D, E, F, G, T, U, V, W, X, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F, T, U, V, W, X](funсtion: js.Function11[A, B, C, D, E, F, T, U, V, W, X, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, T, U, V, W, X](funсtion: js.Function10[A, B, C, D, E, T, U, V, W, X, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, T, U, V, W, X](funсtion: js.Function9[A, B, C, D, T, U, V, W, X, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, T, U, V, W, X](funсtion: js.Function8[A, B, C, T, U, V, W, X, TReturn], context: Null | Unit, a: A, b: B, c: C): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, T, U, V, W, X](funсtion: js.Function7[A, B, T, U, V, W, X, TReturn], context: Null | Unit, a: A, b: B): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, T, U, V, W, X](funсtion: js.Function6[A, T, U, V, W, X, TReturn], context: Null | Unit, a: A): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, T, U, V, W, X](funсtion: js.Function5[T, U, V, W, X, TReturn], context: Null | Unit): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F, G, T, U, V, W, X, Y](funсtion: js.Function13[A, B, C, D, E, F, G, T, U, V, W, X, Y, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F, T, U, V, W, X, Y](funсtion: js.Function12[A, B, C, D, E, F, T, U, V, W, X, Y, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, T, U, V, W, X, Y](funсtion: js.Function11[A, B, C, D, E, T, U, V, W, X, Y, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, T, U, V, W, X, Y](funсtion: js.Function10[A, B, C, D, T, U, V, W, X, Y, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, T, U, V, W, X, Y](funсtion: js.Function9[A, B, C, T, U, V, W, X, Y, TReturn], context: Null | Unit, a: A, b: B, c: C): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, T, U, V, W, X, Y](funсtion: js.Function8[A, B, T, U, V, W, X, Y, TReturn], context: Null | Unit, a: A, b: B): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, T, U, V, W, X, Y](funсtion: js.Function7[A, T, U, V, W, X, Y, TReturn], context: Null | Unit, a: A): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, T, U, V, W, X, Y](funсtion: js.Function6[T, U, V, W, X, Y, TReturn], context: Null | Unit): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F, G, T, U, V, W, X, Y, Z](funсtion: js.Function14[A, B, C, D, E, F, G, T, U, V, W, X, Y, Z, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, F, T, U, V, W, X, Y, Z](funсtion: js.Function13[A, B, C, D, E, F,  T, U, V, W, X, Y, Z, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E, f: F): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, E, T, U, V, W, X, Y, Z](funсtion: js.Function12[A, B, C, D, E, T, U, V, W, X, Y, Z, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D, e: E): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, D, T, U, V, W, X, Y, Z](funсtion: js.Function11[A, B, C, D,  T, U, V, W, X, Y, Z, TReturn], context: Null | Unit, a: A, b: B, c: C, d: D): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, C, T, U, V, W, X, Y, Z](funсtion: js.Function10[A, B, C, T, U, V, W, X, Y, Z, TReturn], context: Null | Unit, a: A, b: B, c: C): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, B, T, U, V, W, X, Y, Z](funсtion: js.Function9[A, B,  T, U, V, W, X, Y, Z, TReturn], context: Null | Unit, a: A, b: B): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, A, T, U, V, W, X, Y, Z](funсtion: js.Function8[A,  T, U, V, W, X, Y, Z, TReturn], context: Null | Unit, a: A): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn, T, U, V, W, X, Y, Z](funсtion: js.Function7[T, U, V, W, X, Y, Z, TReturn], context: Null | Unit): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TReturn](funсtion: js.Function, context: Null | Unit, additionalArguments: js.Any*): js.Function = js.native

  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F, G](funсtion: js.ThisFunction7[TContext, A, B, C, D, E, F, G, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F](funсtion: js.ThisFunction6[TContext, A, B, C, D, E, F, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E](funсtion: js.ThisFunction5[TContext, A, B, C, D, E, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D](funсtion: js.ThisFunction4[TContext, A, B, C, D, TReturn], context: TContext, a: A, b: B, c: C, d: D): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C](funсtion: js.ThisFunction3[TContext, A, B, C, TReturn], context: TContext, a: A, b: B, c: C): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B](funсtion: js.ThisFunction2[TContext, A, B, TReturn], context: TContext, a: A, b: B): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A](funсtion: js.ThisFunction1[TContext, A, TReturn], context: TContext, a: A): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn](funсtion: js.ThisFunction0[TContext, TReturn], context: TContext): js.Function0[TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F, G, T](funсtion: js.ThisFunction8[TContext, A, B, C, D, E, F, G, T, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F, T](funсtion: js.ThisFunction7[TContext, A, B, C, D, E, F, T, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, T](funсtion: js.ThisFunction6[TContext, A, B, C, D, E, T, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, T](funсtion: js.ThisFunction5[TContext, A, B, C, D, T, TReturn], context: TContext, a: A, b: B, c: C, d: D): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, T](funсtion: js.ThisFunction4[TContext, A, B, C, T, TReturn], context: TContext, a: A, b: B, c: C): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, T](funсtion: js.ThisFunction3[TContext, A, B, T, TReturn], context: TContext, a: A, b: B): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, T](funсtion: js.ThisFunction2[TContext, A, T, TReturn], context: TContext, a: A): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, T](funсtion: js.ThisFunction1[TContext, T, TReturn], context: TContext): js.Function1[T, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F, G, T, U](funсtion: js.ThisFunction9[TContext, A, B, C, D, E, F, G, T, U, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F, T, U](funсtion: js.ThisFunction8[TContext, A, B, C, D, E, F, T, U, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, T, U](funсtion: js.ThisFunction7[TContext, A, B, C, D, E, T, U, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, T, U](funсtion: js.ThisFunction6[TContext, A, B, C, D, T, U, TReturn], context: TContext, a: A, b: B, c: C, d: D): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, T, U](funсtion: js.ThisFunction5[TContext, A, B, C, T, U, TReturn], context: TContext, a: A, b: B, c: C): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, T, U](funсtion: js.ThisFunction4[TContext, A, B, T, U, TReturn], context: TContext, a: A, b: B): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, T, U](funсtion: js.ThisFunction3[TContext, A, T, U, TReturn], context: TContext, a: A): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, T, U](funсtion: js.ThisFunction2[TContext, T, U, TReturn], context: TContext): js.Function2[T, U, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F, G, T, U, V](funсtion: js.ThisFunction10[TContext, A, B, C, D, E, F, G, T, U, V, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F, T, U, V](funсtion: js.ThisFunction9[TContext, A, B, C, D, E, F, T, U, V, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, T, U, V](funсtion: js.ThisFunction8[TContext, A, B, C, D, E, T, U, V, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, T, U, V](funсtion: js.ThisFunction7[TContext, A, B, C, D, T, U, V, TReturn], context: TContext, a: A, b: B, c: C, d: D): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, T, U, V](funсtion: js.ThisFunction6[TContext, A, B, C, T, U, V, TReturn], context: TContext, a: A, b: B, c: C): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, T, U, V](funсtion: js.ThisFunction5[TContext, A, B, T, U, V, TReturn], context: TContext, a: A, b: B): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, T, U, V](funсtion: js.ThisFunction4[TContext, A, T, U, V, TReturn], context: TContext, a: A): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, T, U, V](funсtion: js.ThisFunction3[TContext, T, U, V, TReturn], context: TContext): js.Function3[T, U, V, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F, G, T, U, V, W](funсtion: js.ThisFunction11[TContext, A, B, C, D, E, F, G, T, U, V, W, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F, T, U, V, W](funсtion: js.ThisFunction10[TContext, A, B, C, D, E, F, T, U, V, W, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, T, U, V, W](funсtion: js.ThisFunction9[TContext, A, B, C, D, E, T, U, V, W, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, T, U, V, W](funсtion: js.ThisFunction8[TContext, A, B, C, D, T, U, V, W, TReturn], context: TContext, a: A, b: B, c: C, d: D): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, T, U, V, W](funсtion: js.ThisFunction7[TContext, A, B, C, T, U, V, W, TReturn], context: TContext, a: A, b: B, c: C): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, T, U, V, W](funсtion: js.ThisFunction6[TContext, A, B, T, U, V, W, TReturn], context: TContext, a: A, b: B): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, T, U, V, W](funсtion: js.ThisFunction5[TContext, A, T, U, V, W, TReturn], context: TContext, a: A): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, T, U, V, W](funсtion: js.ThisFunction4[TContext, T, U, V, W, TReturn], context: TContext): js.Function4[T, U, V, W, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F, G, T, U, V, W, X](funсtion: js.ThisFunction12[TContext, A, B, C, D, E, F, G, T, U, V, W, X, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F, T, U, V, W, X](funсtion: js.ThisFunction11[TContext, A, B, C, D, E, F, T, U, V, W, X, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, T, U, V, W, X](funсtion: js.ThisFunction10[TContext, A, B, C, D, E, T, U, V, W, X, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, T, U, V, W, X](funсtion: js.ThisFunction9[TContext, A, B, C, D, T, U, V, W, X, TReturn], context: TContext, a: A, b: B, c: C, d: D): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, T, U, V, W, X](funсtion: js.ThisFunction8[TContext, A, B, C, T, U, V, W, X, TReturn], context: TContext, a: A, b: B, c: C): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, T, U, V, W, X](funсtion: js.ThisFunction7[TContext, A, B, T, U, V, W, X, TReturn], context: TContext, a: A, b: B): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, T, U, V, W, X](funсtion: js.ThisFunction6[TContext, A, T, U, V, W, X, TReturn], context: TContext, a: A): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, T, U, V, W, X](funсtion: js.ThisFunction5[TContext, T, U, V, W, X, TReturn], context: TContext): js.Function5[T, U, V, W, X, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F, G, T, U, V, W, X, Y](funсtion: js.ThisFunction13[TContext, A, B, C, D, E, F, G, T, U, V, W, X, Y, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F, T, U, V, W, X, Y](funсtion: js.ThisFunction12[TContext, A, B, C, D, E, F, T, U, V, W, X, Y, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, T, U, V, W, X, Y](funсtion: js.ThisFunction11[TContext, A, B, C, D, E, T, U, V, W, X, Y, TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, T, U, V, W, X, Y](funсtion: js.ThisFunction10[TContext, A, B, C, D, T, U, V, W, X, Y, TReturn], context: TContext, a: A, b: B, c: C, d: D): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, T, U, V, W, X, Y](funсtion: js.ThisFunction9[TContext, A, B, C, T, U, V, W, X, Y, TReturn], context: TContext, a: A, b: B, c: C): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, T, U, V, W, X, Y](funсtion: js.ThisFunction8[TContext, A, B, T, U, V, W, X, Y, TReturn], context: TContext, a: A, b: B): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, T, U, V, W, X, Y](funсtion: js.ThisFunction7[TContext, A, T, U, V, W, X, Y, TReturn], context: TContext, a: A): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, T, U, V, W, X, Y](funсtion: js.ThisFunction6[TContext, T, U, V, W, X, Y, TReturn], context: TContext): js.Function6[T, U, V, W, X, Y, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F, G, T, U, V, W, X, Y, Z](funсtion: js.ThisFunction14[TContext, A, B, C, D, E, F, G, T, U, V, W, X, Y, Z,TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, F, T, U, V, W, X, Y, Z](funсtion: js.ThisFunction13[TContext, A, B, C, D, E, F, T, U, V, W, X, Y, Z,TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, E, T, U, V, W, X, Y, Z](funсtion: js.ThisFunction12[TContext, A, B, C, D, E,  T, U, V, W, X, Y, Z,TReturn], context: TContext, a: A, b: B, c: C, d: D, e: E): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, D, T, U, V, W, X, Y, Z](funсtion: js.ThisFunction11[TContext, A, B, C, D,  T, U, V, W, X, Y, Z,TReturn], context: TContext, a: A, b: B, c: C, d: D): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, C, T, U, V, W, X, Y, Z](funсtion: js.ThisFunction10[TContext, A, B, C,  T, U, V, W, X, Y, Z,TReturn], context: TContext, a: A, b: B, c: C): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, B, T, U, V, W, X, Y, Z](funсtion: js.ThisFunction9[TContext, A, B,  T, U, V, W, X, Y, Z,TReturn], context: TContext, a: A, b: B): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, A, T, U, V, W, X, Y, Z](funсtion: js.ThisFunction8[TContext, A, T, U, V, W, X, Y, Z,TReturn], context: TContext, a: A): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn, T, U, V, W, X, Y, Z](funсtion: js.ThisFunction7[TContext, T, U, V, W, X, Y, Z,TReturn], context: TContext): js.Function7[T, U, V, W, X, Y, Z, TReturn] = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext, TReturn](funсtion: js.Function, context: TContext, additionalArguments: js.Any*): js.Function = js.native
  @deprecated("Use Function.bind", "jQuery 3.3.0") def proxy[TContext](context: TContext, name: String, additionalArguments: js.Any*): js.Function = js.native

  def queue[T <: Element](element: T, queueName: String, data: JQuery.TypeOrArray[JQuery.QueueFunction[T]]): JQuery.Queue[T] = js.native
  def queue[T <: Element](element: T, data: JQuery.TypeOrArray[JQuery.QueueFunction[T]]): JQuery.Queue[T] = js.native
  def queue[T <: Element](element: T, queueName: String): JQuery.Queue[T] = js.native
  def queue[T <: Element](element: T): JQuery.Queue[T] = js.native

  var readyException: js.Function1[Error, Unit] = js.native

  def removeData(element: Element | Document | Window, name: String): Unit = js.native
  def removeData(element: Element | Document | Window): Unit = js.native

  def speed[TElement <: Element](duration: JQuery.Duration, easing: String, complete: js.ThisFunction0[TElement, Unit]): JQuery.EffectsOptions[TElement] = js.native
  def speed[TElement <: Element](duration: JQuery.Duration, easing: String): JQuery.EffectsOptions[TElement] = js.native
  def speed[TElement <: Element](duration: JQuery.Duration, complete: js.ThisFunction0[TElement, Unit]): JQuery.EffectsOptions[TElement] = js.native
  def speed[TElement <: Element](duration: JQuery.Duration): JQuery.EffectsOptions[TElement] = js.native
  def speed[TElement <: Element](complete: js.ThisFunction0[TElement, Unit]): JQuery.EffectsOptions[TElement] = js.native
  def speed[TElement <: Element](settings: JQuery.SpeedSettings[TElement]): JQuery.EffectsOptions[TElement] = js.native
  def speed[TElement <: Element](): JQuery.EffectsOptions[TElement] = js.native

  def trim(str: String): String = js.native

  @deprecated("Undocumented and internal use only. Alternative not specified", "jQuery 3.3.0")
  def `type`(obj: js.Any): String = js.native

  @deprecated("Use uniqueSort", "jQuery 3.0.0")
  def unique[T <: Element](array: js.Array[T]): js.Array[T] = js.native
  def uniqueSort[T <: Element](array: js.Array[T]): js.Array[T] = js.native

  def when[TR1, UR1, VR1, TJ1, UJ1, VJ1](deferredT: JQuery.Promise[TR1, TJ1, Nothing] | JQuery.Thenable[TR1] | TR1, deferredU: JQuery.Promise[UR1, UJ1, Nothing] | JQuery.Thenable[UR1] | UR1, deferredV: JQuery.Promise[VR1, VJ1, Nothing] | JQuery.Thenable[VR1] | VR1): JQuery.Promise3[TR1, TJ1, Nothing, UR1, UJ1, Nothing, VR1, VJ1, Nothing] = js.native
  def when[TR1, UR1, TJ1, UJ1](deferredT: JQuery.Promise[TR1, TJ1, Nothing] | JQuery.Thenable[TR1] | TR1, deferredU: JQuery.Promise[UR1, UJ1, Nothing] | JQuery.Thenable[UR1] | UR1): JQuery.Promise2[TR1, TJ1, Nothing, UR1, UJ1, Nothing] = js.native
  def when[TR1, TJ1, TR2, TJ2, TR3, TJ3](deferredT: JQuery.Promise3[TR1, TJ1, js.Any, TR2, TJ2, js.Any, TR3, TJ3, js.Any] | JQuery.Promise2[TR1, TJ1, js.Any, TR2, TJ2, js.Any]): JQuery.Promise3[TR1, TJ1, Nothing, TR2, TJ2, Nothing, TR3, TJ3, Nothing] = js.native
  def when[TR1, TJ1](deferred: JQuery.Promise[TR1, TJ1, Nothing] | JQuery.Thenable[TR1] | TR1): JQuery.Promise[TR1, TJ1, Nothing] = js.native
  def when[TR1, TJ1](deferreds: JQuery.Promise[TR1, TJ1, Nothing] | JQuery.Thenable[TR1] | TR1*): JQuery.Promise[TR1, TJ1, Nothing] = js.native
}
