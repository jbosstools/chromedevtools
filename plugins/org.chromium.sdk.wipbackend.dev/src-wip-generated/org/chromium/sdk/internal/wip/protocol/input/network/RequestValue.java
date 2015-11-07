// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.network;

/**
 HTTP request data.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface RequestValue {
  /**
   Request URL.
   */
  String url();

  /**
   HTTP request method.
   */
  String method();

  /**
   HTTP request headers.
   */
  org.chromium.sdk.internal.wip.protocol.input.network.HeadersValue headers();

  /**
   HTTP POST request data.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String postData();

  /**
   The mixed content status of the request, as defined in http://www.w3.org/TR/mixed-content/
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  MixedContentType mixedContentType();

  /**
   Priority of the resource request at the time request is sent.
   */
  org.chromium.sdk.internal.wip.protocol.input.network.ResourcePriorityEnum initialPriority();

  /**
   The mixed content status of the request, as defined in http://www.w3.org/TR/mixed-content/
   */
  public enum MixedContentType {
    BLOCKABLE,
    OPTIONALLY_BLOCKABLE,
    NONE,
  }
}
