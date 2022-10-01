package jvm.parser.clazz.attributes.attribute.info.method.parameters;

import jvm.parser.datatype.ByteCode;

public class ParametersCount extends ByteCode<Short> {
    public final static String NAME = "parameters_count";

    public ParametersCount(Short value) {
        super(value);
    }
}