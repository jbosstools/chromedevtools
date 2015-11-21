// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.page;

/**
Sets overlay message.
 */
public class SetOverlayMessageParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param messageOpt Overlay message to display when paused in debugger.
   */
  public SetOverlayMessageParams(String messageOpt) {
    if (messageOpt != null) {
      this.put("message", messageOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".setOverlayMessage";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
