// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.page;

/**
 Returns content of the given resource.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface GetResourceContentData {
  /**
   Resource content.
   */
  String content();

  /**
   True, if content was served as base64.
   */
  boolean base64Encoded();

}
