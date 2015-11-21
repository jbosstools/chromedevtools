// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.network;

/**
 Information about the request initiator.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface InitiatorValue {
  /**
   Type of this initiator.
   */
  Type type();

  /**
   Initiator JavaScript stack trace, set for Script only.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.console.CallFrameValue>/*See org.chromium.sdk.internal.wip.protocol.input.console.StackTraceTypedef*/ stackTrace();

  /**
   Initiator URL, set for Parser type only.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String url();

  /**
   Initiator line number, set for Parser type only.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Number lineNumber();

  /**
   Initiator asynchronous JavaScript stack trace, if available.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.console.AsyncStackTraceValue asyncStackTrace();

  /**
   Type of this initiator.
   */
  public enum Type {
    PARSER,
    SCRIPT,
    OTHER,
  }
}
