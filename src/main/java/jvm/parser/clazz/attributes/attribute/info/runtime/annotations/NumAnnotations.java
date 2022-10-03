package jvm.parser.clazz.attributes.attribute.info.runtime.annotations;

import jvm.parser.datatype.ByteCode;

public class NumAnnotations extends ByteCode<Integer> {
    public final static String NAME = "num_annotations";

    public NumAnnotations(Integer value) {
        super(value);
    }
}