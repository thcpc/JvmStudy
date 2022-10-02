package jvm.parser.clazz.attributes.attribute.info.module;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class Provides extends ByteCode<LinkedList<Provide>> {
    public final static String NAME = "provides";

    public Provides(LinkedList<Provide> value) {
        super(value);
    }
}