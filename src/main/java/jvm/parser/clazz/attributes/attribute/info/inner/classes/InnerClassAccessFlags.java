package jvm.parser.clazz.attributes.attribute.info.inner.classes;

import jvm.parser.datatype.ByteCode;

public class InnerClassAccessFlags extends ByteCode<Integer> {
    public final static String NAME = "";

    public InnerClassAccessFlags(Integer value) {
        super(value);
    }
}