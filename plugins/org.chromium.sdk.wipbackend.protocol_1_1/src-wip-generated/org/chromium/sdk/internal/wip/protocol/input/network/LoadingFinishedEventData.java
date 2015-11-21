// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.network;

/**
 Fired when HTTP request has finished loading.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface LoadingFinishedEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.sdk.internal.wip.protocol.common.network.RequestIdTypedef*/ requestId();

  /**
   Timestamp.
   */
  Number/*See org.chromium.sdk.internal.wip.protocol.common.network.TimestampTypedef*/ timestamp();

  /**
   Total number of bytes received for this request.
   */
  Number encodedDataLength();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.network.LoadingFinishedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.network.LoadingFinishedEventData>("Network.loadingFinished", org.chromium.sdk.internal.wip.protocol.input.network.LoadingFinishedEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.network.LoadingFinishedEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkLoadingFinishedEventData(obj);
    }
  };
}
