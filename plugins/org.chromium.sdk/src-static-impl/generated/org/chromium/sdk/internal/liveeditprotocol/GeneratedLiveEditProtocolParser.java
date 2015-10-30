// This is a generated source.
// See org.chromium.sdk.internal.protocolparser.dynamicimpl.DynamicParserImpl for details

package org.chromium.sdk.internal.liveeditprotocol;

public class GeneratedLiveEditProtocolParser implements org.chromium.sdk.internal.liveeditprotocol.LiveEditProtocolParser {
  @Override public org.chromium.sdk.internal.liveeditprotocol.LiveEditResult parseLiveEditResult(org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return Value_0.parse(obj);
  }

  // Type org.chromium.sdk.internal.liveeditprotocol.LiveEditResult
  public static class Value_0 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.liveeditprotocol.LiveEditResult {
    public static Value_0 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_0(input);
    }
    Value_0(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);

      Object value0 = underlying.get("change_tree");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("change_tree");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          Value_2 parsedValue2;
          if (value0 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue2 = Value_2.parse(value0);
          }
          this.field_change_tree = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field change_tree", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: change_tree");
      }

      Object value3 = underlying.get("textual_diff");
      boolean hasValue4;
      if (value3 == null) {
        hasValue4 = underlying.containsKey("textual_diff");
      } else {
        hasValue4 = true;
      }
      if (hasValue4) {
        try {
          Value_4 parsedValue5;
          if (value3 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue5 = Value_4.parse(value3);
          }
          this.field_textual_diff = parsedValue5;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field textual_diff", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: textual_diff");
      }
    }
    private final org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.OldTreeNode field_change_tree;
    private final org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.TextualDiff field_textual_diff;
    @Override public org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.TextualDiff textual_diff() {
      return field_textual_diff;
    }
    @Override public java.lang.String created_script_name()    {
      java.lang.String result;
      Object value0 = underlying.get("created_script_name");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("created_script_name");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public boolean stack_modified()    {
      java.lang.Boolean result;
      Object value0 = underlying.get("stack_modified");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("stack_modified");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Boolean r1 = (java.lang.Boolean) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public boolean updated()    {
      java.lang.Boolean result;
      try {
        Object value0 = underlying.get("updated");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("updated");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Boolean r1 = (java.lang.Boolean) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: updated");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.OldTreeNode change_tree() {
      return field_change_tree;
    }
  }

  // Type org.chromium.sdk.internal.liveeditprotocol.LiveEditResult$OldTreeNode
  public static class Value_2 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.OldTreeNode {
    public static Value_2 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_2(input);
    }
    Value_2(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);

      Object value0 = underlying.get("positions");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("positions");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          Value_3 parsedValue2;
          if (value0 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue2 = Value_3.parse(value0);
          }
          this.field_positions = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field positions", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: positions");
      }

      Object value3 = underlying.get("children");
      boolean hasValue4;
      if (value3 == null) {
        hasValue4 = underlying.containsKey("children");
      } else {
        hasValue4 = true;
      }
      if (hasValue4) {
        try {
          if (value3 instanceof org.json.simple.JSONArray == false) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
          }
          final org.json.simple.JSONArray arrayValue6 = (org.json.simple.JSONArray) value3;
          int size7 = arrayValue6.size();
          java.util.List<org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.OldTreeNode> list8 = new java.util.ArrayList<org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.OldTreeNode>(size7);
          for (int index9 = 0; index9 < size7; index9++) {
            Value_2 arrayComponent10;
            if (arrayValue6.get(index9) == null) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
            } else {
              arrayComponent10 = Value_2.parse(arrayValue6.get(index9));
            }
            list8.add(arrayComponent10);
          }
          java.util.List<org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.OldTreeNode> parsedValue5 = java.util.Collections.unmodifiableList(list8);
          this.field_children = parsedValue5;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field children", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: children");
      }

      Object value11 = underlying.get("new_positions");
      boolean hasValue12;
      if (value11 == null) {
        hasValue12 = underlying.containsKey("new_positions");
      } else {
        hasValue12 = true;
      }
      if (hasValue12) {
        try {
          Value_3 parsedValue13;
          if (value11 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue13 = Value_3.parse(value11);
          }
          this.field_new_positions = parsedValue13;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field new_positions", e);
        }
      } else {
        this.field_new_positions = null;
      }

      Object value14 = underlying.get("new_children");
      boolean hasValue15;
      if (value14 == null) {
        hasValue15 = underlying.containsKey("new_children");
      } else {
        hasValue15 = true;
      }
      if (hasValue15) {
        try {
          if (value14 instanceof org.json.simple.JSONArray == false) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
          }
          final org.json.simple.JSONArray arrayValue17 = (org.json.simple.JSONArray) value14;
          int size18 = arrayValue17.size();
          java.util.List<org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.NewTreeNode> list19 = new java.util.ArrayList<org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.NewTreeNode>(size18);
          for (int index20 = 0; index20 < size18; index20++) {
            Value_1 arrayComponent21;
            if (arrayValue17.get(index20) == null) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
            } else {
              arrayComponent21 = Value_1.parse(arrayValue17.get(index20));
            }
            list19.add(arrayComponent21);
          }
          java.util.List<org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.NewTreeNode> parsedValue16 = java.util.Collections.unmodifiableList(list19);
          this.field_new_children = parsedValue16;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field new_children", e);
        }
      } else {
        this.field_new_children = null;
      }
    }
    private final org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.Positions field_positions;
    private final java.util.List<org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.OldTreeNode> field_children;
    private final org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.Positions field_new_positions;
    private final java.util.List<org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.NewTreeNode> field_new_children;
    @Override public java.lang.String status_explanation()    {
      java.lang.String result;
      Object value0 = underlying.get("status_explanation");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("status_explanation");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.Positions positions() {
      return field_positions;
    }
    @Override public java.util.List<org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.OldTreeNode> children() {
      return field_children;
    }
    @Override public java.util.List<org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.NewTreeNode> new_children() {
      return field_new_children;
    }
    @Override public java.lang.String status()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("status");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("status");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: status");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.Positions new_positions() {
      return field_new_positions;
    }
    @Override public java.lang.String name()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("name");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("name");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: name");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
  }

  // Type org.chromium.sdk.internal.liveeditprotocol.LiveEditResult$NewTreeNode
  public static class Value_1 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.NewTreeNode {
    public static Value_1 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_1(input);
    }
    Value_1(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);

      Object value0 = underlying.get("positions");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("positions");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          Value_3 parsedValue2;
          if (value0 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue2 = Value_3.parse(value0);
          }
          this.field_positions = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field positions", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: positions");
      }

      Object value3 = underlying.get("children");
      boolean hasValue4;
      if (value3 == null) {
        hasValue4 = underlying.containsKey("children");
      } else {
        hasValue4 = true;
      }
      if (hasValue4) {
        try {
          if (value3 instanceof org.json.simple.JSONArray == false) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
          }
          final org.json.simple.JSONArray arrayValue6 = (org.json.simple.JSONArray) value3;
          int size7 = arrayValue6.size();
          java.util.List<org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.NewTreeNode> list8 = new java.util.ArrayList<org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.NewTreeNode>(size7);
          for (int index9 = 0; index9 < size7; index9++) {
            Value_1 arrayComponent10;
            if (arrayValue6.get(index9) == null) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
            } else {
              arrayComponent10 = Value_1.parse(arrayValue6.get(index9));
            }
            list8.add(arrayComponent10);
          }
          java.util.List<org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.NewTreeNode> parsedValue5 = java.util.Collections.unmodifiableList(list8);
          this.field_children = parsedValue5;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field children", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: children");
      }
    }
    private final org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.Positions field_positions;
    private final java.util.List<org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.NewTreeNode> field_children;
    @Override public java.util.List<org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.NewTreeNode> children() {
      return field_children;
    }
    @Override public java.lang.String name()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("name");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("name");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: name");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.Positions positions() {
      return field_positions;
    }
  }

  // Type org.chromium.sdk.internal.liveeditprotocol.LiveEditResult$Positions
  public static class Value_3 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.Positions {
    public static Value_3 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_3(input);
    }
    Value_3(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
    }
    @Override public long end_position()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("end_position");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("end_position");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: end_position");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public long start_position()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("start_position");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("start_position");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: start_position");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
  }

  // Type org.chromium.sdk.internal.liveeditprotocol.LiveEditResult$TextualDiff
  public static class Value_4 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.liveeditprotocol.LiveEditResult.TextualDiff {
    public static Value_4 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_4(input);
    }
    Value_4(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);

      Object value0 = underlying.get("chunks");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("chunks");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          if (value0 instanceof org.json.simple.JSONArray == false) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
          }
          final org.json.simple.JSONArray arrayValue3 = (org.json.simple.JSONArray) value0;
          int size4 = arrayValue3.size();
          java.util.List<java.lang.Long> list5 = new java.util.ArrayList<java.lang.Long>(size4);
          for (int index6 = 0; index6 < size4; index6++) {
            java.lang.Long arrayComponent7 = (java.lang.Long) arrayValue3.get(index6);
            list5.add(arrayComponent7);
          }
          java.util.List<java.lang.Long> parsedValue2 = java.util.Collections.unmodifiableList(list5);
          this.field_chunks = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field chunks", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: chunks");
      }
    }
    private final java.util.List<java.lang.Long> field_chunks;
    @Override public java.util.List<java.lang.Long> chunks() {
      return field_chunks;
    }
  }

}
