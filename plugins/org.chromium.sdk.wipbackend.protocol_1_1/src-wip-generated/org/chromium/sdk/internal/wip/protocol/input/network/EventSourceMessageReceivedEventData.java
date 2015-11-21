// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.network;

/**
 Fired when EventSource message is received.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface EventSourceMessageReceivedEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.sdk.internal.wip.protocol.common.network.RequestIdTypedef*/ requestId();

  /**
   Timestamp.
   */
  Number/*See org.chromium.sdk.internal.wip.protocol.common.network.TimestampTypedef*/ timestamp();

  /**
   Message type.
   */
  String eventName();

  /**
   Message identifier.
   */
  String eventId();

  /**
   Message content.
   */
  String data();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.network.EventSourceMessageReceivedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.network.EventSourceMessageReceivedEventData>("Network.eventSourceMessageReceived", org.chromium.sdk.internal.wip.protocol.input.network.EventSourceMessageReceivedEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.network.EventSourceMessageReceivedEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkEventSourceMessageReceivedEventData(obj);
    }
  };
}
