// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.dom;

/**
 Backend node with a friendly name.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface BackendNodeValue {
  /**
   <code>Node</code>'s nodeType.
   */
  long nodeType();

  /**
   <code>Node</code>'s nodeName.
   */
  String nodeName();

  long/*See org.chromium.sdk.internal.wip.protocol.common.dom.BackendNodeIdTypedef*/ backendNodeId();

}
