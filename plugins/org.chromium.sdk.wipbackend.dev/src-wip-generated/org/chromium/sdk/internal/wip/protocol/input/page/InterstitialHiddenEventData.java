// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.page;

/**
 Fired when interstitial page was hidden
 */
@org.chromium.sdk.internal.protocolparser.JsonType(allowsOtherProperties=true)
public interface InterstitialHiddenEventData extends org.chromium.sdk.internal.protocolparser.JsonObjectBased {
  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.InterstitialHiddenEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.InterstitialHiddenEventData>("Page.interstitialHidden", org.chromium.sdk.internal.wip.protocol.input.page.InterstitialHiddenEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.page.InterstitialHiddenEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageInterstitialHiddenEventData(obj);
    }
  };
}
