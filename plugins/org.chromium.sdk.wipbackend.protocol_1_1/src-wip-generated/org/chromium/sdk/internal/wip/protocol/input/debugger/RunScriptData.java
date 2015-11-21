// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Runs script with given id in a given context.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface RunScriptData {
  /**
   Run result.
   */
  org.chromium.sdk.internal.wip.protocol.input.runtime.RemoteObjectValue result();

  /**
   Exception details.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.debugger.ExceptionDetailsValue exceptionDetails();

}
