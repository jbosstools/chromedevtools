// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.debugger;

/**
Compiles expression.
 */
public class CompileScriptParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.sdk.internal.wip.protocol.input.debugger.CompileScriptData> {
  /**
   @param expression Expression to compile.
   @param sourceURL Source url to be set for the script.
   @param persistScript Specifies whether the compiled script should be persisted.
   @param executionContextIdOpt Specifies in which isolated context to perform script run. Each content script lives in an isolated context and this parameter may be used to specify one of those contexts. If the parameter is omitted or 0 the evaluation will be performed in the context of the inspected page.
   */
  public CompileScriptParams(String expression, String sourceURL, boolean persistScript, Long/*See org.chromium.sdk.internal.wip.protocol.common.runtime.ExecutionContextIdTypedef*/ executionContextIdOpt) {
    this.put("expression", expression);
    this.put("sourceURL", sourceURL);
    this.put("persistScript", persistScript);
    if (executionContextIdOpt != null) {
      this.put("executionContextId", executionContextIdOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".compileScript";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.sdk.internal.wip.protocol.input.debugger.CompileScriptData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseDebuggerCompileScriptData(data.getUnderlyingObject());
  }

}
