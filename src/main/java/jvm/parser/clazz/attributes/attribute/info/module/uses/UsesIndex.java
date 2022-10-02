package jvm.parser.clazz.attributes.attribute.info.module.uses;

import jvm.parser.datatype.ByteCode;

public class UsesIndex extends ByteCode<Integer> {
    public final static String NAME = "uses_index";

    public UsesIndex(Integer value) {
        super(value);
    }
}