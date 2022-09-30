package jvm.parser.clazz.attributes.attribute.info.local.variable.table;

import jvm.parser.clazz.attributes.attribute.info.common.StartPc;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class LocalVariableInfo extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "local_variable_info";

    public static final String START_PC = StartPc.NAME;

    public static final String LENGTH = Length.NAME;
    public static final String NAME_INDEX = NameIndex.NAME;
    public static final String DESCRIPTOR_INDEX = DescriptorIndex.NAME;
    public static final String INDEX = Index.NAME;

    public LocalVariableInfo(Map<String, ByteCode> value) {
        super(value);
    }
}