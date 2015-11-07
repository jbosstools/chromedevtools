// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.runtime;

/**
 Issued when all executionContexts were cleared in browser
 */
@org.chromium.sdk.internal.protocolparser.JsonType(allowsOtherProperties=true)
public interface ExecutionContextsClearedEventData extends org.chromium.sdk.internal.protocolparser.JsonObjectBased {
  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.runtime.ExecutionContextsClearedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.runtime.ExecutionContextsClearedEventData>("Runtime.executionContextsCleared", org.chromium.sdk.internal.wip.protocol.input.runtime.ExecutionContextsClearedEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.runtime.ExecutionContextsClearedEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseRuntimeExecutionContextsClearedEventData(obj);
    }
  };
}
