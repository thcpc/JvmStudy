package jvm.parser.clazz.attributes.attribute.info.module.exports;

import jvm.parser.datatype.ByteCode;

public class ExportsIndex extends ByteCode<Integer> {
    public final static String NAME = "exports_index";

    public ExportsIndex(Integer value) {
        super(value);
    }
}