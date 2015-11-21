// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.debugger;

/**
Enables promise tracking, information about <code>Promise</code>s created or updated will now be stored on the backend.
 */
public class EnablePromiseTrackerParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param captureStacksOpt Whether to capture stack traces for promise creation and settlement events (default: false).
   */
  public EnablePromiseTrackerParams(Boolean captureStacksOpt) {
    if (captureStacksOpt != null) {
      this.put("captureStacks", captureStacksOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".enablePromiseTracker";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
