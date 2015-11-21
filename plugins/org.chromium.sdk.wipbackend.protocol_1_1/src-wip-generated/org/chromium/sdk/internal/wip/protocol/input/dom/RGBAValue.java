// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.dom;

/**
 A structure holding an RGBA color.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface RGBAValue {
  /**
   The red component, in the [0-255] range.
   */
  long r();

  /**
   The green component, in the [0-255] range.
   */
  long g();

  /**
   The blue component, in the [0-255] range.
   */
  long b();

  /**
   The alpha component, in the [0-1] range (default: 1).
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Number a();

}
