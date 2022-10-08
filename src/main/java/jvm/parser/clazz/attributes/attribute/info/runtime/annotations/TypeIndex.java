package jvm.parser.clazz.attributes.attribute.info.runtime.annotations;

import jvm.parser.datatype.ByteCode;

public class TypeIndex extends ByteCode<Integer> {
    public final static String NAME = "type_index";

    public TypeIndex(Integer value) {
        super(value);
    }
}