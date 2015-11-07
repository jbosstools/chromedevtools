// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.console;

/**
 Asynchronous JavaScript call stack.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface AsyncStackTraceValue {
  /**
   Call frames of the stack trace.
   */
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.console.CallFrameValue> callFrames();

  /**
   String label of this stack trace. For async traces this may be a name of the function that initiated the async call.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String description();

  /**
   Next asynchronous stack trace, if any.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.console.AsyncStackTraceValue asyncStackTrace();

}
