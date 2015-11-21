// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.dom;

/**
 Box model.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface BoxModelValue {
  /**
   Content box
   */
  java.util.List<Number>/*See org.chromium.sdk.internal.wip.protocol.input.dom.QuadTypedef*/ content();

  /**
   Padding box
   */
  java.util.List<Number>/*See org.chromium.sdk.internal.wip.protocol.input.dom.QuadTypedef*/ padding();

  /**
   Border box
   */
  java.util.List<Number>/*See org.chromium.sdk.internal.wip.protocol.input.dom.QuadTypedef*/ border();

  /**
   Margin box
   */
  java.util.List<Number>/*See org.chromium.sdk.internal.wip.protocol.input.dom.QuadTypedef*/ margin();

  /**
   Node width
   */
  long width();

  /**
   Node height
   */
  long height();

  /**
   Shape outside coordinates
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.dom.ShapeOutsideInfoValue shapeOutside();

}
