package jvm.parser.clazz.attributes.attribute.info.module;

import jvm.parser.datatype.ByteCode;

public class OpensCount extends ByteCode<Integer> {
    public final static String NAME = "OpensCount";

    public OpensCount(Integer value) {
        super(value);
    }
}