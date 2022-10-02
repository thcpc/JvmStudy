package jvm.parser.clazz.attributes.attribute.info.module.opens;

import jvm.parser.datatype.ByteCode;

public class OpensIndex extends ByteCode<Integer> {
    public final static String NAME = "opens_index";

    public OpensIndex(Integer value) {
        super(value);
    }
}