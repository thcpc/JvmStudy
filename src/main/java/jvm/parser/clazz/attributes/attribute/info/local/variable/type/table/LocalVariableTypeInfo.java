package jvm.parser.clazz.attributes.attribute.info.local.variable.type.table;

import jvm.parser.clazz.attributes.attribute.info.common.StartPc;
import jvm.parser.clazz.attributes.attribute.info.local.variable.table.Index;
import jvm.parser.clazz.attributes.attribute.info.local.variable.table.Length;
import jvm.parser.clazz.attributes.attribute.info.local.variable.table.NameIndex;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class LocalVariableTypeInfo extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "local_variable_type_info";

    public static final String START_PC = StartPc.NAME;

    public static final String LENGTH = Length.NAME;
    public static final String NAME_INDEX = NameIndex.NAME;
    public static final String SIGNATURE = Signature.NAME;
    public static final String INDEX = Index.NAME;

    public LocalVariableTypeInfo(Map<String, ByteCode> value) {
        super(value);
    }
}