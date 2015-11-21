// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.debugger;

/**
Steps into the first async operation handler that was scheduled by or after the current statement.
 */
public class StepIntoAsyncParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  public StepIntoAsyncParams() {
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".stepIntoAsync";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
