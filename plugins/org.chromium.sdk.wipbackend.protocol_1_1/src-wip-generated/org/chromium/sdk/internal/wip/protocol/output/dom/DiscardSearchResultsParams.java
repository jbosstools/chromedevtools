// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.dom;

/**
Discards search results from the session with the given id. <code>getSearchResults</code> should no longer be called for that search.
 */
public class DiscardSearchResultsParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param searchId Unique search session identifier.
   */
  public DiscardSearchResultsParams(String searchId) {
    this.put("searchId", searchId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".discardSearchResults";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
