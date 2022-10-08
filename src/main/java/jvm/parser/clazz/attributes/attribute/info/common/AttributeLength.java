package jvm.parser.clazz.attributes.attribute.info.common;

import jvm.parser.datatype.ByteCode;

public class AttributeLength extends ByteCode<Long> {
    public final static String NAME = "attribute_length";
    public AttributeLength(Long value) {
        super(value);
    }
}
