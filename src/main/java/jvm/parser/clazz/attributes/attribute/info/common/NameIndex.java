package jvm.parser.clazz.attributes.attribute.info.common;

import jvm.parser.datatype.ByteCode;

public class NameIndex extends ByteCode<Integer> {
    public final static String NAME = "name_index";

    public NameIndex(Integer value) {
        super(value);
    }
}