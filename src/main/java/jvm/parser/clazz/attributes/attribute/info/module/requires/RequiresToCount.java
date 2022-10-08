package jvm.parser.clazz.attributes.attribute.info.module.requires;

import jvm.parser.datatype.ByteCode;

public class RequiresToCount extends ByteCode<Integer> {
    public final static String NAME = "requires_to_count";

    public RequiresToCount(Integer value) {
        super(value);
    }
}