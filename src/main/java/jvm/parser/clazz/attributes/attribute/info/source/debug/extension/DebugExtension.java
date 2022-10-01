package jvm.parser.clazz.attributes.attribute.info.source.debug.extension;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class DebugExtension extends ByteCode<LinkedList<Short>> {
    public final static String NAME = "debug_extension";

    public DebugExtension(LinkedList<Short> value) {
        super(value);
    }
}