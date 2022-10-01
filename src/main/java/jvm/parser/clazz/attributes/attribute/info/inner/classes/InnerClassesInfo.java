package jvm.parser.clazz.attributes.attribute.info.inner.classes;

import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class InnerClassesInfo extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "inner_classes_info";

    public static final String INNER_CLASS_ACCESS_FLAGS = InnerClassAccessFlags.NAME;
    public static final String INNER_CLASS_INFO_INDEX = InnerClassInfoIndex.NAME;
    public static final String INNER_NAME_INDEX = InnerNameIndex.NAME;
    public static final String OUTER_CLASS_INFO_INDEX = OuterClassInfoIndex.NAME;


    public InnerClassesInfo(Map<String, ByteCode> value) {
        super(value);
    }
}