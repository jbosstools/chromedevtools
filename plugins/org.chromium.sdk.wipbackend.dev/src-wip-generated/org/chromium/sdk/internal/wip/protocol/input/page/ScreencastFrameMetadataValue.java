// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.page;

/**
 Screencast frame metadata
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ScreencastFrameMetadataValue {
  /**
   Top offset in DIP.
   */
  Number offsetTop();

  /**
   Page scale factor.
   */
  Number pageScaleFactor();

  /**
   Device screen width in DIP.
   */
  Number deviceWidth();

  /**
   Device screen height in DIP.
   */
  Number deviceHeight();

  /**
   Position of horizontal scroll in CSS pixels.
   */
  Number scrollOffsetX();

  /**
   Position of vertical scroll in CSS pixels.
   */
  Number scrollOffsetY();

  /**
   Frame swap timestamp.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Number timestamp();

}
