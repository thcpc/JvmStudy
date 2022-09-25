package jvm.parser.clazz.attributes;

import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class AttributeInfo extends ByteCode<Map<String, ByteCode>> {
    private final static String AttributeNameIndex = "attribute_name_index";
    private final static String AttributeLength = "attribute_length";
    private final static String Info = "info";
    public AttributeInfo(Map<String, ByteCode> value) {
        super(value);
    }
}
