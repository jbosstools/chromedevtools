// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.console;

/**
Disables console domain, prevents further console messages from being reported to the client.
 */
public class DisableParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  public DisableParams() {
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.CONSOLE + ".disable";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
