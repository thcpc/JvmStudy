package jvm.parser.clazz.attributes.attribute.info.local.variable.table;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class LocalVariableTable extends ByteCode<LinkedList<LocalVariableInfo>> {
    public final static String NAME = "local_variable_table";

    public LocalVariableTable(LinkedList<LocalVariableInfo> value) {
        super(value);
    }
}