package jvm.parser.clazz.attributes.attribute.info.runtime.annotations.element.value;

import jvm.parser.datatype.ByteCode;

public class Tag extends ByteCode<Short> {
    public final static String NAME = "tag";

    public Tag(Short value) {
        super(value);
    }
}