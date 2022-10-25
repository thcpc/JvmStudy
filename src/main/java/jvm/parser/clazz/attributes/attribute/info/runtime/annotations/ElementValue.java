package jvm.parser.clazz.attributes.attribute.info.runtime.annotations;

import jvm.parser.clazz.attributes.attribute.info.runtime.annotations.element.value.Tag;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class ElementValue extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "element_value";

    public static final String TAG = Tag.NAME;


    public static final String value = "value_info";

    public ElementValue(Map<String, ByteCode> value) {
        super(value);
    }
}