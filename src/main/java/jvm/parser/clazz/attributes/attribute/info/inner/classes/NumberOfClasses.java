package jvm.parser.clazz.attributes.attribute.info.inner.classes;

import jvm.parser.datatype.ByteCode;

public class NumberOfClasses extends ByteCode<Integer> {
    public final static String NAME = "number_of_classes";

    public NumberOfClasses(Integer value) {
        super(value);
    }
}