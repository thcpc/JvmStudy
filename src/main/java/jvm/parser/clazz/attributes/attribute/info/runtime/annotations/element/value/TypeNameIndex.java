package jvm.parser.clazz.attributes.attribute.info.runtime.annotations.element.value;

import jvm.parser.datatype.ByteCode;

public class TypeNameIndex extends ByteCode<Integer> {
    public final static String NAME = "type_name_index";

    public TypeNameIndex(Integer value) {
        super(value);
    }
}