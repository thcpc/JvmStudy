package jvm.parser.clazz.attributes.attribute.info.common;

import jvm.parser.datatype.ByteCode;

public class StartPc extends ByteCode<Integer> {
    public final static String NAME = "start_pc";

    public StartPc(Integer value) {
        super(value);
    }
}
