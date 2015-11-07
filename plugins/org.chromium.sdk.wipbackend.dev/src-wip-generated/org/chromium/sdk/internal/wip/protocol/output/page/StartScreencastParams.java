// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.page;

/**
Starts sending each frame using the <code>screencastFrame</code> event.
 */
public class StartScreencastParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param formatOpt Image compression format.
   @param qualityOpt Compression quality from range [0..100].
   @param maxWidthOpt Maximum screenshot width.
   @param maxHeightOpt Maximum screenshot height.
   */
  public StartScreencastParams(Format formatOpt, Long qualityOpt, Long maxWidthOpt, Long maxHeightOpt) {
    if (formatOpt != null) {
      this.put("format", formatOpt);
    }
    if (qualityOpt != null) {
      this.put("quality", qualityOpt);
    }
    if (maxWidthOpt != null) {
      this.put("maxWidth", maxWidthOpt);
    }
    if (maxHeightOpt != null) {
      this.put("maxHeight", maxHeightOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".startScreencast";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  /**
   Image compression format.
   */
  public enum Format implements org.json.simple.JSONAware{
    JPEG("jpeg"),
    PNG("png"),
    ;
    private final String protocolValue;

    Format(String protocolValue) {
      this.protocolValue = protocolValue;
    }

    @Override public String toJSONString() {
      return '"' + protocolValue + '"';
    }
  }
}
