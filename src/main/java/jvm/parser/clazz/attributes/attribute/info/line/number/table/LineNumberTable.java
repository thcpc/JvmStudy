package jvm.parser.clazz.attributes.attribute.info.line.number.table;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class LineNumberTable extends ByteCode<LinkedList<LineNumberInfo>> {
    public final static String NAME = "line_number_table";

    public LineNumberTable(LinkedList<LineNumberInfo> value) {
        super(value);
    }
}