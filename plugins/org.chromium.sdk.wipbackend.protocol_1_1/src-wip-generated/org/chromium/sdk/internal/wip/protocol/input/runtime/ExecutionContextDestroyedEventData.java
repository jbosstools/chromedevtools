// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.runtime;

/**
 Issued when execution context is destroyed.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ExecutionContextDestroyedEventData {
  /**
   Id of the destroyed context
   */
  long/*See org.chromium.sdk.internal.wip.protocol.common.runtime.ExecutionContextIdTypedef*/ executionContextId();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.runtime.ExecutionContextDestroyedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.runtime.ExecutionContextDestroyedEventData>("Runtime.executionContextDestroyed", org.chromium.sdk.internal.wip.protocol.input.runtime.ExecutionContextDestroyedEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.runtime.ExecutionContextDestroyedEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseRuntimeExecutionContextDestroyedEventData(obj);
    }
  };
}
