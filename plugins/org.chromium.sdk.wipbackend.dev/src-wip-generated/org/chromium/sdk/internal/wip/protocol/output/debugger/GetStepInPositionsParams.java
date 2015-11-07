// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.debugger;

/**
Lists all positions where step-in is possible for a current statement in a specified call frame
 */
public class GetStepInPositionsParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.sdk.internal.wip.protocol.input.debugger.GetStepInPositionsData> {
  /**
   @param callFrameId Id of a call frame where the current statement should be analized
   */
  public GetStepInPositionsParams(String/*See org.chromium.sdk.internal.wip.protocol.common.debugger.CallFrameIdTypedef*/ callFrameId) {
    this.put("callFrameId", callFrameId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".getStepInPositions";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.sdk.internal.wip.protocol.input.debugger.GetStepInPositionsData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseDebuggerGetStepInPositionsData(data.getUnderlyingObject());
  }

}
