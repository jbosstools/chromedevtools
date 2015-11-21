// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.security;

/**
 The security state of the page changed.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface SecurityStateChangedEventData {
  /**
   Security state.
   */
  org.chromium.sdk.internal.wip.protocol.input.security.SecurityStateEnum securityState();

  /**
   List of explanations for the security state. If the overall security state is `insecure` or `warning`, at least one corresponding explanation should be included.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  java.util.List<org.chromium.sdk.internal.wip.protocol.input.security.SecurityStateExplanationValue> explanations();

  /**
   Information about mixed content on the page.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.security.MixedContentStatusValue mixedContentStatus();

  /**
   True if the page was loaded over cryptographic transport such as HTTPS.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Boolean schemeIsCryptographic();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.security.SecurityStateChangedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.security.SecurityStateChangedEventData>("Security.securityStateChanged", org.chromium.sdk.internal.wip.protocol.input.security.SecurityStateChangedEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.security.SecurityStateChangedEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseSecuritySecurityStateChangedEventData(obj);
    }
  };
}
