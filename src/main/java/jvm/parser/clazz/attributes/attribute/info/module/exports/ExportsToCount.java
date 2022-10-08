package jvm.parser.clazz.attributes.attribute.info.module.exports;

import jvm.parser.datatype.ByteCode;

public class ExportsToCount extends ByteCode<Integer> {
    public final static String NAME = "exports_to_count";

    public ExportsToCount(Integer value) {
        super(value);
    }
}