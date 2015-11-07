// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.dom;

/**
Configuration data for the highlighting of page elements.
 */
public class HighlightConfigParam extends org.json.simple.JSONObject {
  /**
   @param showInfoOpt Whether the node info tooltip should be shown (default: false).
   @param showRulersOpt Whether the rulers should be shown (default: false).
   @param showExtensionLinesOpt Whether the extension lines from node to the rulers should be shown (default: false).
   @param contentColorOpt The content box highlight fill color (default: transparent).
   @param paddingColorOpt The padding highlight fill color (default: transparent).
   @param borderColorOpt The border highlight fill color (default: transparent).
   @param marginColorOpt The margin highlight fill color (default: transparent).
   @param eventTargetColorOpt The event target element highlight fill color (default: transparent).
   @param shapeColorOpt The shape outside fill color (default: transparent).
   @param shapeMarginColorOpt The shape margin fill color (default: transparent).
   */
  public HighlightConfigParam(Boolean showInfoOpt, Boolean showRulersOpt, Boolean showExtensionLinesOpt, Boolean displayAsMaterialOpt, org.chromium.sdk.internal.wip.protocol.output.dom.RGBAParam contentColorOpt, org.chromium.sdk.internal.wip.protocol.output.dom.RGBAParam paddingColorOpt, org.chromium.sdk.internal.wip.protocol.output.dom.RGBAParam borderColorOpt, org.chromium.sdk.internal.wip.protocol.output.dom.RGBAParam marginColorOpt, org.chromium.sdk.internal.wip.protocol.output.dom.RGBAParam eventTargetColorOpt, org.chromium.sdk.internal.wip.protocol.output.dom.RGBAParam shapeColorOpt, org.chromium.sdk.internal.wip.protocol.output.dom.RGBAParam shapeMarginColorOpt) {
    if (showInfoOpt != null) {
      this.put("showInfo", showInfoOpt);
    }
    if (showRulersOpt != null) {
      this.put("showRulers", showRulersOpt);
    }
    if (showExtensionLinesOpt != null) {
      this.put("showExtensionLines", showExtensionLinesOpt);
    }
    if (displayAsMaterialOpt != null) {
      this.put("displayAsMaterial", displayAsMaterialOpt);
    }
    if (contentColorOpt != null) {
      this.put("contentColor", contentColorOpt);
    }
    if (paddingColorOpt != null) {
      this.put("paddingColor", paddingColorOpt);
    }
    if (borderColorOpt != null) {
      this.put("borderColor", borderColorOpt);
    }
    if (marginColorOpt != null) {
      this.put("marginColor", marginColorOpt);
    }
    if (eventTargetColorOpt != null) {
      this.put("eventTargetColor", eventTargetColorOpt);
    }
    if (shapeColorOpt != null) {
      this.put("shapeColor", shapeColorOpt);
    }
    if (shapeMarginColorOpt != null) {
      this.put("shapeMarginColor", shapeMarginColorOpt);
    }
  }

}
