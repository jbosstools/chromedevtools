// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Information about the promise. All fields but id are optional and if present they reflect the new state of the property on the promise with given id.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface PromiseDetailsValue {
  /**
   Unique id of the promise.
   */
  long id();

  /**
   Status of the promise.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Status status();

  /**
   Id of the parent promise.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Long parentId();

  /**
   Top call frame on promise creation.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.console.CallFrameValue callFrame();

  /**
   Creation time of the promise.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Number creationTime();

  /**
   Settlement time of the promise.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Number settlementTime();

  /**
   JavaScript stack trace on promise creation.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.console.CallFrameValue>/*See org.chromium.sdk.internal.wip.protocol.input.console.StackTraceTypedef*/ creationStack();

  /**
   JavaScript asynchronous stack trace on promise creation, if available.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.console.AsyncStackTraceValue asyncCreationStack();

  /**
   JavaScript stack trace on promise settlement.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.console.CallFrameValue>/*See org.chromium.sdk.internal.wip.protocol.input.console.StackTraceTypedef*/ settlementStack();

  /**
   JavaScript asynchronous stack trace on promise settlement, if available.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.console.AsyncStackTraceValue asyncSettlementStack();

  /**
   Status of the promise.
   */
  public enum Status {
    PENDING,
    RESOLVED,
    REJECTED,
  }
}
