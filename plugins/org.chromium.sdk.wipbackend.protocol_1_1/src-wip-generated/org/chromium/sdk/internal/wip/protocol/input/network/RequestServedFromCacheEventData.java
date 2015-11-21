// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.network;

/**
 Fired if request ended up loading from cache.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface RequestServedFromCacheEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.sdk.internal.wip.protocol.common.network.RequestIdTypedef*/ requestId();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.network.RequestServedFromCacheEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.network.RequestServedFromCacheEventData>("Network.requestServedFromCache", org.chromium.sdk.internal.wip.protocol.input.network.RequestServedFromCacheEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.network.RequestServedFromCacheEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkRequestServedFromCacheEventData(obj);
    }
  };
}
