// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.runtime;

public class SetCustomObjectFormatterEnabledParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  public SetCustomObjectFormatterEnabledParams(boolean enabled) {
    this.put("enabled", enabled);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.RUNTIME + ".setCustomObjectFormatterEnabled";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
