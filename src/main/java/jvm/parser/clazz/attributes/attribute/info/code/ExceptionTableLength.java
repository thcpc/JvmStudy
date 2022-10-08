package jvm.parser.clazz.attributes.attribute.info.code;

import jvm.parser.datatype.ByteCode;

public class ExceptionTableLength extends ByteCode<Integer> {
    public ExceptionTableLength(Integer value) {
        super(value);
    }
}
