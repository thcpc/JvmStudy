package jvm.parser.clazz.attributes;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class Attributes extends ByteCode<LinkedList<AttributeInfo>> {
    public Attributes(LinkedList<AttributeInfo> value) {
        super(value);
    }
}
