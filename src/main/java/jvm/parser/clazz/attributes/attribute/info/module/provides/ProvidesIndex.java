package jvm.parser.clazz.attributes.attribute.info.module.provides;

import jvm.parser.datatype.ByteCode;

public class ProvidesIndex extends ByteCode<Integer> {
    public final static String NAME = "provides_index";

    public ProvidesIndex(Integer value) {
        super(value);
    }
}