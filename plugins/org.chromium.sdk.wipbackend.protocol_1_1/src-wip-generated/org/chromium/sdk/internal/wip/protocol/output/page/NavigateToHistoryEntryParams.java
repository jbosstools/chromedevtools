// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.page;

/**
Navigates current page to the given history entry.
 */
public class NavigateToHistoryEntryParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param entryId Unique id of the entry to navigate to.
   */
  public NavigateToHistoryEntryParams(long entryId) {
    this.put("entryId", entryId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".navigateToHistoryEntry";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
