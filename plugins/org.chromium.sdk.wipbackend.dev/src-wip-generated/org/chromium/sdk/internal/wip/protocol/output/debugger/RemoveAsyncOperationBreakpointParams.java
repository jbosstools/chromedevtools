// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.debugger;

/**
Removes AsyncOperation breakpoint.
 */
public class RemoveAsyncOperationBreakpointParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param operationId ID of the async operation to remove breakpoint for.
   */
  public RemoveAsyncOperationBreakpointParams(long operationId) {
    this.put("operationId", operationId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".removeAsyncOperationBreakpoint";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
