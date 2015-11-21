// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.runtime;

/**
Tells inspected instance(worker or page) that it can run in case it was started paused.
 */
public class RunParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  public RunParams() {
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.RUNTIME + ".run";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
