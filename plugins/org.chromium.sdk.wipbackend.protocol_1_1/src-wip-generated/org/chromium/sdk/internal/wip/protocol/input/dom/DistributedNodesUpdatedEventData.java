// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.dom;

/**
 Called when distrubution is changed.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface DistributedNodesUpdatedEventData {
  /**
   Insertion point where distrubuted nodes were updated.
   */
  long/*See org.chromium.sdk.internal.wip.protocol.common.dom.NodeIdTypedef*/ insertionPointId();

  /**
   Distributed nodes for given insertion point.
   */
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.dom.BackendNodeValue> distributedNodes();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.dom.DistributedNodesUpdatedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.dom.DistributedNodesUpdatedEventData>("DOM.distributedNodesUpdated", org.chromium.sdk.internal.wip.protocol.input.dom.DistributedNodesUpdatedEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.dom.DistributedNodesUpdatedEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDOMDistributedNodesUpdatedEventData(obj);
    }
  };
}
