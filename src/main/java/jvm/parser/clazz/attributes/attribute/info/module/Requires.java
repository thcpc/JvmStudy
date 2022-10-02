package jvm.parser.clazz.attributes.attribute.info.module;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class Requires extends ByteCode<LinkedList<Require>> {
    public final static String NAME = "Requires";

    public Requires(LinkedList<Require> value) {
        super(value);
    }
}