// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.dom;

/**
 Fired when the node should be inspected. This happens after call to <code>setInspectModeEnabled</code>.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface InspectNodeRequestedEventData {
  /**
   Id of the node to inspect.
   */
  long/*See org.chromium.sdk.internal.wip.protocol.common.dom.BackendNodeIdTypedef*/ backendNodeId();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.dom.InspectNodeRequestedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.dom.InspectNodeRequestedEventData>("DOM.inspectNodeRequested", org.chromium.sdk.internal.wip.protocol.input.dom.InspectNodeRequestedEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.dom.InspectNodeRequestedEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDOMInspectNodeRequestedEventData(obj);
    }
  };
}