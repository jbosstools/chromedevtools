// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.dom;

/**
Creates a deep copy of the specified node and places it into the target container before the given anchor.
 */
public class CopyToParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.sdk.internal.wip.protocol.input.dom.CopyToData> {
  /**
   @param nodeId Id of the node to copy.
   @param targetNodeId Id of the element to drop the copy into.
   @param insertBeforeNodeIdOpt Drop the copy before this node (if absent, the copy becomes the last child of <code>targetNodeId</code>).
   */
  public CopyToParams(long/*See org.chromium.sdk.internal.wip.protocol.common.dom.NodeIdTypedef*/ nodeId, long/*See org.chromium.sdk.internal.wip.protocol.common.dom.NodeIdTypedef*/ targetNodeId, Long/*See org.chromium.sdk.internal.wip.protocol.common.dom.NodeIdTypedef*/ insertBeforeNodeIdOpt) {
    this.put("nodeId", nodeId);
    this.put("targetNodeId", targetNodeId);
    if (insertBeforeNodeIdOpt != null) {
      this.put("insertBeforeNodeId", insertBeforeNodeIdOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".copyTo";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.sdk.internal.wip.protocol.input.dom.CopyToData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseDOMCopyToData(data.getUnderlyingObject());
  }

}
