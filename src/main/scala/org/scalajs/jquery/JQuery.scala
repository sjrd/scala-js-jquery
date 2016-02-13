package org.scalajs.jquery

import scala.scalajs.js
import org.scalajs.dom
import org.scalajs.dom._

import js.annotation.JSName

@js.native
trait JQueryAjaxSettings extends js.Object {
  var accepts: js.Any = js.native
  var async: Boolean = js.native
  def beforeSend(jqXHR: JQueryXHR, settings: JQueryAjaxSettings): js.Dynamic = js.native
  var cache: Boolean = js.native
  def complete(jqXHR: JQueryXHR, textStatus: String): js.Dynamic = js.native
  var contents: js.Any = js.native
  var contentType: js.Any = js.native
  var context: js.Any = js.native
  var converters: js.Any = js.native
  var crossDomain: Boolean = js.native
  var data: js.Any = js.native
  def dataFilter(data: js.Any, ty: js.Any): js.Dynamic = js.native
  var dataType: String = js.native
  def error(jqXHR: JQueryXHR, textStatus: String, errorThrow: String): js.Dynamic = js.native
  var global: Boolean = js.native
  var headers: js.Any = js.native
  var ifModified: Boolean = js.native
  var isLocal: Boolean = js.native
  var jsonp: String = js.native
  var jsonpCallback: js.Any = js.native
  var method: String = js.native
  var mimeType: String = js.native
  var password: String = js.native
  var processData: Boolean = js.native
  var scriptCharset: String = js.native
  var statusCode: js.Any = js.native
  def success(data: js.Any, textStatus: String, jqXHR: JQueryXHR): js.Dynamic = js.native
  var timeout: Double = js.native
  var traditional: Boolean = js.native
  var `type`: String = js.native
  var url: String = js.native
  var username: String = js.native
  var xhr: js.Any = js.native
  var xhrFields: js.Any = js.native
}

@js.native
trait JQueryXHR extends XMLHttpRequest with JQueryPromise {
  def overrideMimeType(): js.Dynamic = js.native
}

@js.native
trait JQueryCallback extends js.Object {
  def add(callbacks: js.Any*): js.Dynamic = js.native
  def disable(): js.Dynamic = js.native
  def empty(): js.Dynamic = js.native
  def fire(arguments: js.Any*): js.Dynamic = js.native
  def fired(): Boolean = js.native
  def fireWith(context: js.Any, args: js.Any*): js.Dynamic = js.native
  def has(callback: js.Any): Boolean = js.native
  def lock(): js.Dynamic = js.native
  def locked(): Boolean = js.native
  def removed(callbacks: js.Any*): js.Dynamic = js.native
}

@js.native
trait JQueryPromise extends js.Object {
  def always(alwaysCallbacks: js.Any*): JQueryDeferred = js.native
  def done(doneCallbacks: js.Any*): JQueryDeferred = js.native
  def fail(failCallbacks: js.Any*): JQueryDeferred = js.native
  def pipe(doneFilter: js.Function1[js.Any, js.Any] = ???, failFilter: js.Function1[js.Any, js.Any] = ???, progressFilter: js.Function1[js.Any, js.Any] = ???): JQueryPromise = js.native
  def `then`(doneCallbacks: js.Any, failCallbacks: js.Any, progressCallbacks: js.Any = ???): JQueryDeferred = js.native
}

@js.native
trait JQueryDeferred extends JQueryPromise {
  def notify(args: js.Any*): JQueryDeferred = js.native
  def notifyWith(context: js.Any, args: js.Any*): JQueryDeferred = js.native
  def progress(progressCallbacks: js.Any*): JQueryDeferred = js.native
  def reject(args: js.Any*): JQueryDeferred = js.native
  def rejectWith(context: js.Any, args: js.Any*): JQueryDeferred = js.native
  def resolve(args: js.Any*): JQueryDeferred = js.native
  def resolveWith(context: js.Any, args: js.Any*): JQueryDeferred = js.native
  def state(): String = js.native
}

