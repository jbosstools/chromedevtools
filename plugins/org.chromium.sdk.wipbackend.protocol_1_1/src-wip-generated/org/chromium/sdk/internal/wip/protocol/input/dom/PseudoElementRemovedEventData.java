// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.dom;

/**
 Called when a pseudo element is removed from an element.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface PseudoElementRemovedEventData {
  /**
   Pseudo element's parent element id.
   */
  long/*See org.chromium.sdk.internal.wip.protocol.common.dom.NodeIdTypedef*/ parentId();

  /**
   The removed pseudo element id.
   */
  long/*See org.chromium.sdk.internal.wip.protocol.common.dom.NodeIdTypedef*/ pseudoElementId();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.dom.PseudoElementRemovedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.dom.PseudoElementRemovedEventData>("DOM.pseudoElementRemoved", org.chromium.sdk.internal.wip.protocol.input.dom.PseudoElementRemovedEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.dom.PseudoElementRemovedEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDOMPseudoElementRemovedEventData(obj);
    }
  };
}
