package jvm.parser.clazz.attributes.attribute.info.module;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class UseIndex extends ByteCode<LinkedList<Use>> {
    public final static String NAME = "use_index";

    public UseIndex(LinkedList<Use> value) {
        super(value);
    }
}