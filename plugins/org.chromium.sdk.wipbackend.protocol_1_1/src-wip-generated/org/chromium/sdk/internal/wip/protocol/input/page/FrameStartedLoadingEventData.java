// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.page;

/**
 Fired when frame has started loading.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface FrameStartedLoadingEventData {
  /**
   Id of the frame that has started loading.
   */
  String/*See org.chromium.sdk.internal.wip.protocol.common.page.FrameIdTypedef*/ frameId();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.FrameStartedLoadingEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.FrameStartedLoadingEventData>("Page.frameStartedLoading", org.chromium.sdk.internal.wip.protocol.input.page.FrameStartedLoadingEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.page.FrameStartedLoadingEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageFrameStartedLoadingEventData(obj);
    }
  };
}
