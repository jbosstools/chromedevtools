// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.runtime;

/**
 Returns properties of a given object. Object group of the result is inherited from the target object.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface GetPropertiesData {
  /**
   Object properties.
   */
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.runtime.PropertyDescriptorValue> result();

  /**
   Internal object properties (only of the element itself).
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.runtime.InternalPropertyDescriptorValue> internalProperties();

  /**
   Exception details.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.debugger.ExceptionDetailsValue exceptionDetails();

}
