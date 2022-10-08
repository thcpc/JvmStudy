package jvm.parser.clazz.attributes.attribute.info.local.variable.type.table;

import jvm.parser.datatype.ByteCode;

public class LocalVariableTypeTableLength extends ByteCode<Integer> {

    public final static String NAME = "local_variable_type_table_length";

    public LocalVariableTypeTableLength(Integer value) {
        super(value);
    }
}