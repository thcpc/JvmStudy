package jvm.parser.clazz.attributes.attribute.info.exceptions;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class ExceptionIndexTable extends ByteCode<LinkedList<Integer>> {
    public final static String Name = "exception_index_table";

    public ExceptionIndexTable(LinkedList<Integer> value) {
        super(value);
    }
}