package jvm.parser.clazz.attributes;

import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class AttributeInfo extends ByteCode<Map<String, ByteCode>> {
    public final static String AttributeNameIndex = "attribute_name_index";
    public final static String AttributeLength = "attribute_length";
    public final static String Info = "info";
    public AttributeInfo(Map<String, ByteCode> value) {
        super(value);
    }

    public int getAttributeNameIndex() { return (int) this.getValue().get(AttributeNameIndex).getValue() ; }
    public long getAttributeLength() { return (long) this.getValue().get(AttributeLength).getValue(); }

}
