// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.debugger;

/**
Activates / deactivates all breakpoints on the page.
 */
public class SetBreakpointsActiveParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param active New value for breakpoints active state.
   */
  public SetBreakpointsActiveParams(boolean active) {
    this.put("active", active);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".setBreakpointsActive";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
