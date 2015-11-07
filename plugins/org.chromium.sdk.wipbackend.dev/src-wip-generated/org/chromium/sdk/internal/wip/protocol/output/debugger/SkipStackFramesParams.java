// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.debugger;

/**
Makes backend skip steps in the sources with names matching given pattern. VM will try leave blacklisted scripts by performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
 */
public class SkipStackFramesParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param scriptOpt Regular expression defining the scripts to ignore while stepping.
   @param skipContentScriptsOpt True, if all content scripts should be ignored.
   */
  public SkipStackFramesParams(String scriptOpt, Boolean skipContentScriptsOpt) {
    if (scriptOpt != null) {
      this.put("script", scriptOpt);
    }
    if (skipContentScriptsOpt != null) {
      this.put("skipContentScripts", skipContentScriptsOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".skipStackFrames";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
