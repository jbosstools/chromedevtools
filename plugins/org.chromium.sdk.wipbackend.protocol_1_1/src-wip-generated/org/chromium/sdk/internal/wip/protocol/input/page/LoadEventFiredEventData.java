// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.page;

@org.chromium.sdk.internal.protocolparser.JsonType
public interface LoadEventFiredEventData {
  Number timestamp();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.LoadEventFiredEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.LoadEventFiredEventData>("Page.loadEventFired", org.chromium.sdk.internal.wip.protocol.input.page.LoadEventFiredEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.page.LoadEventFiredEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageLoadEventFiredEventData(obj);
    }
  };
}
