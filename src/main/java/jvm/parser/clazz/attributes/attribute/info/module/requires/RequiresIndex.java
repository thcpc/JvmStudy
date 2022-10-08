package jvm.parser.clazz.attributes.attribute.info.module.requires;

import jvm.parser.datatype.ByteCode;

public class RequiresIndex extends ByteCode<Integer> {
    public final static String NAME = "requires_index";

    public RequiresIndex(Integer value) {
        super(value);
    }
}