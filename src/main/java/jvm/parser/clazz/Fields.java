package jvm.parser.clazz;

import jvm.parser.datatype.ByteCode;
import jvm.parser.clazz.fields.FieldInfo;

import java.util.Map;

public class Fields extends ByteCode<Map<String,ByteCode>> {
    public final static String FieldCount = "FieldCount";
    public final static String FieldInfo = "FieldInfo";

    public Fields(Map<String,ByteCode> value) {
        super(value);
    }
}
