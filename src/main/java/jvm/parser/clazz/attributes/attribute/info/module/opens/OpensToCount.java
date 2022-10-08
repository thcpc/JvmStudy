package jvm.parser.clazz.attributes.attribute.info.module.opens;

import jvm.parser.datatype.ByteCode;

public class OpensToCount extends ByteCode<Integer> {
    public final static String NAME = "opens_to_count";

    public OpensToCount(Integer value) {
        super(value);
    }
}