// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Information about the function.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface FunctionDetailsValue {
  /**
   Location of the function, none for native functions.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.debugger.LocationValue location();

  /**
   Name of the function.
   */
  String functionName();

  /**
   Whether this is a generator function.
   */
  boolean isGenerator();

  /**
   Scope chain for this closure.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.debugger.ScopeValue> scopeChain();

}
