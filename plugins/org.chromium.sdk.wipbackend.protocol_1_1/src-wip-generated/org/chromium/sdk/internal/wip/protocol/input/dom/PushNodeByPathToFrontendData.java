// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.dom;

/**
 Requests that the node is sent to the caller given its path. // FIXME, use XPath
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface PushNodeByPathToFrontendData {
  /**
   Id of the node for given path.
   */
  long/*See org.chromium.sdk.internal.wip.protocol.common.dom.NodeIdTypedef*/ nodeId();

}
