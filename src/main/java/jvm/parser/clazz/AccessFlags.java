package jvm.parser.clazz;

import jvm.parser.datatype.ByteCode;

public class AccessFlags extends ByteCode<Integer> {
    public static final String NAME = "access_flags";
    public AccessFlags(Integer value) {
        super(value);
    }
}
