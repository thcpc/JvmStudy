package jvm.parser.clazz.attributes.attribute.info.runtime.annotations.element.value;

import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class ArrayValue extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "array_value";

    public static final String ARRAY_VALUE_INFO = ArrayValueInfo.NAME;

    public ArrayValue(Map<String, ByteCode> value) {
        super(value);
    }
}