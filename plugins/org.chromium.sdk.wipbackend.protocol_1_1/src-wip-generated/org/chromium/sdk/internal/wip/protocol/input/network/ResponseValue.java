// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.network;

/**
 HTTP response data.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ResponseValue {
  /**
   Response URL. This URL can be different from CachedResource.url in case of redirect.
   */
  String url();

  /**
   HTTP response status code.
   */
  Number status();

  /**
   HTTP response status text.
   */
  String statusText();

  /**
   HTTP response headers.
   */
  org.chromium.sdk.internal.wip.protocol.input.network.HeadersValue headers();

  /**
   HTTP response headers text.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String headersText();

  /**
   Resource mimeType as determined by the browser.
   */
  String mimeType();

  /**
   Refined HTTP request headers that were actually transmitted over the network.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.network.HeadersValue requestHeaders();

  /**
   HTTP request headers text.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String requestHeadersText();

  /**
   Specifies whether physical connection was actually reused for this request.
   */
  boolean connectionReused();

  /**
   Physical connection id that was actually used for this request.
   */
  Number connectionId();

  /**
   Remote IP address.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String remoteIPAddress();

  /**
   Remote port.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Long remotePort();

  /**
   Specifies that the request was served from the disk cache.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Boolean fromDiskCache();

  /**
   Specifies that the request was served from the ServiceWorker.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Boolean fromServiceWorker();

  /**
   Total number of bytes received for this request so far.
   */
  Number encodedDataLength();

  /**
   Timing information for the given request.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.network.ResourceTimingValue timing();

  /**
   Protocol used to fetch this request.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String protocol();

  /**
   Security state of the request resource.
   */
  org.chromium.sdk.internal.wip.protocol.input.security.SecurityStateEnum securityState();

  /**
   Security details for the request.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.network.SecurityDetailsValue securityDetails();

}
