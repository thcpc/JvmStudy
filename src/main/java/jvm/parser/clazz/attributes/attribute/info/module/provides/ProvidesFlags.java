package jvm.parser.clazz.attributes.attribute.info.module.provides;

import jvm.parser.datatype.ByteCode;

public class ProvidesFlags extends ByteCode<Integer> {
    public final static String NAME = "provides_flags";

    public ProvidesFlags(Integer value) {
        super(value);
    }
}