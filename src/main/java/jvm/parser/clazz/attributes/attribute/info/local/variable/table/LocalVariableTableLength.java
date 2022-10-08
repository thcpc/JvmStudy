package jvm.parser.clazz.attributes.attribute.info.local.variable.table;

import jvm.parser.datatype.ByteCode;

public class LocalVariableTableLength extends ByteCode<Integer> {

    public final static String NAME = "local_variable_table_length";

    public LocalVariableTableLength(Integer value) {
        super(value);
    }
}