package jvm.parser.clazz.attributes.attribute.info.module;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class Exports extends ByteCode<LinkedList<Export>> {
    public final static String NAME = "Exports";

    public Exports(LinkedList<Export> value) {
        super(value);
    }
}