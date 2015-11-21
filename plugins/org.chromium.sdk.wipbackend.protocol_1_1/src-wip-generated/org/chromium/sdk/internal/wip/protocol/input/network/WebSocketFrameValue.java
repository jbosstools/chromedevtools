// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.network;

/**
 WebSocket frame data.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface WebSocketFrameValue {
  /**
   WebSocket frame opcode.
   */
  Number opcode();

  /**
   WebSocke frame mask.
   */
  boolean mask();

  /**
   WebSocke frame payload data.
   */
  String payloadData();

}
