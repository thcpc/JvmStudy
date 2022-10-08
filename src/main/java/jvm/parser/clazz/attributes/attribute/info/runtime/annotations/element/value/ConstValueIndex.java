package jvm.parser.clazz.attributes.attribute.info.runtime.annotations.element.value;

import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class ConstValueIndex extends ByteCode<Integer> {
    public final static String NAME = "const_value_index";

    public ConstValueIndex(Integer value) {
        super(value);
    }
}