package jvm.parser.clazz.attributes.attribute.info.runtime.annotations;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class Annotations extends ByteCode<LinkedList<Annotation>> {
    public final static String NAME = "annotations";

    public Annotations(LinkedList<Annotation> value) {
        super(value);
    }
}