package org.scalajs.jquery

import scala.scalajs.js
import org.scalajs.dom._

import js.annotation.JSName

trait JQueryAjaxSettings extends js.Object {
  var accepts: js.Any = _
  var async: Boolean = _
  def beforeSend(jqXHR: JQueryXHR, settings: JQueryAjaxSettings): js.Dynamic = ???
  var cache: Boolean = _
  def complete(jqXHR: JQueryXHR, textStatus: String): js.Dynamic = ???
  var contents: js.Any = _
  var contentType: js.Any = _
  var context: js.Any = _
  var converters: js.Any = _
  var crossDomain: Boolean = _
  var data: js.Any = _
  def dataFilter(data: js.Any, ty: js.Any): js.Dynamic = ???
  var dataType: String = _
  def error(jqXHR: JQueryXHR, textStatus: String, errorThrow: String): js.Dynamic = ???
  var global: Boolean = _
  var headers: js.Any = _
  var ifModified: Boolean = _
  var isLocal: Boolean = _
  var jsonp: String = _
  var jsonpCallback: js.Any = _
  var mimeType: String = _
  var password: String = _
  var processData: Boolean = _
  var scriptCharset: String = _
  var statusCode: js.Any = _
  def success(data: js.Any, textStatus: String, jqXHR: JQueryXHR): js.Dynamic = ???
  var timeout: Double = _
  var traditional: Boolean = _
  var `type`: String = _
  var url: String = _
  var username: String = _
  var xhr: js.Any = _
  var xhrFields: js.Any = _
}

trait JQueryXHR extends XMLHttpRequest with JQueryPromise {
  def overrideMimeType(): js.Dynamic = ???
}

trait JQueryCallback extends js.Object {
  def add(callbacks: js.Any*): js.Dynamic = ???
  def disable(): js.Dynamic = ???
  def empty(): js.Dynamic = ???
  def fire(arguments: js.Any*): js.Dynamic = ???
  def fired(): Boolean = ???
  def fireWith(context: js.Any, args: js.Any*): js.Dynamic = ???
  def has(callback: js.Any): Boolean = ???
  def lock(): js.Dynamic = ???
  def locked(): Boolean = ???
  def removed(callbacks: js.Any*): js.Dynamic = ???
}

trait JQueryPromise extends js.Object {
  def always(alwaysCallbacks: js.Any*): JQueryDeferred = ???
  def done(doneCallbacks: js.Any*): JQueryDeferred = ???
  def fail(failCallbacks: js.Any*): JQueryDeferred = ???
  def pipe(doneFilter: js.Function1[js.Any, js.Any] = ???, failFilter: js.Function1[js.Any, js.Any] = ???, progressFilter: js.Function1[js.Any, js.Any] = ???): JQueryPromise = ???
  def `then`(doneCallbacks: js.Any, failCallbacks: js.Any, progressCallbacks: js.Any = ???): JQueryDeferred = ???
}

trait JQueryDeferred extends JQueryPromise {
  def notify(args: js.Any*): JQueryDeferred = ???
  def notifyWith(context: js.Any, args: js.Any*): JQueryDeferred = ???
  def progress(progressCallbacks: js.Any*): JQueryDeferred = ???
  def reject(args: js.Any*): JQueryDeferred = ???
  def rejectWith(context: js.Any, args: js.Any*): JQueryDeferred = ???
  def resolve(args: js.Any*): JQueryDeferred = ???
  def resolveWith(context: js.Any, args: js.Any*): JQueryDeferred = ???
  def state(): String = ???
}

trait JQueryEventObject extends Event {
  var data: js.Any = _
  var delegateTarget: Element = _
  def isDefaultPrevented(): Boolean = ???
  def isImmediatePropogationStopped(): Boolean = ???
  def isPropogationStopped(): Boolean = ???
  var namespace: String = _
  override def preventDefault(): Unit = ??? // js.Dynamic
  var relatedTarget: Element = _
  var result: js.Any = _
  override def stopImmediatePropagation(): Unit = ??? // js.Dynamic
  override def stopPropagation(): Unit = ??? // js.Dynamic
  var pageX: Int = _
  var pageY: Int = _
  var which: Int = _
  var metaKey: js.Any = _
}

