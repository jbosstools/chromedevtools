// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.page;

@org.chromium.sdk.internal.protocolparser.JsonType
public interface DomContentEventFiredEventData {
  Number timestamp();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.DomContentEventFiredEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.DomContentEventFiredEventData>("Page.domContentEventFired", org.chromium.sdk.internal.wip.protocol.input.page.DomContentEventFiredEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.page.DomContentEventFiredEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageDomContentEventFiredEventData(obj);
    }
  };
}
