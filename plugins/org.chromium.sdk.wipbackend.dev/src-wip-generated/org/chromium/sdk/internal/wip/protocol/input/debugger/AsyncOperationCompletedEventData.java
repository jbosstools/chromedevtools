// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Fired when an async operation is completed (while in a debugger stepping session).
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface AsyncOperationCompletedEventData {
  /**
   ID of the async operation that was completed.
   */
  long id();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.debugger.AsyncOperationCompletedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.debugger.AsyncOperationCompletedEventData>("Debugger.asyncOperationCompleted", org.chromium.sdk.internal.wip.protocol.input.debugger.AsyncOperationCompletedEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.debugger.AsyncOperationCompletedEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDebuggerAsyncOperationCompletedEventData(obj);
    }
  };
}
