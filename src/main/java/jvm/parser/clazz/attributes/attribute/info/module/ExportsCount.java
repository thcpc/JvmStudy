package jvm.parser.clazz.attributes.attribute.info.module;

import jvm.parser.datatype.ByteCode;

public class ExportsCount extends ByteCode<Integer> {
    public final static String NAME = "ExportsCount";

    public ExportsCount(Integer value) {
        super(value);
    }
}