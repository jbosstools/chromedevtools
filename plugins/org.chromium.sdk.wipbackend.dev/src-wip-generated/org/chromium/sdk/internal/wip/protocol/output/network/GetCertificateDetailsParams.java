// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.network;

/**
Returns details for the given certificate.
 */
public class GetCertificateDetailsParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.sdk.internal.wip.protocol.input.network.GetCertificateDetailsData> {
  /**
   @param certificateId ID of the certificate to get details for.
   */
  public GetCertificateDetailsParams(long/*See org.chromium.sdk.internal.wip.protocol.common.network.CertificateIdTypedef*/ certificateId) {
    this.put("certificateId", certificateId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.NETWORK + ".getCertificateDetails";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.sdk.internal.wip.protocol.input.network.GetCertificateDetailsData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseNetworkGetCertificateDetailsData(data.getUnderlyingObject());
  }

}
