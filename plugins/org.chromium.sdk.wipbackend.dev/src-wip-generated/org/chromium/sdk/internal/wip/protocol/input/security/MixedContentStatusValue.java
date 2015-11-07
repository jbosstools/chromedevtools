// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.security;

/**
 Information about mixed content on the page.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface MixedContentStatusValue {
  /**
   True if the page ran insecure content such as scripts.
   */
  boolean ranInsecureContent();

  /**
   True if the page displayed insecure content such as images.
   */
  boolean displayedInsecureContent();

  /**
   Security state representing a page that ran insecure content.
   */
  org.chromium.sdk.internal.wip.protocol.input.security.SecurityStateEnum ranInsecureContentStyle();

  /**
   Security state representing a page that displayed insecure content.
   */
  org.chromium.sdk.internal.wip.protocol.input.security.SecurityStateEnum displayedInsecureContentStyle();

}
