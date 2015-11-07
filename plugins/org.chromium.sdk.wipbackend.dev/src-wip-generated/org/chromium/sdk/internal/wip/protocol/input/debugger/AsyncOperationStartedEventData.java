// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Fired when an async operation is scheduled (while in a debugger stepping session).
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface AsyncOperationStartedEventData {
  /**
   Information about the async operation.
   */
  org.chromium.sdk.internal.wip.protocol.input.debugger.AsyncOperationValue operation();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.debugger.AsyncOperationStartedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.debugger.AsyncOperationStartedEventData>("Debugger.asyncOperationStarted", org.chromium.sdk.internal.wip.protocol.input.debugger.AsyncOperationStartedEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.debugger.AsyncOperationStartedEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDebuggerAsyncOperationStartedEventData(obj);
    }
  };
}
