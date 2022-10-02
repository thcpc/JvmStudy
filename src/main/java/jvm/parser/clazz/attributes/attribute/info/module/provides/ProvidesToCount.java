package jvm.parser.clazz.attributes.attribute.info.module.provides;

import jvm.parser.datatype.ByteCode;

public class ProvidesToCount extends ByteCode<Integer> {
    public final static String NAME = "provides_to_count";

    public ProvidesToCount(Integer value) {
        super(value);
    }
}