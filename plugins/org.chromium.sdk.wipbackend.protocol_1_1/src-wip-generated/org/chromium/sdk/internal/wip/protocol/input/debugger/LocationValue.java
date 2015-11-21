// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Location in the source code.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface LocationValue {
  /**
   Script identifier as reported in the <code>Debugger.scriptParsed</code>.
   */
  String/*See org.chromium.sdk.internal.wip.protocol.common.debugger.ScriptIdTypedef*/ scriptId();

  /**
   Line number in the script (0-based).
   */
  long lineNumber();

  /**
   Column number in the script (0-based).
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Long columnNumber();

}
