// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.debugger;

/**
Makes page not interrupt on any pauses (breakpoint, exception, dom exception etc).
 */
public class SetSkipAllPausesParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param skipped New value for skip pauses state.
   */
  public SetSkipAllPausesParams(boolean skipped) {
    this.put("skipped", skipped);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".setSkipAllPauses";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
