// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.network;

/**
Specifies whether to always send extra HTTP headers with the requests from this page.
 */
public class SetExtraHTTPHeadersParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param headers Map with extra HTTP headers.
   */
  public SetExtraHTTPHeadersParams(org.chromium.sdk.internal.wip.protocol.output.network.HeadersParam headers) {
    this.put("headers", headers);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.NETWORK + ".setExtraHTTPHeaders";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