@js.native
trait JQueryEventObject extends Event {
  var data: js.Any = js.native
  var delegateTarget: Element = js.native
  def isDefaultPrevented(): Boolean = js.native
  def isImmediatePropagationStopped(): Boolean = js.native
  def isPropagationStopped(): Boolean = js.native
  var namespace: String = js.native
  override def preventDefault(): Unit = js.native // js.Dynamic
  var relatedTarget: Element = js.native
  var result: js.Any = js.native
  override def stopImmediatePropagation(): Unit = js.native // js.Dynamic
  override def stopPropagation(): Unit = js.native // js.Dynamic
  var pageX: Int = js.native
  var pageY: Int = js.native
  var which: Int = js.native
  var metaKey: js.Any = js.native
}

@js.native
trait JQueryBrowserInfo extends js.Object {
  var safari: Boolean = js.native
  var opera: Boolean = js.native
  var msie: Boolean = js.native
  var mozilla: Boolean = js.native
  var version: String = js.native
}

@js.native
trait JQuerySupport extends js.Object {
  var ajax: Boolean = js.native
  var boxModel: Boolean = js.native
  var changeBubbles: Boolean = js.native
  var checkClone: Boolean = js.native
  var checkOn: Boolean = js.native
  var cors: Boolean = js.native
  var cssFloat: Boolean = js.native
  var hrefNormalized: Boolean = js.native
  var htmlSerialize: Boolean = js.native
  var leadingWhitespace: Boolean = js.native
  var noCloneChecked: Boolean = js.native
  var noCloneEvent: Boolean = js.native
  var opacity: Boolean = js.native
  var optDisabled: Boolean = js.native
  var optSelected: Boolean = js.native
  def scriptEval(): Boolean = js.native
  var style: Boolean = js.native
  var submitBubbles: Boolean = js.native
  var tbody: Boolean = js.native
}

@js.native
trait JQueryTransport extends js.Object {
  def send(headers: js.Any, completeCallback: js.Function4[Int, String, js.Any, String, Unit]): Unit = js.native
  def abort(): Unit = js.native
}

