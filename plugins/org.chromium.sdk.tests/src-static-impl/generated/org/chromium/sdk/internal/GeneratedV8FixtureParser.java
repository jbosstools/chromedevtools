// This is a generated source.
// See org.chromium.sdk.internal.protocolparser.dynamicimpl.DynamicParserImpl for details

package org.chromium.sdk.internal;

public class GeneratedV8FixtureParser implements org.chromium.sdk.internal.browserfixture.FixtureChromeStub.FixtureParser {
  @Override public org.chromium.sdk.internal.browserfixture.FixtureChromeStub.Refs parseRefs(java.lang.Object obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return Value_0.parse(obj);
  }

  // Type org.chromium.sdk.internal.browserfixture.FixtureChromeStub$Refs
  public static class Value_0 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.ObjectValueBase implements org.chromium.sdk.internal.browserfixture.FixtureChromeStub.Refs {
    public static Value_0 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_0(input);
    }
    Value_0(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
    }
    private final java.util.concurrent.atomic.AtomicReference<java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle>  > lazyCachedField_0 = new java.util.concurrent.atomic.AtomicReference<java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle>>(null);
    private final java.util.concurrent.atomic.AtomicReference<java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle>  > lazyCachedField_1 = new java.util.concurrent.atomic.AtomicReference<java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle>>(null);
    @Override public java.util.List<? extends org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> asHandles2() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      java.util.List<? extends org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> result = lazyCachedField_1.get();
      if (result != null) {
        return result;
      }
      if (underlying instanceof org.json.simple.JSONArray == false) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
      }
      final org.json.simple.JSONArray arrayValue1 = (org.json.simple.JSONArray) underlying;
      int size2 = arrayValue1.size();
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> list3 = new java.util.ArrayList<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle>(size2);
      for (int index4 = 0; index4 < size2; index4++) {
        org.chromium.sdk.internal.v8native.protocol.input.GeneratedV8ProtocolParser.Value_38 arrayComponent5;
        if (arrayValue1.get(index4) == null) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
        } else {
          arrayComponent5 = org.chromium.sdk.internal.v8native.protocol.input.GeneratedV8ProtocolParser.Value_38.parse(arrayValue1.get(index4));
        }
        list3.add(arrayComponent5);
      }
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> parseResult0 = java.util.Collections.unmodifiableList(list3);
      if (parseResult0 != null) {
        lazyCachedField_1.compareAndSet(null, parseResult0);
        java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> cachedResult = lazyCachedField_1.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> asHandles() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> result = lazyCachedField_0.get();
      if (result != null) {
        return result;
      }
      if (underlying instanceof org.json.simple.JSONArray == false) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
      }
      final org.json.simple.JSONArray arrayValue1 = (org.json.simple.JSONArray) underlying;
      int size2 = arrayValue1.size();
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> list3 = new java.util.ArrayList<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle>(size2);
      for (int index4 = 0; index4 < size2; index4++) {
        org.chromium.sdk.internal.v8native.protocol.input.GeneratedV8ProtocolParser.Value_38 arrayComponent5;
        if (arrayValue1.get(index4) == null) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
        } else {
          arrayComponent5 = org.chromium.sdk.internal.v8native.protocol.input.GeneratedV8ProtocolParser.Value_38.parse(arrayValue1.get(index4));
        }
        list3.add(arrayComponent5);
      }
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> parseResult0 = java.util.Collections.unmodifiableList(list3);
      if (parseResult0 != null) {
        lazyCachedField_0.compareAndSet(null, parseResult0);
        java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> cachedResult = lazyCachedField_0.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
  }

}
