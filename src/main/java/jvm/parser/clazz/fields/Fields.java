package jvm.parser.clazz.fields;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;


public class Fields extends ByteCode<LinkedList<FieldInfo>> {

    public static final String NAME = "fields";
    public Fields(LinkedList value) {
        super(value);
    }


}
