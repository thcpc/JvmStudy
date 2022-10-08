package jvm.parser.clazz.attributes.attribute.info.local.variable.type.table;

import jvm.parser.datatype.ByteCode;

public class Signature extends ByteCode<Integer> {
    public final static String NAME = "signature";

    public Signature(Integer value) {
        super(value);
    }
}