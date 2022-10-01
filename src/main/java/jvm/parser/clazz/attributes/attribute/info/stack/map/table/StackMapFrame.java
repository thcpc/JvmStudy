package jvm.parser.clazz.attributes.attribute.info.stack.map.table;

import jvm.parser.datatype.ByteCode;

public class StackMapFrame extends ByteCode<Short> {
    public final static String NAME = "stack_map_frame";

    public StackMapFrame(Short value) {
        super(value);
    }
}