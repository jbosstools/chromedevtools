// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.page;

/**
 Fired once navigation of the frame has completed. Frame is now associated with the new loader.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface FrameNavigatedEventData {
  /**
   Frame object.
   */
  org.chromium.sdk.internal.wip.protocol.input.page.FrameValue frame();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.FrameNavigatedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.FrameNavigatedEventData>("Page.frameNavigated", org.chromium.sdk.internal.wip.protocol.input.page.FrameNavigatedEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.page.FrameNavigatedEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageFrameNavigatedEventData(obj);
    }
  };
}
