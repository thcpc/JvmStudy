package jvm.parser.clazz.attributes.attribute.info.line.number.table;

import jvm.parser.datatype.ByteCode;

public class LineNumber extends ByteCode<Integer> {

    public final static String Name = "line_number";

    public LineNumber(Integer value) {
        super(value);
    }
}