package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class ConstantValueAttribute extends ByteCode<Map<String,ByteCode>> {
    public final static String Name = "ConstantValue";

    public final static String AttributeNameIndex = "attribute_name_index";

    public final static String AttributeLength = "attribute_length";

    public final static String constantValueIndex = "constantvalue_index";

    public ConstantValueAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}
