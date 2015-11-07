// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Fired when a <code>Promise</code> is created, updated or garbage collected.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface PromiseUpdatedEventData {
  /**
   Type of the event.
   */
  EventType eventType();

  /**
   Information about the updated <code>Promise</code>.
   */
  org.chromium.sdk.internal.wip.protocol.input.debugger.PromiseDetailsValue promise();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.debugger.PromiseUpdatedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.debugger.PromiseUpdatedEventData>("Debugger.promiseUpdated", org.chromium.sdk.internal.wip.protocol.input.debugger.PromiseUpdatedEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.debugger.PromiseUpdatedEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDebuggerPromiseUpdatedEventData(obj);
    }
  };
  /**
   Type of the event.
   */
  public enum EventType {
    NEW,
    UPDATE,
    GC,
  }
}
