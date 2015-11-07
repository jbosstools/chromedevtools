// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.runtime;

/**
Returns properties of a given object. Object group of the result is inherited from the target object.
 */
public class GetPropertiesParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.sdk.internal.wip.protocol.input.runtime.GetPropertiesData> {
  /**
   @param objectId Identifier of the object to return properties for.
   @param ownPropertiesOpt If true, returns properties belonging only to the element itself, not to its prototype chain.
   @param accessorPropertiesOnlyOpt If true, returns accessor properties (with getter/setter) only; internal properties are not returned either.
   @param generatePreviewOpt Whether preview should be generated for the results.
   */
  public GetPropertiesParams(String/*See org.chromium.sdk.internal.wip.protocol.common.runtime.RemoteObjectIdTypedef*/ objectId, Boolean ownPropertiesOpt, Boolean accessorPropertiesOnlyOpt, Boolean generatePreviewOpt) {
    this.put("objectId", objectId);
    if (ownPropertiesOpt != null) {
      this.put("ownProperties", ownPropertiesOpt);
    }
    if (accessorPropertiesOnlyOpt != null) {
      this.put("accessorPropertiesOnly", accessorPropertiesOnlyOpt);
    }
    if (generatePreviewOpt != null) {
      this.put("generatePreview", generatePreviewOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.RUNTIME + ".getProperties";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.sdk.internal.wip.protocol.input.runtime.GetPropertiesData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseRuntimeGetPropertiesData(data.getUnderlyingObject());
  }

}
