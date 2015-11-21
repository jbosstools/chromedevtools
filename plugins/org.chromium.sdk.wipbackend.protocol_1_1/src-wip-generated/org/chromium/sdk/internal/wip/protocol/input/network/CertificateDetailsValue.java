// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.network;

/**
 Details about a request's certificate.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface CertificateDetailsValue {
  /**
   Certificate subject.
   */
  org.chromium.sdk.internal.wip.protocol.input.network.CertificateSubjectValue subject();

  /**
   Name of the issuing CA.
   */
  String issuer();

  /**
   Certificate valid from date.
   */
  Number/*See org.chromium.sdk.internal.wip.protocol.common.network.TimestampTypedef*/ validFrom();

  /**
   Certificate valid to (expiration) date
   */
  Number/*See org.chromium.sdk.internal.wip.protocol.common.network.TimestampTypedef*/ validTo();

}
