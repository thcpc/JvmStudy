package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.attribute.info.module.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.module.AttributeNameIndex;
import jvm.parser.clazz.attributes.attribute.info.runtime.annotations.Annotations;
import jvm.parser.clazz.attributes.attribute.info.runtime.annotations.NumAnnotations;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class RuntimeInvisibleTypeAnnotations extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "RuntimeInvisibleTypeAnnotations";
    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;
    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;
    public static final String NUM_ANNOTATIONS = NumAnnotations.NAME;
    public static final String ANNOTATIONS = Annotations.NAME;

    public RuntimeInvisibleTypeAnnotations(Map<String, ByteCode> value) {
        super(value);
    }
}