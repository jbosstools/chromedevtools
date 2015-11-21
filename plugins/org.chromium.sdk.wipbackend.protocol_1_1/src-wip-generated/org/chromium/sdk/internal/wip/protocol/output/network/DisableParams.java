// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.network;

/**
Disables network tracking, prevents network events from being sent to the client.
 */
public class DisableParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  public DisableParams() {
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.NETWORK + ".disable";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
