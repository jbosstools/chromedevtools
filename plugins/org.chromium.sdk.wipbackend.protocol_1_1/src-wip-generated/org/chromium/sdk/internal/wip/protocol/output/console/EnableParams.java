// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.console;

/**
Enables console domain, sends the messages collected so far to the client by means of the <code>messageAdded</code> notification.
 */
public class EnableParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  public EnableParams() {
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.CONSOLE + ".enable";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
