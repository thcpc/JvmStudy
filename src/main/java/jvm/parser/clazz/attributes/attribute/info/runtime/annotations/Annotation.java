package jvm.parser.clazz.attributes.attribute.info.runtime.annotations;

import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class Annotation extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "annotation";

    public static final String TYPE_INDEX = TypeIndex.NAME;

    public static final String NUM_ELEMENT_VALUE_PAIRS = NumElementValuePairs.NAME;

    public static final String ELEMENT_VALUE_PAIRS = ElementValuePairs.NAME;

    public Annotation(Map<String, ByteCode> value) {
        super(value);
    }
}