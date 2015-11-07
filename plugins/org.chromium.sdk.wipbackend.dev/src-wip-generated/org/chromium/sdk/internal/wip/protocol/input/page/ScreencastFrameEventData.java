// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.page;

/**
 Compressed image data requested by the <code>startScreencast</code>.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ScreencastFrameEventData {
  /**
   Base64-encoded compressed image.
   */
  String data();

  /**
   Screencast frame metadata.
   */
  org.chromium.sdk.internal.wip.protocol.input.page.ScreencastFrameMetadataValue metadata();

  /**
   Frame number.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Long frameNumber();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.ScreencastFrameEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.ScreencastFrameEventData>("Page.screencastFrame", org.chromium.sdk.internal.wip.protocol.input.page.ScreencastFrameEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.page.ScreencastFrameEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageScreencastFrameEventData(obj);
    }
  };
}
