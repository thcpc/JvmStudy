package jvm.parser.clazz.attributes.attribute.info.runtime.annotations.element.value;

import jvm.parser.datatype.ByteCode;

public class ConstNameIndex extends ByteCode<Integer> {
    public final static String NAME = "const_name_index";

    public ConstNameIndex(Integer value) {
        super(value);
    }
}