trait JQueryBrowserInfo extends js.Object {
  var safari: Boolean = _
  var opera: Boolean = _
  var msie: Boolean = _
  var mozilla: Boolean = _
  var version: String = _
}

trait JQuerySupport extends js.Object {
  var ajax: Boolean = _
  var boxModel: Boolean = _
  var changeBubbles: Boolean = _
  var checkClone: Boolean = _
  var checkOn: Boolean = _
  var cors: Boolean = _
  var cssFloat: Boolean = _
  var hrefNormalized: Boolean = _
  var htmlSerialize: Boolean = _
  var leadingWhitespace: Boolean = _
  var noCloneChecked: Boolean = _
  var noCloneEvent: Boolean = _
  var opacity: Boolean = _
  var optDisabled: Boolean = _
  var optSelected: Boolean = _
  def scriptEval(): Boolean = ???
  var style: Boolean = _
  var submitBubbles: Boolean = _
  var tbody: Boolean = _
}

trait JQueryTransport extends js.Object {
  def send(headers: js.Any, completeCallback: js.Function4[Int, String, js.Any, String, Unit]): Unit = ???
  def abort(): Unit = ???
}

trait JQueryStatic extends js.Object {
  def ajax(settings: JQueryAjaxSettings): js.Dynamic = ???
  def ajax(url: String, settings: JQueryAjaxSettings): js.Dynamic = ???
  def ajaxPrefilter(dataTypes: String, handler: js.Function3[js.Any, js.Any, JQueryXHR, js.Any]): js.Dynamic = ???
  def ajaxPrefilter(handler: js.Function3[js.Any, js.Any, JQueryXHR, js.Any]): js.Dynamic = ???
  def ajaxSetup(options: js.Any): js.Dynamic = ???
  def ajaxTransport(dataType: String, handler: js.Function3[JQueryAjaxSettings, JQueryAjaxSettings, JQueryXHR, JQueryTransport]): Unit = ???
  def get(url: String, data: js.Any = ???, success: js.Any = ???, dataType: js.Any = ???): JQueryXHR = ???
  def getJSON(url: String, data: js.Any = ???, success: js.Any = ???): JQueryXHR = ???
  def getScript(url: String, success: js.Any = ???): JQueryXHR = ???
  def param(obj: js.Any, traditional: Boolean = ???): String = ???
  def post(url: String, data: js.Any = ???, success: js.Any = ???, dataType: js.Any = ???): JQueryXHR = ???
  def Callbacks(flags: js.Any): JQueryCallback = ???
  def holdReady(hold: Boolean): js.Dynamic = ???
  def apply(selector: String, context: js.Any): JQuery = ???
  def apply(selector: String): JQuery = ???
  def apply(element: Element): JQuery = ???
  def apply(`object`: js.Any): JQuery = ???
  def apply(elementArray: js.Array[Element]): JQuery = ???
  def apply(`object`: JQuery): JQuery = ???
  def apply(func: js.Function): JQuery = ???
  def apply(): JQuery = ???
  def noConflict(removeAll: Boolean = ???): Object = ???
  def when(deferreds: js.Any*): JQueryPromise = ???
  def css(e: js.Any, propertyName: String, value: js.Any): js.Dynamic = ???
  def css(e: js.Any, propertyName: String): js.Dynamic = ???
  def css(e: js.Any, propertyName: js.Any, value: js.Any): js.Dynamic = ???
  def css(e: js.Any, propertyName: js.Any): js.Dynamic = ???
  var cssHooks: js.Any = _
  def data(element: Element, key: String, value: js.Any): Object = ???
  def dequeue(element: Element, queueName: String = ???): js.Dynamic = ???
  def hasData(element: Element): Boolean = ???
  def queue(element: Element, queueName: String = ???): js.Array[js.Any] = ???
  def queue(element: Element, queueName: String, newQueueOrCallback: js.Any): JQuery = ???
  def removeData(element: Element, name: String = ???): JQuery = ???
  def Deferred(beforeStart: js.Function1[JQueryDeferred, js.Any] = ???): JQueryDeferred = ???
  var fx: js.Any = _
  def proxy(func: js.Function, context: js.Any): js.Dynamic = ???
  def proxy(context: js.Any, name: String): js.Dynamic = ???
  def error(message: js.Any): js.Dynamic = ???
  var expr: js.Any = _
  var fn: js.Any = _
  var isReady: Boolean = _
  var browser: JQueryBrowserInfo = _
  var support: JQuerySupport = _
  def contains(container: Element, contained: Element): Boolean = ???
  def each(collection: js.Any, callback: js.Function2[Int, HTMLElement, Any]): js.Dynamic = ???
  def each(collection: js.Any, callback: js.ThisFunction0[js.Any, Any]): js.Dynamic = ???
  def extend(target: js.Any, objs: js.Any*): Object = ???
  def extend(deep: Boolean, target: js.Any, objs: js.Any*): Object = ???
  def globalEval(code: String): js.Dynamic = ???
  def grep(array: js.Array[js.Any], func: js.Any, invert: Boolean): js.Array[js.Any] = ???
  def inArray(value: js.Any, array: js.Array[js.Any], fromIndex: Int = ???): Int = ???
  def isArray(obj: js.Any): Boolean = ???
  def isEmptyObject(obj: js.Any): Boolean = ???
  def isFunction(obj: js.Any): Boolean = ???
  def isNumeric(value: js.Any): Boolean = ???
  def isPlainObject(obj: js.Any): Boolean = ???
  def isWindow(obj: js.Any): Boolean = ???
  def isXMLDoc(node: Node): Boolean = ???
  def makeArray(obj: js.Any): js.Array[js.Any] = ???
  def map(array: js.Array[js.Any], callback: js.Function2[Int, HTMLElement, Any]): js.Array[Any] = ???
  def map(array: js.Array[js.Any], callback: js.Function1[Int, Any]): js.Array[Any] = ???
  def merge(first: js.Array[js.Any], second: js.Array[js.Any]): js.Array[js.Any] = ???
  def noop(): js.Dynamic = ???
  def now(): Double = ???
  def parseHTML(data: String, context: Element = ???, keepScripts: Boolean = ???): js.Array[js.Any] = ???
  def parseJSON(json: String): js.Dynamic = ???
  def parseXML(data: String): js.Dynamic = ???
  def queue(element: Element, queueName: String, newQueue: js.Array[js.Any]): JQuery = ???
  def trim(str: String): String = ???
  def `type`(obj: js.Any): String = ???
  def unique(arr: js.Array[js.Any]): js.Array[js.Any] = ???
}

