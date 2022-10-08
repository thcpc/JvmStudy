package jvm.parser.clazz.attributes.attribute.info.module.uses;

import jvm.parser.datatype.ByteCode;

public class UsesToCount extends ByteCode<Integer> {
    public final static String NAME = "uses_to_count";

    public UsesToCount(Integer value) {
        super(value);
    }
}