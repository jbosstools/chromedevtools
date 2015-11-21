// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.network;

/**
 Returns all browser cookies. Depending on the backend support, will return detailed cookie information in the <code>cookies</code> field.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface GetCookiesData {
  /**
   Array of cookie objects.
   */
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.network.CookieValue> cookies();

}
