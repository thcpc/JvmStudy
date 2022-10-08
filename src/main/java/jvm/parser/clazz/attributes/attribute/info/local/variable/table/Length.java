package jvm.parser.clazz.attributes.attribute.info.local.variable.table;

import jvm.parser.datatype.ByteCode;

public class Length extends ByteCode<Integer> {
    public final static String NAME = "length";

    public Length(Integer value) {
        super(value);
    }
}