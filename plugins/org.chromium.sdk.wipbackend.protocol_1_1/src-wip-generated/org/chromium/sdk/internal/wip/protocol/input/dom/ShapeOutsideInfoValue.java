// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.dom;

/**
 CSS Shape Outside details.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ShapeOutsideInfoValue {
  /**
   Shape bounds
   */
  java.util.List<Number>/*See org.chromium.sdk.internal.wip.protocol.input.dom.QuadTypedef*/ bounds();

  /**
   Shape coordinate details
   */
  java.util.List<Object> shape();

  /**
   Margin shape bounds
   */
  java.util.List<Object> marginShape();

}
