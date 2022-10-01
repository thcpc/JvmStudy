package jvm.parser.clazz.attributes.attribute.info.exceptions;

import jvm.parser.datatype.ByteCode;

public class NumberOfExceptions extends ByteCode<Integer> {

    public static final String NAME = "number_of_exceptions";
    public NumberOfExceptions(Integer value) {
        super(value);
    }
}