// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.runtime;

/**
 Description of an isolated world.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ExecutionContextDescriptionValue {
  /**
   Unique id of the execution context. It can be used to specify in which execution context script evaluation should be performed.
   */
  long/*See org.chromium.sdk.internal.wip.protocol.common.runtime.ExecutionContextIdTypedef*/ id();

  /**
   Context type. It is used e.g. to distinguish content scripts from web page script.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String type();

  /**
   Execution context origin.
   */
  String origin();

  /**
   Human readable name describing given context.
   */
  String name();

  /**
   Id of the owning frame. May be an empty string if the context is not associated with a frame.
   */
  String frameId();

}
