// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.dom;

/**
 Requests that a batch of nodes is sent to the caller given their backend node ids.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface PushNodesByBackendIdsToFrontendData {
  /**
   The array of ids of pushed nodes that correspond to the backend ids specified in backendNodeIds.
   */
  java.util.List<Long/*See org.chromium.sdk.internal.wip.protocol.common.dom.NodeIdTypedef*/> nodeIds();

}
