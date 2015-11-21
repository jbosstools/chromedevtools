// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.dom;

/**
 For testing.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface GetHighlightObjectForTestData {
  /**
   Highlight data for the node.
   */
  Highlight highlight();

  /**
   Highlight data for the node.
   */
  @org.chromium.sdk.internal.protocolparser.JsonType(allowsOtherProperties=true)
  public interface Highlight extends org.chromium.sdk.internal.protocolparser.JsonObjectBased {
  }
}
