// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Fired when virtual machine fails to parse the script.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ScriptFailedToParseEventData {
  /**
   Identifier of the script parsed.
   */
  String/*See org.chromium.sdk.internal.wip.protocol.common.debugger.ScriptIdTypedef*/ scriptId();

  /**
   URL or name of the script parsed (if any).
   */
  String url();

  /**
   Line offset of the script within the resource with given URL (for script tags).
   */
  long startLine();

  /**
   Column offset of the script within the resource with given URL.
   */
  long startColumn();

  /**
   Last line of the script.
   */
  long endLine();

  /**
   Length of the last line of the script.
   */
  long endColumn();

  /**
   Determines whether this script is a user extension script.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Boolean isContentScript();

  /**
   Determines whether this script is an internal script.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Boolean isInternalScript();

  /**
   URL of source map associated with script (if any).
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String sourceMapURL();

  /**
   True, if this script has sourceURL.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Boolean hasSourceURL();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.debugger.ScriptFailedToParseEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.debugger.ScriptFailedToParseEventData>("Debugger.scriptFailedToParse", org.chromium.sdk.internal.wip.protocol.input.debugger.ScriptFailedToParseEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.debugger.ScriptFailedToParseEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDebuggerScriptFailedToParseEventData(obj);
    }
  };
}
