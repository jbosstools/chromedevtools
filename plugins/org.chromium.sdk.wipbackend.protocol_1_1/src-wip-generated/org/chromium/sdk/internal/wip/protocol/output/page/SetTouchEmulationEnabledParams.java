// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.page;

/**
Toggles mouse event-based touch event emulation.
 */
public class SetTouchEmulationEnabledParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param enabled Whether the touch event emulation should be enabled.
   @param configurationOpt Touch/gesture events configuration. Default: current platform.
   */
  public SetTouchEmulationEnabledParams(boolean enabled, Configuration configurationOpt) {
    this.put("enabled", enabled);
    if (configurationOpt != null) {
      this.put("configuration", configurationOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".setTouchEmulationEnabled";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  /**
   Touch/gesture events configuration. Default: current platform.
   */
  public enum Configuration implements org.json.simple.JSONAware{
    MOBILE("mobile"),
    DESKTOP("desktop"),
    ;
    private final String protocolValue;

    Configuration(String protocolValue) {
      this.protocolValue = protocolValue;
    }

    @Override public String toJSONString() {
      return '"' + protocolValue + '"';
    }
  }
}
