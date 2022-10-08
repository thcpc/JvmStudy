package jvm.parser.clazz.attributes.attribute.info.runtime.annotations;

import jvm.parser.datatype.ByteCode;

public class ElementNameIndex extends ByteCode<Integer> {
    public final static String NAME = "element_name_index";

    public ElementNameIndex(Integer value) {
        super(value);
    }
}