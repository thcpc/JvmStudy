package jvm.parser.clazz.fields;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;


public class FieldInfoArray extends ByteCode<LinkedList<FieldInfo>> {


    public FieldInfoArray(LinkedList value) {
        super(value);
    }


}
