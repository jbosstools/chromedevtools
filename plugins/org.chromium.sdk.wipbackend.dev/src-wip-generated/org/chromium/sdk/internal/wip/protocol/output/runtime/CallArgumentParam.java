// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.output.runtime;

/**
Represents function call argument. Either remote object id <code>objectId</code> or primitive <code>value</code> or neither of (for undefined) them should be specified.
 */
public class CallArgumentParam extends org.json.simple.JSONObject {
  /**
   @param hasValue whether 'value' actually contains value (possibly null)
   @param value Primitive value, or description string if the value can not be JSON-stringified (like NaN, Infinity, -Infinity, -0).
   @param objectIdOpt Remote object handle.
   @param typeOpt Object type.
   */
  public CallArgumentParam(boolean hasValue, Object value, String/*See org.chromium.sdk.internal.wip.protocol.common.runtime.RemoteObjectIdTypedef*/ objectIdOpt, Type typeOpt) {
    if (hasValue) {
      this.put("value", value);
    }
    if (objectIdOpt != null) {
      this.put("objectId", objectIdOpt);
    }
    if (typeOpt != null) {
      this.put("type", typeOpt);
    }
  }

  /**
   Object type.
   */
  public enum Type implements org.json.simple.JSONAware{
    OBJECT("object"),
    FUNCTION("function"),
    UNDEFINED("undefined"),
    STRING("string"),
    NUMBER("number"),
    BOOLEAN("boolean"),
    SYMBOL("symbol"),
    ;
    private final String protocolValue;

    Type(String protocolValue) {
      this.protocolValue = protocolValue;
    }

    @Override public String toJSONString() {
      return '"' + protocolValue + '"';
    }
  }
}