trait JQuery extends js.Object {
  def ajaxComplete(handler: js.Any): JQuery = ???
  def ajaxError(handler: js.Function3[js.Any, js.Any, js.Any, js.Any]): JQuery = ???
  def ajaxSend(handler: js.Function3[js.Any, js.Any, js.Any, js.Any]): JQuery = ???
  def ajaxStart(handler: js.Function0[js.Any]): JQuery = ???
  def ajaxStop(handler: js.Function0[js.Any]): JQuery = ???
  def ajaxSuccess(handler: js.Function3[js.Any, js.Any, js.Any, js.Any]): JQuery = ???
  def serialize(): String = ???
  def serializeArray(): js.Array[js.Any] = ???
  def addClass(classNames: String): JQuery = ???
  def addClass(func: js.Function2[js.Any, js.Any, JQuery]): js.Dynamic = ???
  def attr(attributeName: String): String = ???
  def attr(attributeName: String, value: js.Any): JQuery = ???
  def attr(map: js.Any): JQuery = ???
  def attr(attributeName: String, func: js.Function2[js.Any, js.Any, js.Any]): JQuery = ???
  def hasClass(className: String): Boolean = ???
  def html(htmlString: String): JQuery = ???
  def html(): String = ???
  def prop(propertyName: String): js.Dynamic = ???
  def prop(propertyName: String, value: js.Any): JQuery = ???
  def prop(map: js.Any): JQuery = ???
  def prop(propertyName: String, func: js.Function2[js.Any, js.Any, js.Any]): JQuery = ???
  def removeAttr(attributeName: js.Any): JQuery = ???
  def removeClass(className: js.Any): JQuery = ???
  def removeClass(): JQuery = ???
  def removeClass(func: js.Function2[js.Any, js.Any, js.Any]): JQuery = ???
  def removeProp(propertyName: js.Any): JQuery = ???
  def toggleClass(className: js.Any, swtch: Boolean): JQuery = ???
  def toggleClass(className: js.Any): JQuery = ???
  def toggleClass(swtch: Boolean): JQuery = ???
  def toggleClass(): JQuery = ???
  def toggleClass(func: js.Function3[js.Any, js.Any, js.Any, js.Any]): JQuery = ???
  def `val`(): js.Dynamic = ???
  def `val`(value: js.Array[String]): JQuery = ???
  def `val`(value: String): JQuery = ???
  def `val`(func: js.Function2[js.Any, js.Any, js.Any]): JQuery = ???
  @JSName("val") def value(): js.Dynamic = ???
  @JSName("val") def value(value: js.Array[String]): JQuery = ???
  @JSName("val") def value(value: String): JQuery = ???
  @JSName("val") def value(func: js.Function2[js.Any, js.Any, js.Any]): JQuery = ???
  def css(propertyNames: js.Array[js.Any]): String = ???
  def css(propertyName: String): String = ???
  def css(propertyName: String, value: js.Any): JQuery = ???
  def css(propertyName: js.Any, value: js.Any): JQuery = ???
  def css(propertyName: js.Any): JQuery = ???
  def height(): Double = ???
  def height(value: Double): JQuery = ???
  def height(func: js.Function2[js.Any, js.Any, js.Any]): JQuery = ???
  def innerHeight(): Double = ???
  def innerWidth(): Double = ???
  def offset(): js.Any = ???
  def offset(coordinates: js.Any): JQuery = ???
  def offset(func: js.Function2[js.Any, js.Any, js.Any]): JQuery = ???
  def outerHeight(includeMargin: Boolean = ???): Double = ???
  def outerWidth(includeMargin: Boolean = ???): Double = ???
  def position(): js.Any = ???
  def scrollLeft(): Int = ???
  def scrollLeft(value: Int): JQuery = ???
  def scrollTop(): Int = ???
  def scrollTop(value: Int): JQuery = ???
  def width(): Double = ???
  def width(value: Double): JQuery = ???
  def width(func: js.Function2[js.Any, js.Any, js.Any]): JQuery = ???
  def clearQueue(queueName: String): JQuery = ???
  def clearQueue(): JQuery = ???
  def data(key: String, value: js.Any): JQuery = ???
  def data(obj: js.Any): JQuery = ???
  def data(key: String): js.Dynamic = ???
  def data(): js.Dynamic = ???
  def dequeue(queueName: String): JQuery = ???
  def dequeue(): JQuery = ???
  def queue(queueName: String): js.Array[js.Any] = ???
  def queue(): js.Array[js.Any] = ???
  def queue(queueName: String, newQueueOrCallback: js.Any): JQuery = ???
  def queue(newQueueOrCallback: js.Any): JQuery = ???
  def removeData(nameOrList: js.Any): JQuery = ???
  def removeData(): JQuery = ???
  def promise(`type`: js.Any = ???, target: js.Any = ???): JQueryPromise = ???
  def animate(properties: js.Any, duration: js.Any = ???, easing: String = ???, complete: js.Function = ???): JQuery = ???
  def delay(duration: Int, queueName: String = ???): JQuery = ???
  def fadeIn(duration: js.Any, callback: js.Any): JQuery = ???
  def fadeIn(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = ???
  def fadeOut(duration: js.Any, callback: js.Any): JQuery = ???
  def fadeOut(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = ???
  def fadeTo(duration: js.Any, opacity: Double, callback: js.Any): JQuery = ???
  def fadeTo(duration: js.Any, opacity: Double = ???, easing: String = ???, callback: js.Any = ???): JQuery = ???
  def fadeToggle(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = ???
  def finish(queue: String = ???): JQuery = ???
  def hide(duration: js.Any, callback: js.Any): JQuery = ???
  def hide(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = ???
  def show(duration: js.Any, callback: js.Any): JQuery = ???
  def show(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = ???
  def slideDown(duration: js.Any, callback: js.Any): JQuery = ???
  def slideDown(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = ???
  def slideToggle(duration: js.Any, callback: js.Any): JQuery = ???
  def slideToggle(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = ???
  def slideUp(duration: js.Any, callback: js.Any): JQuery = ???
  def slideUp(duration: js.Any = ???, easing: String = ???, callback: js.Any = ???): JQuery = ???
  def stop(clearQueue: Boolean = ???, jumpToEnd: Boolean = ???): JQuery = ???
  def stop(queue: js.Any, clearQueue: Boolean, jumpToEnd: Boolean): JQuery = ???
  def stop(queue: js.Any, clearQueue: Boolean): JQuery = ???
  def stop(queue: js.Any): JQuery = ???
  def bind(eventType: String, eventData: js.Any = ???, handler: js.Function1[JQueryEventObject, js.Any] = ???): JQuery = ???
  def bind(eventType: String, eventData: js.Any, preventBubble: Boolean): JQuery = ???
  def bind(eventType: String, preventBubble: Boolean): JQuery = ???
  def bind(events: js.Any*): js.Dynamic = ???
  def blur(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def blur(eventData: js.Any): JQuery = ???
  def blur(): JQuery = ???
  def blur(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def change(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def change(eventData: js.Any): JQuery = ???
  def change(): JQuery = ???
  def change(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def click(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def click(eventData: js.Any): JQuery = ???
  def click(): JQuery = ???
  def click(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def dblclick(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def dblclick(eventData: js.Any): JQuery = ???
  def dblclick(): JQuery = ???
  def dblclick(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def delegate(selector: js.Any, eventType: String, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def focus(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def focus(eventData: js.Any): JQuery = ???
  def focus(): JQuery = ???
  def focus(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def focusin(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def focusin(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def focusout(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def focusout(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def hover(handlerIn: js.Function1[JQueryEventObject, js.Any], handlerOut: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def hover(handlerInOut: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def keydown(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def keydown(eventData: js.Any): JQuery = ???
  def keydown(): JQuery = ???
  def keydown(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def keypress(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def keypress(eventData: js.Any): JQuery = ???
  def keypress(): JQuery = ???
  def keypress(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def keyup(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def keyup(eventData: js.Any): JQuery = ???
  def keyup(): JQuery = ???
  def keyup(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mousedown(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mousedown(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mouseevent(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mouseevent(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mouseenter(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mouseenter(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mouseleave(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mouseleave(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mousemove(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mousemove(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mouseout(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mouseout(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mouseover(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mouseover(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mouseup(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def mouseup(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def off(events: String, selector: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def off(events: String, selector: js.Any): JQuery = ???
  def off(events: String): JQuery = ???
  def off(): JQuery = ???
  def off(eventsMap: js.Any, selector: js.Any): JQuery = ???
  def off(eventsMap: js.Any): JQuery = ???
  def on(events: String, selector: js.Any, data: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def on(events: String, selector: js.Any, data: js.Any): JQuery = ???
  def on(events: String, selector: js.Any): JQuery = ???
  def on(events: String): JQuery = ???
  def on(eventsMap: js.Any, selector: js.Any, data: js.Any): JQuery = ???
  def on(eventsMap: js.Any, selector: js.Any): JQuery = ???
  def on(eventsMap: js.Any): JQuery = ???
  def one(events: String, selector: js.Any, data: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def one(events: String, selector: js.Any, data: js.Any): JQuery = ???
  def one(events: String, selector: js.Any): JQuery = ???
  def one(events: String): JQuery = ???
  def one(eventsMap: js.Any, selector: js.Any, data: js.Any): JQuery = ???
  def one(eventsMap: js.Any, selector: js.Any): JQuery = ???
  def one(eventsMap: js.Any): JQuery = ???
  def ready(handler: js.Any): JQuery = ???
  def resize(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def resize(eventData: js.Any): JQuery = ???
  def resize(): JQuery = ???
  def resize(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def scroll(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def scroll(eventData: js.Any): JQuery = ???
  def scroll(): JQuery = ???
  def scroll(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def select(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def select(eventData: js.Any): JQuery = ???
  def select(): JQuery = ???
  def select(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def submit(eventData: js.Any, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def submit(eventData: js.Any): JQuery = ???
  def submit(): JQuery = ???
  def submit(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def trigger(eventType: String, extraParameters: js.Any*): JQuery = ???
  def trigger(event: JQueryEventObject): JQuery = ???
  def triggerHandler(eventType: String, extraParameters: js.Any*): Object = ???
  def unbind(eventType: String, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def unbind(eventType: String): JQuery = ???
  def unbind(): JQuery = ???
  def unbind(eventType: String, fls: Boolean): JQuery = ???
  def unbind(evt: js.Any): JQuery = ???
  def undelegate(): JQuery = ???
  def undelegate(selector: js.Any, eventType: String, handler: js.Function1[JQueryEventObject, js.Any]): JQuery = ???
  def undelegate(selector: js.Any, eventType: String): JQuery = ???
  def undelegate(selector: js.Any, events: js.Any): JQuery = ???
  def undelegate(namespace: String): JQuery = ???
  var context: Element = _
  var jquery: String = _
  def pushStack(elements: js.Array[js.Any]): JQuery = ???
  def pushStack(elements: js.Array[js.Any], name: js.Any, arguments: js.Any): JQuery = ???
  def after(content: js.Any*): JQuery = ???
  def after(func: js.Function1[js.Any, js.Any]): js.Dynamic = ???
  def append(content: js.Any*): JQuery = ???
  def append(func: js.Function2[js.Any, js.Any, js.Any]): js.Dynamic = ???
  def appendTo(target: js.Any): JQuery = ???
  def before(content: js.Any*): JQuery = ???
  def before(func: js.Function1[js.Any, js.Any]): js.Dynamic = ???
  def clone(withDataAndEvents: Boolean, deepWithDataAndEvents: Boolean): JQuery = ???
  def clone(withDataAndEvents: Boolean): JQuery = ???
  override def clone(): JQuery = ???
  def detach(selector: js.Any): JQuery = ???
  def detach(): JQuery = ???
  def empty(): JQuery = ???
  def insertAfter(target: js.Any): JQuery = ???
  def insertBefore(target: js.Any): JQuery = ???
  def prepend(content: js.Any*): JQuery = ???
  def prepend(func: js.Function2[js.Any, js.Any, js.Any]): JQuery = ???
  def prependTo(target: js.Any): JQuery = ???
  def remove(selector: js.Any): JQuery = ???
  def remove(): JQuery = ???
  def replaceAll(target: js.Any): JQuery = ???
  def replaceWith(func: js.Any): JQuery = ???
  def text(textString: String): JQuery = ???
  def text(): String = ???
  def toArray(): js.Array[js.Any] = ???
  def unwrap(): JQuery = ???
  def wrap(wrappingElement: js.Any): JQuery = ???
  def wrap(func: js.Function1[js.Any, js.Any]): JQuery = ???
  def wrapAll(wrappingElement: js.Any): JQuery = ???
  def wrapInner(wrappingElement: js.Any): JQuery = ???
  def wrapInner(func: js.Function1[js.Any, js.Any]): JQuery = ???
  def each(func: js.Function2[Int, HTMLElement, Any]): JQuery = ???
  def each(func: js.Function1[Int, Any]): JQuery = ???
  def each(func: js.ThisFunction0[js.Any, Any]): JQuery = ???
  def get(index: Int): js.Dynamic = ???
  def get(): js.Dynamic = ???
  def index(selectorOrElement: js.Any): Int = ???
  def index(): Int = ???
  var length: Int = _
  @js.annotation.JSBracketAccess
  def apply(x: Int): HTMLElement = ???
  @js.annotation.JSBracketAccess
  def update(x: Int, v: HTMLElement): Unit = ???
  def add(selector: String, context: js.Any): JQuery = ???
  def add(selector: String): JQuery = ???
  def add(elements: js.Any*): JQuery = ???
  def add(obj: JQuery): JQuery = ???
  def addBack(selector: js.Any): JQuery = ???
  def addBack(): JQuery = ???
  def children(selector: js.Any): JQuery = ???
  def children(): JQuery = ???
  def closest(selector: String): JQuery = ???
  def closest(selector: String, context: Element): JQuery = ???
  def closest(obj: JQuery): JQuery = ???
  def closest(element: js.Any): JQuery = ???
  def closest(selectors: js.Any, context: Element): js.Array[js.Any] = ???
  def contents(): JQuery = ???
  def end(): JQuery = ???
  def eq(index: Int): JQuery = ???
  def filter(selector: String): JQuery = ???
  def filter(func: js.Function2[Int, HTMLElement, js.Any]): JQuery = ???
  def filter(func: js.Function1[Int, js.Any]): JQuery = ???
  def filter(element: js.Any): JQuery = ???
  def filter(obj: JQuery): JQuery = ???
  def find(selector: String): JQuery = ???
  def find(element: js.Any): JQuery = ???
  def find(obj: JQuery): JQuery = ???
  def first(): JQuery = ???
  def has(selector: String): JQuery = ???
  def has(contained: Element): JQuery = ???
  def is(selector: String): Boolean = ???
  def is(func: js.Function1[js.Any, js.Any]): Boolean = ???
  def is(element: js.Any): Boolean = ???
  def is(obj: JQuery): Boolean = ???
  def last(): JQuery = ???
  def map(callback: js.Function2[Int, HTMLElement, Any]): JQuery = ???
  def map(callback: js.Function1[Int, Any]): JQuery = ???
  def map(callback: js.ThisFunction0[js.Any, Any]): JQuery = ???
  def next(selector: String): JQuery = ???
  def next(): JQuery = ???
  def nextAll(selector: String): JQuery = ???
  def nextAll(): JQuery = ???
  def nextUntil(selector: String, filter: String): JQuery = ???
  def nextUntil(selector: String): JQuery = ???
  def nextUntil(): JQuery = ???
  def nextUntil(element: Element, filter: String): JQuery = ???
  def nextUntil(element: Element): JQuery = ???
  def not(selector: String): JQuery = ???
  def not(func: js.Function1[js.Any, js.Any]): JQuery = ???
  def not(element: js.Any): JQuery = ???
  def not(obj: JQuery): JQuery = ???
  def offsetParent(): JQuery = ???
  def parent(selector: String): JQuery = ???
  def parent(): JQuery = ???
  def parents(selector: String): JQuery = ???
  def parents(): JQuery = ???
  def parentsUntil(selector: String, filter: String): JQuery = ???
  def parentsUntil(selector: String): JQuery = ???
  def parentsUntil(): JQuery = ???
  def parentsUntil(element: Element, filter: String): JQuery = ???
  def parentsUntil(element: Element): JQuery = ???
  def prev(selector: String): JQuery = ???
  def prev(): JQuery = ???
  def prevAll(selector: String): JQuery = ???
  def prevAll(): JQuery = ???
  def prevUntil(selector: String, filter: String): JQuery = ???
  def prevUntil(selector: String): JQuery = ???
  def prevUntil(): JQuery = ???
  def prevUntil(element: Element, filter: String): JQuery = ???
  def prevUntil(element: Element): JQuery = ???
  def siblings(selector: String): JQuery = ???
  def siblings(): JQuery = ???
  def slice(start: Int, end: Int): JQuery = ???
  def slice(start: Int): JQuery = ???
}
