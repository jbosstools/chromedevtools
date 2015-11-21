// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 JavaScript call stack, including async stack traces.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface StackTraceValue {
  /**
   Call frames of the stack trace.
   */
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.debugger.CallFrameValue> callFrames();

  /**
   String label of this stack trace. For async traces this may be a name of the function that initiated the async call.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String description();

  /**
   Async stack trace, if any.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.debugger.StackTraceValue asyncStackTrace();

}
