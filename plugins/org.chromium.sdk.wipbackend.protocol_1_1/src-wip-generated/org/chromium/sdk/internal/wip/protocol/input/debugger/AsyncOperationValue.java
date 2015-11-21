// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Information about the async operation.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface AsyncOperationValue {
  /**
   Unique id of the async operation.
   */
  long id();

  /**
   String description of the async operation.
   */
  String description();

  /**
   Stack trace where async operation was scheduled.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.console.CallFrameValue>/*See org.chromium.sdk.internal.wip.protocol.input.console.StackTraceTypedef*/ stackTrace();

  /**
   Asynchronous stack trace where async operation was scheduled, if available.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.console.AsyncStackTraceValue asyncStackTrace();

}
