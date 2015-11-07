// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.network;

/**
Blocks specific URL from loading.
 */
public class AddBlockedURLParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param url URL to block.
   */
  public AddBlockedURLParams(String url) {
    this.put("url", url);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.NETWORK + ".addBlockedURL";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
