package jvm.parser.clazz.attributes.attribute.info.runtime.annotations;

import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class ElementValuePair extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "element_value_pair";

    public static final String ELEMENT_NAME_INDEX = ElementNameIndex.NAME;

    public static final String ELEMENT_VALUE = ElementValue.NAME;

    public ElementValuePair(Map<String, ByteCode> value) {
        super(value);
    }
}