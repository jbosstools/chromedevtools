// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.page;

/**
Sets given markup as the document's HTML.
 */
public class SetDocumentContentParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param frameId Frame id to set HTML for.
   @param html HTML content to set.
   */
  public SetDocumentContentParams(String/*See org.chromium.sdk.internal.wip.protocol.common.page.FrameIdTypedef*/ frameId, String html) {
    this.put("frameId", frameId);
    this.put("html", html);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".setDocumentContent";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
