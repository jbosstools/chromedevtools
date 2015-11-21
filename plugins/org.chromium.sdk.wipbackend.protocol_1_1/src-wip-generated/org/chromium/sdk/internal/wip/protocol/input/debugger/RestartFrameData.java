// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Restarts particular call frame from the beginning.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface RestartFrameData {
  /**
   New stack trace.
   */
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.debugger.CallFrameValue> callFrames();

  /**
   Async stack trace, if any.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.debugger.StackTraceValue asyncStackTrace();

}
