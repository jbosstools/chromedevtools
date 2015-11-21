// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.page;

public class RemoveScriptToEvaluateOnLoadParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  public RemoveScriptToEvaluateOnLoadParams(String/*See org.chromium.sdk.internal.wip.protocol.common.page.ScriptIdentifierTypedef*/ identifier) {
    this.put("identifier", identifier);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".removeScriptToEvaluateOnLoad";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
