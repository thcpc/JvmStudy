package jvm.parser.clazz.attributes.attribute.info.module;

import jvm.parser.datatype.ByteCode;

public class UsesCount extends ByteCode<Integer> {
    public final static String NAME = "UsesCount";

    public UsesCount(Integer value) {
        super(value);
    }
}