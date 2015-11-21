// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.dom;

/**
Enters the 'inspect' mode. In this mode, elements that user is hovering over are highlighted. Backend then generates 'inspectNodeRequested' event upon element selection.
 */
public class SetInspectModeEnabledParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param enabled True to enable inspection mode, false to disable it.
   @param inspectUAShadowDOMOpt True to enable inspection mode for user agent shadow DOM.
   @param highlightConfigOpt A descriptor for the highlight appearance of hovered-over nodes. May be omitted if <code>enabled == false</code>.
   */
  public SetInspectModeEnabledParams(boolean enabled, Boolean inspectUAShadowDOMOpt, org.chromium.sdk.internal.wip.protocol.output.dom.HighlightConfigParam highlightConfigOpt) {
    this.put("enabled", enabled);
    if (inspectUAShadowDOMOpt != null) {
      this.put("inspectUAShadowDOM", inspectUAShadowDOMOpt);
    }
    if (highlightConfigOpt != null) {
      this.put("highlightConfig", highlightConfigOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".setInspectModeEnabled";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
