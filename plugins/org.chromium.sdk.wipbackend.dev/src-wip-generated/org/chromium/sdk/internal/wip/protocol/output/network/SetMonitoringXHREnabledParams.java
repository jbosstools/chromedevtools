// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.network;

/**
Toggles monitoring of XMLHttpRequest. If <code>true</code>, console will receive messages upon each XHR issued.
 */
public class SetMonitoringXHREnabledParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param enabled Monitoring enabled state.
   */
  public SetMonitoringXHREnabledParams(boolean enabled) {
    this.put("enabled", enabled);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.NETWORK + ".setMonitoringXHREnabled";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
