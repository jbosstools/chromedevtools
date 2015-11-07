// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.network;

/**
 Cookie object
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface CookieValue {
  /**
   Cookie name.
   */
  String name();

  /**
   Cookie value.
   */
  String value();

  /**
   Cookie domain.
   */
  String domain();

  /**
   Cookie path.
   */
  String path();

  /**
   Cookie expires.
   */
  Number expires();

  /**
   Cookie size.
   */
  long size();

  /**
   True if cookie is http-only.
   */
  boolean httpOnly();

  /**
   True if cookie is secure.
   */
  boolean secure();

  /**
   True in case of session cookie.
   */
  boolean session();

}
