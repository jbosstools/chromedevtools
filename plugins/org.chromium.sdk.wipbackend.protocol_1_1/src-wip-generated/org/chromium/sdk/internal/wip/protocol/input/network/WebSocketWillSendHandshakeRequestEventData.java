// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.network;

/**
 Fired when WebSocket is about to initiate handshake.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface WebSocketWillSendHandshakeRequestEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.sdk.internal.wip.protocol.common.network.RequestIdTypedef*/ requestId();

  /**
   Timestamp.
   */
  Number/*See org.chromium.sdk.internal.wip.protocol.common.network.TimestampTypedef*/ timestamp();

  /**
   UTC Timestamp.
   */
  Number/*See org.chromium.sdk.internal.wip.protocol.common.network.TimestampTypedef*/ wallTime();

  /**
   WebSocket request data.
   */
  org.chromium.sdk.internal.wip.protocol.input.network.WebSocketRequestValue request();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.network.WebSocketWillSendHandshakeRequestEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.network.WebSocketWillSendHandshakeRequestEventData>("Network.webSocketWillSendHandshakeRequest", org.chromium.sdk.internal.wip.protocol.input.network.WebSocketWillSendHandshakeRequestEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.network.WebSocketWillSendHandshakeRequestEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkWebSocketWillSendHandshakeRequestEventData(obj);
    }
  };
}
