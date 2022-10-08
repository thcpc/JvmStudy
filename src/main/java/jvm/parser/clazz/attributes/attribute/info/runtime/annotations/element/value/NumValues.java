package jvm.parser.clazz.attributes.attribute.info.runtime.annotations.element.value;

import jvm.parser.datatype.ByteCode;

public class NumValues extends ByteCode<Integer> {
    public final static String NAME = "num_values";

    public NumValues(Integer value) {
        super(value);
    }
}