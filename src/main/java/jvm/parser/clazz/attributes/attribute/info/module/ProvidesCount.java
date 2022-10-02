package jvm.parser.clazz.attributes.attribute.info.module;

import jvm.parser.datatype.ByteCode;

public class ProvidesCount extends ByteCode<Integer> {
    public final static String NAME = "ProvidesCount";

    public ProvidesCount(Integer value) {
        super(value);
    }
}