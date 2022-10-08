package jvm.parser.clazz.attributes.attribute.info.stack.map.table;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class Entries extends ByteCode<LinkedList<StackMapFrame>> {
    public final static String NAME = "entries";

    public Entries(LinkedList<StackMapFrame> value) {
        super(value);
    }
}