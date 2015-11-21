// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Information about the generator object.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface GeneratorObjectDetailsValue {
  /**
   Generator function.
   */
  org.chromium.sdk.internal.wip.protocol.input.runtime.RemoteObjectValue function();

  /**
   Name of the generator function.
   */
  String functionName();

  /**
   Current generator object status.
   */
  Status status();

  /**
   If suspended, location where generator function was suspended (e.g. location of the last 'yield'). Otherwise, location of the generator function.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.debugger.LocationValue location();

  /**
   Current generator object status.
   */
  public enum Status {
    RUNNING,
    SUSPENDED,
    CLOSED,
  }
}
