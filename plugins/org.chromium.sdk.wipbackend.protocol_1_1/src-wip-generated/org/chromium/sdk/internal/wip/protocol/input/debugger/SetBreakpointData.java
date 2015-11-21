// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Sets JavaScript breakpoint at a given location.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface SetBreakpointData {
  /**
   Id of the created breakpoint for further reference.
   */
  String/*See org.chromium.sdk.internal.wip.protocol.common.debugger.BreakpointIdTypedef*/ breakpointId();

  /**
   Location this breakpoint resolved into.
   */
  org.chromium.sdk.internal.wip.protocol.input.debugger.LocationValue actualLocation();

}
