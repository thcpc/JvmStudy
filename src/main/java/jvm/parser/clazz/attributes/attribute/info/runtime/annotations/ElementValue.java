package jvm.parser.clazz.attributes.attribute.info.runtime.annotations;

import jvm.parser.clazz.attributes.attribute.info.runtime.annotations.element.value.Tag;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class ElementValue extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "element_value";

    public static final String TAG = Tag.NAME;

    /******
     * value 取决于TAG，是下面的其中一个
     * const_value_index 其它
     * enum_const_value 101
     * class_info_index 99
     * annotation_value 64
     * array_value 91
     */
    public static final String value = "value_info";

    public ElementValue(Map<String, ByteCode> value) {
        super(value);
    }
}