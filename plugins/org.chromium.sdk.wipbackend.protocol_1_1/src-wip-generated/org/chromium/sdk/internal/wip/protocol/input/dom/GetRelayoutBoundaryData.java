// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.dom;

/**
 Returns the id of the nearest ancestor that is a relayout boundary.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface GetRelayoutBoundaryData {
  /**
   Relayout boundary node id for the given node.
   */
  long/*See org.chromium.sdk.internal.wip.protocol.common.dom.NodeIdTypedef*/ nodeId();

}
