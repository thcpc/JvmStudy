package jvm.parser.clazz.attributes.attribute.info.local.variable.table;

import jvm.parser.datatype.ByteCode;

public class Index extends ByteCode<Integer> {
    public final static String NAME = "Index";

    public Index(Integer value) {
        super(value);
    }
}