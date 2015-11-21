// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.network;

/**
 Fired when page is about to send HTTP request.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface RequestWillBeSentEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.sdk.internal.wip.protocol.common.network.RequestIdTypedef*/ requestId();

  /**
   Frame identifier.
   */
  String/*See org.chromium.sdk.internal.wip.protocol.common.page.FrameIdTypedef*/ frameId();

  /**
   Loader identifier.
   */
  String/*See org.chromium.sdk.internal.wip.protocol.common.network.LoaderIdTypedef*/ loaderId();

  /**
   URL of the document this request is loaded for.
   */
  String documentURL();

  /**
   Request data.
   */
  org.chromium.sdk.internal.wip.protocol.input.network.RequestValue request();

  /**
   Timestamp.
   */
  Number/*See org.chromium.sdk.internal.wip.protocol.common.network.TimestampTypedef*/ timestamp();

  /**
   UTC Timestamp.
   */
  Number/*See org.chromium.sdk.internal.wip.protocol.common.network.TimestampTypedef*/ wallTime();

  /**
   Request initiator.
   */
  org.chromium.sdk.internal.wip.protocol.input.network.InitiatorValue initiator();

  /**
   Redirect response data.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.network.ResponseValue redirectResponse();

  /**
   Type of this resource.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.page.ResourceTypeEnum type();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.network.RequestWillBeSentEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.network.RequestWillBeSentEventData>("Network.requestWillBeSent", org.chromium.sdk.internal.wip.protocol.input.network.RequestWillBeSentEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.network.RequestWillBeSentEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkRequestWillBeSentEventData(obj);
    }
  };
}