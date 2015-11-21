// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.runtime;

/**
Releases remote object with given id.
 */
public class ReleaseObjectParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param objectId Identifier of the object to release.
   */
  public ReleaseObjectParams(String/*See org.chromium.sdk.internal.wip.protocol.common.runtime.RemoteObjectIdTypedef*/ objectId) {
    this.put("objectId", objectId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.RUNTIME + ".releaseObject";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
