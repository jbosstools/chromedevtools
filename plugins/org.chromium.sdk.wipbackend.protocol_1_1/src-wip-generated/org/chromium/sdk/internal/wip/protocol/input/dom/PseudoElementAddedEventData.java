// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.dom;

/**
 Called when a pseudo element is added to an element.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface PseudoElementAddedEventData {
  /**
   Pseudo element's parent element id.
   */
  long/*See org.chromium.sdk.internal.wip.protocol.common.dom.NodeIdTypedef*/ parentId();

  /**
   The added pseudo element.
   */
  org.chromium.sdk.internal.wip.protocol.input.dom.NodeValue pseudoElement();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.dom.PseudoElementAddedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.dom.PseudoElementAddedEventData>("DOM.pseudoElementAdded", org.chromium.sdk.internal.wip.protocol.input.dom.PseudoElementAddedEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.dom.PseudoElementAddedEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDOMPseudoElementAddedEventData(obj);
    }
  };
}
