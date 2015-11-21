// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.page;

/**
 Fired when interstitial page was shown
 */
@org.chromium.sdk.internal.protocolparser.JsonType(allowsOtherProperties=true)
public interface InterstitialShownEventData extends org.chromium.sdk.internal.protocolparser.JsonObjectBased {
  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.InterstitialShownEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.InterstitialShownEventData>("Page.interstitialShown", org.chromium.sdk.internal.wip.protocol.input.page.InterstitialShownEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.page.InterstitialShownEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageInterstitialShownEventData(obj);
    }
  };
}
