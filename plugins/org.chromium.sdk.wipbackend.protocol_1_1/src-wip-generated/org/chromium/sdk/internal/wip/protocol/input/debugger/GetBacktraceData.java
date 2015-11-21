// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Returns call stack including variables changed since VM was paused. VM must be paused.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface GetBacktraceData {
  /**
   Call stack the virtual machine stopped on.
   */
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.debugger.CallFrameValue> callFrames();

  /**
   Async stack trace, if any.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.debugger.StackTraceValue asyncStackTrace();

}
