package jvm.parser.clazz.fields;

import jvm.parser.clazz.attributes.Attributes;
import jvm.parser.clazz.attributes.AttributesCount;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class FieldInfo extends ByteCode<Map<String, ByteCode>>{

    public static final String NAME = "field_info";

    public final static String ACCESS_FLAGS = "access_flags";
    public final static String NAME_INDEX = "name_index";
    public final static String DESCRIPTION_INDEX = "description_index";
    public final static String ATTRIBUTE_COUNT = AttributesCount.NAME;
    public final static String ATTRIBUTES = Attributes.NAME;
    public FieldInfo(Map<String, ByteCode> value) {
        super(value);
    }
}
