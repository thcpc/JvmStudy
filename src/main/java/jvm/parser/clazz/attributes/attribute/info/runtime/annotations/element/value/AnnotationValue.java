package jvm.parser.clazz.attributes.attribute.info.runtime.annotations.element.value;

import jvm.parser.clazz.attributes.attribute.info.runtime.annotations.Annotation;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class AnnotationValue extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "annotation_value";

    public static final String ANNOTATION = Annotation.NAME;

    public AnnotationValue(Map<String, ByteCode> value) {
        super(value);
    }
}