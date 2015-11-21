// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Lists all positions where step-in is possible for a current statement in a specified call frame
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface GetStepInPositionsData {
  /**
   experimental
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.debugger.LocationValue> stepInPositions();

}
