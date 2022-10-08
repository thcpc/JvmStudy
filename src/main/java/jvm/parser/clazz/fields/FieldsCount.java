package jvm.parser.clazz.fields;

import jvm.parser.datatype.ByteCode;

public class FieldsCount extends ByteCode<Integer> {
    public final static String NAME = "fields_count";

    public FieldsCount(Integer value) {
        super(value);
    }
}