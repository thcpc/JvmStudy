package jvm.parser.clazz.attributes.attribute.info.module.exports;

import jvm.parser.datatype.ByteCode;

public class ExportsFlags extends ByteCode<Integer> {
    public final static String NAME = "exports_flags";

    public ExportsFlags(Integer value) {
        super(value);
    }
}