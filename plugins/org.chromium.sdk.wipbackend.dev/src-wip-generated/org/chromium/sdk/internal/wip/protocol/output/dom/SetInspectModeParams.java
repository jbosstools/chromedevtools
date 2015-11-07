// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.dom;

/**
Enters the 'inspect' mode. In this mode, elements that user is hovering over are highlighted. Backend then generates 'inspectNodeRequested' event upon element selection.
 */
public class SetInspectModeParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param mode Set an inspection mode.
   @param highlightConfigOpt A descriptor for the highlight appearance of hovered-over nodes. May be omitted if <code>enabled == false</code>.
   */
  public SetInspectModeParams(org.chromium.sdk.internal.wip.protocol.input.dom.InspectModeEnum mode, org.chromium.sdk.internal.wip.protocol.output.dom.HighlightConfigParam highlightConfigOpt) {
    this.put("mode", mode);
    if (highlightConfigOpt != null) {
      this.put("highlightConfig", highlightConfigOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".setInspectMode";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
