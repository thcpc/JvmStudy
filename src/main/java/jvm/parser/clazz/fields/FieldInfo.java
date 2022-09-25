package jvm.parser.clazz.fields;

import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class FieldInfo extends ByteCode<Map<String,ByteCode>> {
    public final static String ACCESS_FLAGS = "access_flags";
    public final static String NameIndex = "name_index";
    public final static String DescriptionIndex = "description_index";
    public final static String AttributeCount = "attribute_count";
    public final static String AttributeInfo = "attributes";


    public FieldInfo(Map<String, ByteCode> value) {
        super(value);
    }


}
