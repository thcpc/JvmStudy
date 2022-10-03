package jvm.parser.clazz.attributes.attribute.info.runtime.annotations;

import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class NumElementValuePairs extends ByteCode<Integer> {
    public final static String NAME = "num_element_value_pairs";

    public NumElementValuePairs(Integer value) {
        super(value);
    }
}