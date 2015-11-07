// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.page;

/**
 Fired when the page with currently enabled screencast was shown or hidden </code>.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ScreencastVisibilityChangedEventData {
  /**
   True if the page is visible.
   */
  boolean visible();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.ScreencastVisibilityChangedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.ScreencastVisibilityChangedEventData>("Page.screencastVisibilityChanged", org.chromium.sdk.internal.wip.protocol.input.page.ScreencastVisibilityChangedEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.page.ScreencastVisibilityChangedEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageScreencastVisibilityChangedEventData(obj);
    }
  };
}
