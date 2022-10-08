package jvm.parser.clazz.attributes.attribute.info.runtime.annotations.element.value;

import jvm.parser.clazz.attributes.attribute.info.runtime.annotations.ElementValue;
import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class Values extends ByteCode<LinkedList<ElementValue>> {
    public final static String NAME = "values";

    public Values(LinkedList<ElementValue> value) {
        super(value);
    }
}