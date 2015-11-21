// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.debugger;

/**
Returns <code>Promise</code> with specified ID.
 */
public class GetPromiseByIdParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.sdk.internal.wip.protocol.input.debugger.GetPromiseByIdData> {
  /**
   @param objectGroupOpt Symbolic group name that can be used to release multiple objects.
   */
  public GetPromiseByIdParams(long promiseId, String objectGroupOpt) {
    this.put("promiseId", promiseId);
    if (objectGroupOpt != null) {
      this.put("objectGroup", objectGroupOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".getPromiseById";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.sdk.internal.wip.protocol.input.debugger.GetPromiseByIdData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseDebuggerGetPromiseByIdData(data.getUnderlyingObject());
  }

}
