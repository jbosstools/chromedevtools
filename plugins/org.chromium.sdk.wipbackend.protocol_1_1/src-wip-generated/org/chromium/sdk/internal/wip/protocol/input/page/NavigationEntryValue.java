// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.page;

/**
 Navigation history entry.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface NavigationEntryValue {
  /**
   Unique id of the navigation history entry.
   */
  long id();

  /**
   URL of the navigation history entry.
   */
  String url();

  /**
   Title of the navigation history entry.
   */
  String title();

}
