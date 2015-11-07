// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.page;

/**
Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position unavailable.
 */
public class SetGeolocationOverrideParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param latitudeOpt Mock latitude
   @param longitudeOpt Mock longitude
   @param accuracyOpt Mock accuracy
   */
  public SetGeolocationOverrideParams(Number latitudeOpt, Number longitudeOpt, Number accuracyOpt) {
    if (latitudeOpt != null) {
      this.put("latitude", latitudeOpt);
    }
    if (longitudeOpt != null) {
      this.put("longitude", longitudeOpt);
    }
    if (accuracyOpt != null) {
      this.put("accuracy", accuracyOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".setGeolocationOverride";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
