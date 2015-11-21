// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.dom;

/**
Requests that a batch of nodes is sent to the caller given their backend node ids.
 */
public class PushNodesByBackendIdsToFrontendParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.sdk.internal.wip.protocol.input.dom.PushNodesByBackendIdsToFrontendData> {
  /**
   @param backendNodeIds The array of backend node ids.
   */
  public PushNodesByBackendIdsToFrontendParams(java.util.List<Long/*See org.chromium.sdk.internal.wip.protocol.common.dom.BackendNodeIdTypedef*/> backendNodeIds) {
    this.put("backendNodeIds", backendNodeIds);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".pushNodesByBackendIdsToFrontend";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.sdk.internal.wip.protocol.input.dom.PushNodesByBackendIdsToFrontendData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseDOMPushNodesByBackendIdsToFrontendData(data.getUnderlyingObject());
  }

}
