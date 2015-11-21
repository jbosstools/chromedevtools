// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.runtime;

/**
 Evaluates expression on global object.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface EvaluateData {
  /**
   Evaluation result.
   */
  org.chromium.sdk.internal.wip.protocol.input.runtime.RemoteObjectValue result();

  /**
   True if the result was thrown during the evaluation.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Boolean wasThrown();

  /**
   Exception details.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.debugger.ExceptionDetailsValue exceptionDetails();

}
