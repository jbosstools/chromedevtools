// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.dom;

/**
Enables console to refer to the node with given id via $x (see Command Line API for more details $x functions).
 */
public class SetInspectedNodeParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param nodeId DOM node id to be accessible by means of $x command line API.
   */
  public SetInspectedNodeParams(long/*See org.chromium.sdk.internal.wip.protocol.common.dom.NodeIdTypedef*/ nodeId) {
    this.put("nodeId", nodeId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".setInspectedNode";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
