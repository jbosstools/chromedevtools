// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.runtime;

/**
 Mirror object referencing original JavaScript object.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface RemoteObjectValue {
  /**
   Object type.
   */
  Type type();

  /**
   Object subtype hint. Specified for <code>object</code> type values only.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Subtype subtype();

  /**
   Object class (constructor) name. Specified for <code>object</code> type values only.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String className();

  /**
   Remote object value in case of primitive values or JSON values (if it was requested), or description string if the value can not be JSON-stringified (like NaN, Infinity, -Infinity, -0).
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  @org.chromium.sdk.internal.protocolparser.JsonNullable
  Object value();

  /**
   String representation of the object.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String description();

  /**
   Unique object identifier (for non-primitive values).
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String/*See org.chromium.sdk.internal.wip.protocol.common.runtime.RemoteObjectIdTypedef*/ objectId();

  /**
   Preview containing abbreviated property values. Specified for <code>object</code> type values only.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.runtime.ObjectPreviewValue preview();

  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.runtime.CustomPreviewValue customPreview();

  /**
   Object type.
   */
  public enum Type {
    OBJECT,
    FUNCTION,
    UNDEFINED,
    STRING,
    NUMBER,
    BOOLEAN,
    SYMBOL,
  }
  /**
   Object subtype hint. Specified for <code>object</code> type values only.
   */
  public enum Subtype {
    ARRAY,
    NULL,
    NODE,
    REGEXP,
    DATE,
    MAP,
    SET,
    ITERATOR,
    GENERATOR,
    ERROR,
  }
}
