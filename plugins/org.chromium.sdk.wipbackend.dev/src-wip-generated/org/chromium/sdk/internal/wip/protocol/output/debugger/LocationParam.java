// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.debugger;

/**
Location in the source code.
 */
public class LocationParam extends org.json.simple.JSONObject {
  /**
   @param scriptId Script identifier as reported in the <code>Debugger.scriptParsed</code>.
   @param lineNumber Line number in the script (0-based).
   @param columnNumberOpt Column number in the script (0-based).
   */
  public LocationParam(String/*See org.chromium.sdk.internal.wip.protocol.common.debugger.ScriptIdTypedef*/ scriptId, long lineNumber, Long columnNumberOpt) {
    this.put("scriptId", scriptId);
    this.put("lineNumber", lineNumber);
    if (columnNumberOpt != null) {
      this.put("columnNumber", columnNumberOpt);
    }
  }

}
