package jvm.parser.clazz.attributes.attribute.info.module;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class Opens extends ByteCode<LinkedList<Open>> {
    public final static String NAME = "Opens";

    public Opens(LinkedList<Open> value) {
        super(value);
    }
}