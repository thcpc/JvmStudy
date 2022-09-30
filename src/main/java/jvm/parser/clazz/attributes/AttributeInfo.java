package jvm.parser.clazz.attributes;

import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class AttributeInfo extends ByteCode<Map<String, ByteCode>> {
    public static final String NAME = "attribute_info";
    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;
    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    public AttributeInfo(Map<String, ByteCode> value) {
        super(value);
    }

}
