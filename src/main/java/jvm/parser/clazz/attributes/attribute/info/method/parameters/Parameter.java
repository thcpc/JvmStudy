package jvm.parser.clazz.attributes.attribute.info.method.parameters;

import jvm.parser.clazz.AccessFlags;
import jvm.parser.clazz.attributes.attribute.info.common.NameIndex;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class Parameter extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "parameter";

    public static final String NAME_INDEX = NameIndex.NAME;

    public static final String ACCESS_FLAGS = AccessFlags.NAME;

    public Parameter(Map<String, ByteCode> value) {
        super(value);
    }
}