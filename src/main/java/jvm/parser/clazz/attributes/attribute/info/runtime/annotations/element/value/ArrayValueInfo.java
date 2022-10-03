package jvm.parser.clazz.attributes.attribute.info.runtime.annotations.element.value;

import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class ArrayValueInfo extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "array_value_info";

    public static final String NUM_VALUES = NumValues.NAME;

    public ArrayValueInfo(Map<String, ByteCode> value) {
        super(value);
    }
}