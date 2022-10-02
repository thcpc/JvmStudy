package jvm.parser.clazz.attributes.attribute.info.module.requires;

import jvm.parser.datatype.ByteCode;

public class RequiresFlags extends ByteCode<Integer> {
    public final static String NAME = "requires_flags";

    public RequiresFlags(Integer value) {
        super(value);
    }
}