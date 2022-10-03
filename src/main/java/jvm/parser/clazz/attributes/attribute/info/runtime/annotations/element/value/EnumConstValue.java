package jvm.parser.clazz.attributes.attribute.info.runtime.annotations.element.value;

import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class EnumConstValue extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "enum_const_value";


    public static final String TYPE_NAME_INDEX = TypeNameIndex.NAME;

    public static final String CONST_NAME_INDEX = ConstNameIndex.NAME;

    public EnumConstValue(Map<String, ByteCode> value) {
        super(value);
    }
}