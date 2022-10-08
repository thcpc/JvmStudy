package jvm.parser.clazz.attributes.attribute.info.line.number.table;

import jvm.parser.datatype.ByteCode;

public class LineNumberTableLength extends ByteCode<Integer> {

    public final static String NAME = "line_number_table_length";
    public LineNumberTableLength(Integer value) {
        super(value);
    }
}