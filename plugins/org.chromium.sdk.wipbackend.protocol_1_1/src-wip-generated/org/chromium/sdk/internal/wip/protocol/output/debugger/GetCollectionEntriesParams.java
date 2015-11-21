// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.debugger;

/**
Returns entries of given collection.
 */
public class GetCollectionEntriesParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.sdk.internal.wip.protocol.input.debugger.GetCollectionEntriesData> {
  /**
   @param objectId Id of the collection to get entries for.
   */
  public GetCollectionEntriesParams(String/*See org.chromium.sdk.internal.wip.protocol.common.runtime.RemoteObjectIdTypedef*/ objectId) {
    this.put("objectId", objectId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".getCollectionEntries";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.sdk.internal.wip.protocol.input.debugger.GetCollectionEntriesData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseDebuggerGetCollectionEntriesData(data.getUnderlyingObject());
  }

}
