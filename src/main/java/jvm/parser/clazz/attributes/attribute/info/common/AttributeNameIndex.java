package jvm.parser.clazz.attributes.attribute.info.common;

import jvm.parser.datatype.ByteCode;

public class AttributeNameIndex extends ByteCode<Integer> {

    public final static String NAME = "attribute_name_index";

    public AttributeNameIndex(Integer value) {
        super(value);
    }
}
