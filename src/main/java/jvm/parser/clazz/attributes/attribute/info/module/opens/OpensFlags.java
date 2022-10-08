package jvm.parser.clazz.attributes.attribute.info.module.opens;

import jvm.parser.datatype.ByteCode;

public class OpensFlags extends ByteCode<Integer> {
    public final static String NAME = "requires_flags";

    public OpensFlags(Integer value) {
        super(value);
    }
}