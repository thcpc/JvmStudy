package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class DeprecatedAttribute extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "Deprecated";

    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;

    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    public DeprecatedAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}