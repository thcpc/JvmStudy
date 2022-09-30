package jvm.parser.clazz.attributes.attribute.info.local.variable.type.table;

import jvm.parser.clazz.attributes.attribute.info.local.variable.table.LocalVariableInfo;
import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class LocalVariableTypeTable extends ByteCode<LinkedList<LocalVariableTypeInfo>> {
    public final static String NAME = "local_variable_type_table";

    public LocalVariableTypeTable(LinkedList<LocalVariableTypeInfo> value) {
        super(value);
    }
}