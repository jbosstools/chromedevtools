// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.network;

/**
Activates emulation of network conditions.
 */
public class EmulateNetworkConditionsParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param offline True to emulate internet disconnection.
   @param latency Additional latency (ms).
   @param downloadThroughput Maximal aggregated download throughput.
   @param uploadThroughput Maximal aggregated upload throughput.
   */
  public EmulateNetworkConditionsParams(boolean offline, Number latency, Number downloadThroughput, Number uploadThroughput) {
    this.put("offline", offline);
    this.put("latency", latency);
    this.put("downloadThroughput", downloadThroughput);
    this.put("uploadThroughput", uploadThroughput);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.NETWORK + ".emulateNetworkConditions";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
