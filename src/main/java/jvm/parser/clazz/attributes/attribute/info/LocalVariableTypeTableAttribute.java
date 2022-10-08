package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.clazz.attributes.attribute.info.common.StartPc;
import jvm.parser.clazz.attributes.attribute.info.local.variable.table.*;
import jvm.parser.clazz.attributes.attribute.info.local.variable.type.table.LocalVariableTypeTable;
import jvm.parser.clazz.attributes.attribute.info.local.variable.type.table.LocalVariableTypeTableLength;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class LocalVariableTypeTableAttribute extends ByteCode<Map<String,ByteCode>> {
    public final static String NAME = "LocalVariableTypeTable";


    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;

    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    public static final String LOCAL_VARIABLE_TYPE_TABLE_LENGTH = LocalVariableTypeTableLength.NAME;

    public static final String LOCAL_VARIABLE_TYPE_TABLE = LocalVariableTypeTable.NAME;

    public LocalVariableTypeTableAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}
