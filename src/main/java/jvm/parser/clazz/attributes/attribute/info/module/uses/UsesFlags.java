package jvm.parser.clazz.attributes.attribute.info.module.uses;

import jvm.parser.datatype.ByteCode;

public class UsesFlags extends ByteCode<Integer> {
    public final static String NAME = "uses_flags";

    public UsesFlags(Integer value) {
        super(value);
    }
}