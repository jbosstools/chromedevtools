// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.network;

/**
 Timing information for the request.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ResourceTimingValue {
  /**
   Timing's requestTime is a baseline in seconds, while the other numbers are ticks in milliseconds relatively to this requestTime.
   */
  Number requestTime();

  /**
   Started resolving proxy.
   */
  Number proxyStart();

  /**
   Finished resolving proxy.
   */
  Number proxyEnd();

  /**
   Started DNS address resolve.
   */
  Number dnsStart();

  /**
   Finished DNS address resolve.
   */
  Number dnsEnd();

  /**
   Started connecting to the remote host.
   */
  Number connectStart();

  /**
   Connected to the remote host.
   */
  Number connectEnd();

  /**
   Started SSL handshake.
   */
  Number sslStart();

  /**
   Finished SSL handshake.
   */
  Number sslEnd();

  /**
   Started running ServiceWorker.
   */
  Number workerStart();

  /**
   Finished Starting ServiceWorker.
   */
  Number workerReady();

  /**
   Started sending request.
   */
  Number sendStart();

  /**
   Finished sending request.
   */
  Number sendEnd();

  /**
   Finished receiving response headers.
   */
  Number receiveHeadersEnd();

}
