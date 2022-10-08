package jvm.parser.clazz.attributes.attribute.info.inner.classes;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class InnerClasses extends ByteCode<LinkedList<InnerClassesInfo>> {
    public final static String NAME = "inner_classes";

    public InnerClasses(LinkedList<InnerClassesInfo> value) {
        super(value);
    }
}