@js.native
trait JQueryStatic extends js.Object {
  def ajax(settings: JQueryAjaxSettings): js.Dynamic = js.native
  def ajax(url: String, settings: JQueryAjaxSettings): js.Dynamic = js.native
  def ajaxPrefilter(dataTypes: String, handler: js.Function3[js.Any, js.Any, JQueryXHR, js.Any]): js.Dynamic = js.native
  def ajaxPrefilter(handler: js.Function3[js.Any, js.Any, JQueryXHR, js.Any]): js.Dynamic = js.native
  def ajaxSetup(options: js.Any): js.Dynamic = js.native
  def ajaxTransport(dataType: String, handler: js.Function3[JQueryAjaxSettings, JQueryAjaxSettings, JQueryXHR, JQueryTransport]): Unit = js.native
  def get(url: String, data: js.Any = ???, success: js.Any = ???, dataType: js.Any = ???): JQueryXHR = js.native
  def getJSON(url: String, data: js.Any = ???, success: js.Any = ???): JQueryXHR = js.native
  def getScript(url: String, success: js.Any = ???): JQueryXHR = js.native
  def param(obj: js.Any, traditional: Boolean = ???): String = js.native
  def post(url: String, data: js.Any = ???, success: js.Any = ???, dataType: js.Any = ???): JQueryXHR = js.native
  def Callbacks(flags: js.Any): JQueryCallback = js.native
  def holdReady(hold: Boolean): js.Dynamic = js.native
  def apply(selector: String, context: js.Any): JQuery = js.native
  def apply(selector: String): JQuery = js.native
  def apply(element: Element): JQuery = js.native
  def apply(`object`: js.Any): JQuery = js.native
  def apply(elementArray: js.Array[Element]): JQuery = js.native
  def apply(`object`: JQuery): JQuery = js.native
  def apply(func: js.Function): JQuery = js.native
  def apply(): JQuery = js.native
  def noConflict(removeAll: Boolean = ???): js.Object = js.native
  def when(deferreds: js.Any*): JQueryPromise = js.native
  def css(e: js.Any, propertyName: String, value: js.Any): js.Dynamic = js.native
  def css(e: js.Any, propertyName: String): js.Dynamic = js.native
  def css(e: js.Any, propertyName: js.Any, value: js.Any): js.Dynamic = js.native
  def css(e: js.Any, propertyName: js.Any): js.Dynamic = js.native
  var cssHooks: js.Any = js.native
  def data(element: Element, key: String, value: js.Any): js.Object = js.native
  def dequeue(element: Element, queueName: String = ???): js.Dynamic = js.native
  def hasData(element: Element): Boolean = js.native
  def queue(element: Element, queueName: String = ???): js.Array[js.Any] = js.native
  def queue(element: Element, queueName: String, newQueueOrCallback: js.Any): JQuery = js.native
  def removeData(element: Element, name: String = ???): JQuery = js.native
  def Deferred(beforeStart: js.Function1[JQueryDeferred, js.Any] = ???): JQueryDeferred = js.native
  var fx: js.Any = js.native
  def proxy(func: js.Function, context: js.Any): js.Dynamic = js.native
  def proxy(context: js.Any, name: String): js.Dynamic = js.native
  def error(message: js.Any): js.Dynamic = js.native
  var expr: js.Any = js.native
  var fn: js.Any = js.native
  var isReady: Boolean = js.native
  var browser: JQueryBrowserInfo = js.native
  var support: JQuerySupport = js.native
  def contains(container: Element, contained: Element): Boolean = js.native
  def each[A](collection: js.Array[A], callback: js.Function2[Int, A, _]): Unit = js.native
  def each[A](collection: js.Array[A], callback: js.ThisFunction0[A, _]): Unit = js.native
  def each[A](collection: js.Dictionary[A], callback: js.Function2[String, A, _]): Unit = js.native
  def each[A](collection: js.Dictionary[A], callback: js.ThisFunction0[A, _]): Unit = js.native
  def extend(target: js.Any, objs: js.Any*): js.Object = js.native
  def extend(deep: Boolean, target: js.Any, objs: js.Any*): js.Object = js.native
  def globalEval(code: String): js.Dynamic = js.native
  def grep(array: js.Array[js.Any], func: js.Any, invert: Boolean): js.Array[js.Any] = js.native
  def inArray(value: js.Any, array: js.Array[js.Any], fromIndex: Int = ???): Int = js.native
  def isArray(obj: js.Any): Boolean = js.native
  def isEmptyObject(obj: js.Any): Boolean = js.native
  def isFunction(obj: js.Any): Boolean = js.native
  def isNumeric(value: js.Any): Boolean = js.native
  def isPlainObject(obj: js.Any): Boolean = js.native
  def isWindow(obj: js.Any): Boolean = js.native
  def isXMLDoc(node: Node): Boolean = js.native
  def makeArray(obj: js.Any): js.Array[js.Any] = js.native
  def map[A, B](collection: js.Array[A], callback: js.Function2[A, Int, B]): js.Array[B] = js.native
  def map[A, B](collection: js.Array[A], callback: js.Function1[A, B]): js.Array[B] = js.native
  def map[A, B](collection: js.Dictionary[A], callback: js.Function2[A, String, B]): js.Dictionary[B] = js.native
  def map[A, B](collection: js.Dictionary[A], callback: js.Function1[A, B]): js.Dictionary[B] = js.native
  def merge(first: js.Array[js.Any], second: js.Array[js.Any]): js.Array[js.Any] = js.native
  def noop(): js.Dynamic = js.native
  def now(): Double = js.native
  def parseHTML(data: String, context: Element = ???, keepScripts: Boolean = ???): js.Array[js.Any] = js.native
  def parseJSON(json: String): js.Dynamic = js.native
  def parseXML(data: String): js.Dynamic = js.native
  def queue(element: Element, queueName: String, newQueue: js.Array[js.Any]): JQuery = js.native
  def trim(str: String): String = js.native
  def `type`(obj: js.Any): String = js.native
  def unique(arr: js.Array[js.Any]): js.Array[js.Any] = js.native
}

