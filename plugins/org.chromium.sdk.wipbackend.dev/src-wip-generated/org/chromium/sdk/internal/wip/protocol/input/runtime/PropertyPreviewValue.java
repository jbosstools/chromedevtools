// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.runtime;

@org.chromium.sdk.internal.protocolparser.JsonType
public interface PropertyPreviewValue {
  /**
   Property name.
   */
  String name();

  /**
   Object type. Accessor means that the property itself is an accessor property.
   */
  Type type();

  /**
   User-friendly property value string.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String value();

  /**
   Nested value preview.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.runtime.ObjectPreviewValue valuePreview();

  /**
   Object subtype hint. Specified for <code>object</code> type values only.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Subtype subtype();

  /**
   Object type. Accessor means that the property itself is an accessor property.
   */
  public enum Type {
    OBJECT,
    FUNCTION,
    UNDEFINED,
    STRING,
    NUMBER,
    BOOLEAN,
    SYMBOL,
    ACCESSOR,
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
