// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.network;

/**
 Returns content served for the given request.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface GetResponseBodyData {
  /**
   Response body.
   */
  String body();

  /**
   True, if content was sent as base64.
   */
  boolean base64Encoded();

}
