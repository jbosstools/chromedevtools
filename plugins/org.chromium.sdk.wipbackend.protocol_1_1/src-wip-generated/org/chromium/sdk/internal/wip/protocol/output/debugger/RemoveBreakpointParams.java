// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.debugger;

/**
Removes JavaScript breakpoint.
 */
public class RemoveBreakpointParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  public RemoveBreakpointParams(String/*See org.chromium.sdk.internal.wip.protocol.common.debugger.BreakpointIdTypedef*/ breakpointId) {
    this.put("breakpointId", breakpointId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".removeBreakpoint";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
