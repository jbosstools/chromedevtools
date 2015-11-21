// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.network;

/**
 WebSocket response data.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface WebSocketResponseValue {
  /**
   HTTP response status code.
   */
  Number status();

  /**
   HTTP response status text.
   */
  String statusText();

  /**
   HTTP response headers.
   */
  org.chromium.sdk.internal.wip.protocol.input.network.HeadersValue headers();

  /**
   HTTP response headers text.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String headersText();

  /**
   HTTP request headers.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.network.HeadersValue requestHeaders();

  /**
   HTTP request headers text.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String requestHeadersText();

}