@js.native
trait JQuery extends js.Object {
  def ajaxComplete(handler: js.Any): JQuery = js.native
  def ajaxError(handler: js.Function3[js.Any, js.Any, js.Any, js.Any]): JQuery = js.native
  def ajaxSend(handler: js.Function3[js.Any, js.Any, js.Any, js.Any]): JQuery = js.native
  def ajaxStart(handler: js.Function0[js.Any]): JQuery = js.native
  def ajaxStop(handler: js.Function0[js.Any]): JQuery = js.native
  def ajaxSuccess(handler: js.Function3[js.Any, js.Any, js.Any, js.Any]): JQuery = js.native
  def serialize(): String = js.native
  def serializeArray(): js.Array[js.Any] = js.native
  def addClass(classNames: String): JQuery = js.native
  def addClass(func: js.Function2[js.Any, js.Any, JQuery]): js.Dynamic = js.native
  def attr(attributeName: String): js.UndefOr[String] = js.native
  def attr(attributeName: String, value: js.Any): JQuery = js.native
  def attr(map: js.Any): JQuery = js.native
  def attr(attributeName: String, func: js.Function2[js.Any, js.Any, js.Any]): JQuery = js.native
  def hasClass(className: String): Boolean = js.native
  def html(htmlString: String): JQuery = js.native
  def html(): String = js.native
  def prop(propertyName: String): js.Dynamic = js.native
  def prop(propertyName: String, value: js.Any): JQuery = js.native
  def prop(map: js.Any): JQuery = js.native
  def prop(propertyName: String, func: js.Function2[js.Any, js.Any, js.Any]): JQuery = js.native
  def removeAttr(attributeName: js.Any): JQuery = js.native
  def removeClass(className: js.Any): JQuery = js.native
  def removeClass(): JQuery = js.native
  def removeClass(func: js.Function2[js.Any, js.Any, js.Any]): JQuery = js.native
  def removeProp(propertyName: js.Any): JQuery = js.native
  def toggleClass(className: js.Any, swtch: Boolean): JQuery = js.native
  def toggleClass(className: js.Any): JQuery = js.native
  def toggleClass(swtch: Boolean): JQuery = js.native
  def toggleClass(): JQuery = js.native
  def toggleClass(func: js.Function3[js.Any, js.Any, js.Any, js.Any]): JQuery = js.native
  def `val`(): js.Dynamic = js.native
  def `val`(value: js.Array[String]): JQuery = js.native
  def `val`(value: String): JQuery = js.native
  def `val`(func: js.Function2[js.Any, js.Any, js.Any]): JQuery = js.native
  @JSName("val") def value(): js.Dynamic = js.native
  @JSName("val") def value(value: js.Array[String]): JQuery = js.native
  @JSName("val") def value(value: String): JQuery = js.native
  @JSName("val") def value(func: js.Function2[js.Any, js.Any, js.Any]): JQuery = js.native
  def css(propertyNames: js.Array[js.Any]): String = js.native
  def css(propertyName: String): String = js.native
  def css(propertyName: String, value: js.Any): JQuery = js.native
  def css(propertyName: js.Any, value: js.Any): JQuery = js.native
  def css(propertyName: js.Any): JQuery = js.native
  def height(): Double = js.native
  def height(value: Double): JQuery = js.native
  def height(func: js.Function2[js.Any, js.Any, js.Any]): JQuery = js.native
  def innerHeight(): Double = js.native
  def innerWidth(): Double = js.native
  def offset(): js.Any = js.native
  def offset(coordinates: js.Any): JQuery = js.native
  def offset(func: js.Function2[js.Any, js.Any, js.Any]): JQuery = js.native
  def outerHeight(includeMargin: Boolean = ???): Double = js.native
  def outerWidth(includeMargin: Boolean = ???): Double = js.native
  def position(): js.Any = js.native
  def scrollLeft(): Int = js.native
  def scrollLeft(value: Int): JQuery = js.native
  def scrollTop(): Int = js.native
  def scrollTop(value: Int): JQuery = js.native
  def width(): Double = js.native
  def width(value: Double): JQuery = js.native
  def width(func: js.Function2[js.Any, js.Any, js.Any]): JQuery = js.native
  def clearQueue(queueName: String): JQuery = js.native
  def clearQueue(): JQuery = js.native
  def data(key: String, value: js.Any): JQuery = js.native
  def data(obj: js.Any): JQuery = js.native
  def data(key: String): js.Dynamic = js.native
  def data(): js.Dynamic = js.native
  def dequeue(queueName: String): JQuery = js.native
  def dequeue(): JQuery = js.native
  def queue(queueName: String): js.Array[js.Any] = js.native
  def queue(): js.Array[js.Any] = js.native
  def queue(queueName: String, newQueueOrCallback: js.Any): JQuery = js.native
  def queue(newQueueOrCallback: js.Any): JQuery = js.native
  def removeData(nameOrList: js.Any): JQuery = js.native
  def removeData(): JQuery = js.native
  def promise(`type`: js.Any = ???, target: js.Any = ???): JQueryPromise = js.native
  def animate(properties: js.Any, duration: js.Any = ???, easing: String = ???, complete: js.Function = ???): JQuery = js.native
  def delay(duration: Int, queueName: String = ???): JQuery = js.native
  def fadeIn(duration: js.Any, callback: js.Any): JQuery = js.native
  def fadeIn(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = js.native
  def fadeOut(duration: js.Any, callback: js.Any): JQuery = js.native
  def fadeOut(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = js.native
  def fadeTo(duration: js.Any, opacity: Double, callback: js.Any): JQuery = js.native
  def fadeTo(duration: js.Any, opacity: Double = ???, easing: String = ???, callback: js.Any = ???): JQuery = js.native
  def fadeToggle(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = js.native
  def finish(queue: String = ???): JQuery = js.native
  def hide(duration: js.Any, callback: js.Any): JQuery = js.native
  def hide(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = js.native
  def show(duration: js.Any, callback: js.Any): JQuery = js.native
  def show(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = js.native
  def slideDown(duration: js.Any, callback: js.Any): JQuery = js.native
  def slideDown(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = js.native
  def slideToggle(duration: js.Any, callback: js.Any): JQuery = js.native
  def slideToggle(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = js.native
  def slideUp(duration: js.Any, callback: js.Any): JQuery = js.native
  def slideUp(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = js.native
  def stop(clearQueue: Boolean = ???, jumpToEnd: Boolean = ???): JQuery = js.native
  def stop(queue: js.Any, clearQueue: Boolean, jumpToEnd: Boolean): JQuery = js.native
  def stop(queue: js.Any, clearQueue: Boolean): JQuery = js.native
  def stop(queue: js.Any): JQuery = js.native
  def bind(eventType: String, eventData: js.Any = ???, handler: js.Function1[JQueryEventObject, js.Any] = ???): JQuery = js.native
  def bind(eventType: String, eventData: js.Any, preventBubble: Boolean): JQuery = js.native
  def bind(eventType: String, preventBubble: Boolean): JQuery = js.native
  def bind(events: js.Any*): js.Dynamic = js.native
  def blur(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def blur(eventData: js.Any): JQuery = js.native
  def blur(): JQuery = js.native
  def blur(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def change(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def change(eventData: js.Any): JQuery = js.native
  def change(): JQuery = js.native
  def change(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def click(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def click(eventData: js.Any): JQuery = js.native
  def click(): JQuery = js.native
  def click(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def dblclick(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def dblclick(eventData: js.Any): JQuery = js.native
  def dblclick(): JQuery = js.native
  def dblclick(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def delegate(selector: js.Any, eventType: String, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def focus(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def focus(eventData: js.Any): JQuery = js.native
  def focus(): JQuery = js.native
  def focus(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def focusin(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def focusin(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def focusout(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def focusout(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def hover(handlerIn: js.Function1[JQueryEventObject, js.Any], handlerOut: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def hover(handlerInOut: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def keydown(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def keydown(eventData: js.Any): JQuery = js.native
  def keydown(): JQuery = js.native
  def keydown(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def keypress(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def keypress(eventData: js.Any): JQuery = js.native
  def keypress(): JQuery = js.native
  def keypress(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def keyup(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def keyup(eventData: js.Any): JQuery = js.native
  def keyup(): JQuery = js.native
  def keyup(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mousedown(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mousedown(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mouseevent(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mouseevent(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mouseenter(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mouseenter(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mouseleave(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mouseleave(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mousemove(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mousemove(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mouseout(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mouseout(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mouseover(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mouseover(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mouseup(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def mouseup(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def off(events: String, selector: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def off(events: String, selector: js.Any): JQuery = js.native
  def off(events: String): JQuery = js.native
  def off(): JQuery = js.native
  def off(eventsMap: js.Any, selector: js.Any): JQuery = js.native
  def off(eventsMap: js.Any): JQuery = js.native
  def on(events: String, selector: js.Any, data: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def on(events: String, selector: js.Any, data: js.Any): JQuery = js.native
  def on(events: String, selector: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def on(events: String, selector: js.Any): JQuery = js.native
  def on(events: String, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def on(events: String): JQuery = js.native
  def on(eventsMap: js.Any, selector: js.Any, data: js.Any): JQuery = js.native
  def on(eventsMap: js.Any, selector: js.Any): JQuery = js.native
  def on(eventsMap: js.Any): JQuery = js.native
  def one(events: String, selector: js.Any, data: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def one(events: String, selector: js.Any, data: js.Any): JQuery = js.native
  def one(events: String, selector: js.Any): JQuery = js.native
  def one(events: String): JQuery = js.native
  def one(eventsMap: js.Any, selector: js.Any, data: js.Any): JQuery = js.native
  def one(eventsMap: js.Any, selector: js.Any): JQuery = js.native
  def one(eventsMap: js.Any): JQuery = js.native
  def ready(handler: js.Any): JQuery = js.native
  def resize(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def resize(eventData: js.Any): JQuery = js.native
  def resize(): JQuery = js.native
  def resize(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def scroll(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def scroll(eventData: js.Any): JQuery = js.native
  def scroll(): JQuery = js.native
  def scroll(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def select(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def select(eventData: js.Any): JQuery = js.native
  def select(): JQuery = js.native
  def select(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def submit(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def submit(eventData: js.Any): JQuery = js.native
  def submit(): JQuery = js.native
  def submit(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def trigger(eventType: String, extraParameters: js.Any*): JQuery = js.native
  def trigger(event: JQueryEventObject): JQuery = js.native
  def triggerHandler(eventType: String, extraParameters: js.Any*): js.Object = js.native
  def unbind(eventType: String, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def unbind(eventType: String): JQuery = js.native
  def unbind(): JQuery = js.native
  def unbind(eventType: String, fls: Boolean): JQuery = js.native
  def unbind(evt: js.Any): JQuery = js.native
  def undelegate(): JQuery = js.native
  def undelegate(selector: js.Any, eventType: String, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
  def undelegate(selector: js.Any, eventType: String): JQuery = js.native
  def undelegate(selector: js.Any, events: js.Any): JQuery = js.native
  def undelegate(namespace: String): JQuery = js.native
  var context: Element = js.native
  var jquery: String = js.native
  def pushStack(elements: js.Array[js.Any]): JQuery = js.native
  def pushStack(elements: js.Array[js.Any], name: js.Any, arguments: js.Any): JQuery = js.native
  def after(content: js.Any*): JQuery = js.native
  def after(func: js.Function1[js.Any, js.Any]): js.Dynamic = js.native
  def append(content: js.Any*): JQuery = js.native
  def append(func: js.Function2[js.Any, js.Any, js.Any]): js.Dynamic = js.native
  def appendTo(target: js.Any): JQuery = js.native
  def before(content: js.Any*): JQuery = js.native
  def before(func: js.Function1[js.Any, js.Any]): js.Dynamic = js.native
  def clone(withDataAndEvents: Boolean, deepWithDataAndEvents: Boolean): JQuery = js.native
  def clone(withDataAndEvents: Boolean): JQuery = js.native
  override def clone(): JQuery = js.native
  def detach(selector: js.Any): JQuery = js.native
  def detach(): JQuery = js.native
  def empty(): JQuery = js.native
  def insertAfter(target: js.Any): JQuery = js.native
  def insertBefore(target: js.Any): JQuery = js.native
  def prepend(content: js.Any*): JQuery = js.native
  def prepend(func: js.Function2[js.Any, js.Any, js.Any]): JQuery = js.native
  def prependTo(target: js.Any): JQuery = js.native
  def remove(selector: js.Any): JQuery = js.native
  def remove(): JQuery = js.native
  def replaceAll(target: js.Any): JQuery = js.native
  def replaceWith(func: js.Any): JQuery = js.native
  def text(textString: String): JQuery = js.native
  def text(): String = js.native
  def toArray(): js.Array[js.Any] = js.native
  def unwrap(): JQuery = js.native
  def wrap(wrappingElement: js.Any): JQuery = js.native
  def wrap(func: js.Function1[js.Any, js.Any]): JQuery = js.native
  def wrapAll(wrappingElement: js.Any): JQuery = js.native
  def wrapInner(wrappingElement: js.Any): JQuery = js.native
  def wrapInner(func: js.Function1[js.Any, js.Any]): JQuery = js.native
  def each(func: js.Function2[Int, Element, _]): JQuery = js.native
  def each(func: js.ThisFunction0[Element, _]): JQuery = js.native
  def get(index: Int): Element = js.native
  def get(): js.Array[Element] = js.native
  def index(selectorOrElement: js.Any): Int = js.native
  def index(): Int = js.native
  var length: Int = js.native
  @js.annotation.JSBracketAccess
  def apply(x: Int): dom.html.Element = js.native
  @js.annotation.JSBracketAccess
  def update(x: Int, v: dom.html.Element): Unit = js.native
  def add(selector: String, context: js.Any): JQuery = js.native
  def add(selector: String): JQuery = js.native
  def add(elements: js.Any*): JQuery = js.native
  def add(obj: JQuery): JQuery = js.native
  def addBack(selector: js.Any): JQuery = js.native
  def addBack(): JQuery = js.native
  def children(selector: js.Any): JQuery = js.native
  def children(): JQuery = js.native
  def closest(selector: String): JQuery = js.native
  def closest(selector: String, context: Element): JQuery = js.native
  def closest(obj: JQuery): JQuery = js.native
  def closest(element: js.Any): JQuery = js.native
  def closest(selectors: js.Any, context: Element): js.Array[js.Any] = js.native
  def contents(): JQuery = js.native
  def end(): JQuery = js.native
  def eq(index: Int): JQuery = js.native
  def filter(selector: String): JQuery = js.native
  def filter(func: js.Function2[Int, Element, Boolean]): JQuery = js.native
  def filter(func: js.ThisFunction0[Element, Boolean]): JQuery = js.native
  def filter(element: js.Any): JQuery = js.native
  def filter(obj: JQuery): JQuery = js.native
  def find(selector: String): JQuery = js.native
  def find(element: js.Any): JQuery = js.native
  def find(obj: JQuery): JQuery = js.native
  def first(): JQuery = js.native
  def has(selector: String): JQuery = js.native
  def has(contained: Element): JQuery = js.native
  def is(selector: String): Boolean = js.native
  def is(func: js.Function1[js.Any, js.Any]): Boolean = js.native
  def is(element: js.Any): Boolean = js.native
  def is(obj: JQuery): Boolean = js.native
  def last(): JQuery = js.native
  def map[B](callback: js.Function2[Int, Element, B]): JQuery = js.native
  def map[B](callback: js.ThisFunction0[Element, B]): JQuery = js.native
  def next(selector: String): JQuery = js.native
  def next(): JQuery = js.native
  def nextAll(selector: String): JQuery = js.native
  def nextAll(): JQuery = js.native
  def nextUntil(selector: String, filter: String): JQuery = js.native
  def nextUntil(selector: String): JQuery = js.native
  def nextUntil(): JQuery = js.native
  def nextUntil(element: Element, filter: String): JQuery = js.native
  def nextUntil(element: Element): JQuery = js.native
  def not(selector: String): JQuery = js.native
  def not(func: js.Function1[js.Any, js.Any]): JQuery = js.native
  def not(element: js.Any): JQuery = js.native
  def not(obj: JQuery): JQuery = js.native
  def offsetParent(): JQuery = js.native
  def parent(selector: String): JQuery = js.native
  def parent(): JQuery = js.native
  def parents(selector: String): JQuery = js.native
  def parents(): JQuery = js.native
  def parentsUntil(selector: String, filter: String): JQuery = js.native
  def parentsUntil(selector: String): JQuery = js.native
  def parentsUntil(): JQuery = js.native
  def parentsUntil(element: Element, filter: String): JQuery = js.native
  def parentsUntil(element: Element): JQuery = js.native
  def prev(selector: String): JQuery = js.native
  def prev(): JQuery = js.native
  def prevAll(selector: String): JQuery = js.native
  def prevAll(): JQuery = js.native
  def prevUntil(selector: String, filter: String): JQuery = js.native
  def prevUntil(selector: String): JQuery = js.native
  def prevUntil(): JQuery = js.native
  def prevUntil(element: Element, filter: String): JQuery = js.native
  def prevUntil(element: Element): JQuery = js.native
  def siblings(selector: String): JQuery = js.native
  def siblings(): JQuery = js.native
  def slice(start: Int, end: Int): JQuery = js.native
  def slice(start: Int): JQuery = js.native
}
