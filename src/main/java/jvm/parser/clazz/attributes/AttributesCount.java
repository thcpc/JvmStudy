package jvm.parser.clazz.attributes;

import jvm.parser.datatype.ByteCode;

public class AttributesCount extends ByteCode<Integer> {
    public static final String NAME = "attribute_count";
    public AttributesCount(Integer value) {
        super(value);
    }
}
