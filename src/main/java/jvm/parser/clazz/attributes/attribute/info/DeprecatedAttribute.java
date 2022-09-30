package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class DeprecatedAttribute extends ByteCode<Map<String, ByteCode>> {
    public final static String Name = "Deprecated";

    // jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex
    public final static String AttributeNameIndex = "attribute_name_index";

    // jvm.parser.clazz.attributes.attribute.info.common.AttributeLength
    public final static String AttributeLength = "attribute_length";

    public DeprecatedAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}