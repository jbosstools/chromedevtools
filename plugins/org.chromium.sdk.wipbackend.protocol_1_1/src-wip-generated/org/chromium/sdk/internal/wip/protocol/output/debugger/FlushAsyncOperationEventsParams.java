// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.debugger;

/**
Fires pending <code>asyncOperationStarted</code> events (if any), as if a debugger stepping session has just been started.
 */
public class FlushAsyncOperationEventsParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  public FlushAsyncOperationEventsParams() {
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".flushAsyncOperationEvents";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
