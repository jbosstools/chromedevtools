// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.page;

/**
 Returns navigation history for the current page.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface GetNavigationHistoryData {
  /**
   Index of the current navigation history entry.
   */
  long currentIndex();

  /**
   Array of navigation history entries.
   */
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.page.NavigationEntryValue> entries();

}
