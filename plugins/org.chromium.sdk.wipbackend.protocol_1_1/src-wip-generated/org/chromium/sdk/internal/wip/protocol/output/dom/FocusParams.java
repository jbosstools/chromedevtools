// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.dom;

/**
Focuses the given element.
 */
public class FocusParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param nodeId Id of the node to focus.
   */
  public FocusParams(long/*See org.chromium.sdk.internal.wip.protocol.common.dom.NodeIdTypedef*/ nodeId) {
    this.put("nodeId", nodeId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".focus";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
