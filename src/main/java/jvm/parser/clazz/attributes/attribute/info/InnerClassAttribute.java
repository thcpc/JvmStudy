package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.clazz.attributes.attribute.info.inner.classes.NumberOfClasses;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class InnerClassAttribute extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "InnerClass";

    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;

    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    public static final String NUMBER_OF_CLASSES = NumberOfClasses.NAME;

    public InnerClassAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}