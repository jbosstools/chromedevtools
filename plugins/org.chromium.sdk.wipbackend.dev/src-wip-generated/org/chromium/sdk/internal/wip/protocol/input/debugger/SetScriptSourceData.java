// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Edits JavaScript source live.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface SetScriptSourceData {
  /**
   New stack trace in case editing has happened while VM was stopped.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.debugger.CallFrameValue> callFrames();

  /**
   Whether current call stack  was modified after applying the changes.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Boolean stackChanged();

  /**
   Async stack trace, if any.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.debugger.StackTraceValue asyncStackTrace();
  
  /**
  VM-specific description of the changes applied.
  */
 @org.chromium.sdk.internal.protocolparser.JsonOptionalField
 org.chromium.sdk.internal.wip.protocol.input.debugger.SetScriptSourceData.Result result();

 /**
  VM-specific description of the changes applied.
  */
 @org.chromium.sdk.internal.protocolparser.JsonType(allowsOtherProperties=true)
 public interface Result extends org.chromium.sdk.internal.protocolparser.JsonObjectBased {
 }
}
