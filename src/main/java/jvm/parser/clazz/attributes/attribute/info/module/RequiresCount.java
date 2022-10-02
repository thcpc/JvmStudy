package jvm.parser.clazz.attributes.attribute.info.module;

import jvm.parser.datatype.ByteCode;

public class RequiresCount extends ByteCode<Integer> {
    public final static String NAME = "RequiresCount";

    public RequiresCount(Integer value) {
        super(value);
    }
}