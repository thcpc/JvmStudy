package jvm.parser.clazz.attributes.attribute.info.runtime.annotations;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class ElementValuePairs extends ByteCode<LinkedList<ElementValuePair>> {
    public final static String NAME = "element_value_pairs";

    public ElementValuePairs(LinkedList<ElementValuePair> value) {
        super(value);
    }
}