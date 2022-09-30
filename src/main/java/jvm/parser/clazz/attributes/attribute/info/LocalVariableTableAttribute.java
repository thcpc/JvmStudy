package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.Attributes;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.clazz.attributes.attribute.info.local.variable.table.LocalVariableTable;
import jvm.parser.clazz.attributes.attribute.info.local.variable.table.LocalVariableTableLength;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class LocalVariableTableAttribute extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "LocalVariableTable";

    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;

    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    public static final String LOCAL_VARIABLE_TABLE_LENGTH = LocalVariableTableLength.NAME;

    public static final String LOCAL_VARIABLE_TABLE = LocalVariableTable.NAME;

    public LocalVariableTableAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}
