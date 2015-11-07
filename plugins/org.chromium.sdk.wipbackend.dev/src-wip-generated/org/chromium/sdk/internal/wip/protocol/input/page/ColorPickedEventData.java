// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.page;

/**
 Fired when a color has been picked.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ColorPickedEventData {
  /**
   RGBA of the picked color.
   */
  org.chromium.sdk.internal.wip.protocol.input.dom.RGBAValue color();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.ColorPickedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.ColorPickedEventData>("Page.colorPicked", org.chromium.sdk.internal.wip.protocol.input.page.ColorPickedEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.page.ColorPickedEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageColorPickedEventData(obj);
    }
  };
}
