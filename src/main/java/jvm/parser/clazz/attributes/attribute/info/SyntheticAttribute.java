package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class SyntheticAttribute extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "Synthetic";
    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;

    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    public SyntheticAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}