// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.network;

/**
Displays native dialog with the certificate details.
 */
public class ShowCertificateViewerParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param certificateId Certificate id.
   */
  public ShowCertificateViewerParams(long/*See org.chromium.sdk.internal.wip.protocol.common.network.CertificateIdTypedef*/ certificateId) {
    this.put("certificateId", certificateId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.NETWORK + ".showCertificateViewer";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
