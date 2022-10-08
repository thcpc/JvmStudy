package jvm.parser.clazz.attributes.attribute.info.method.parameters;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class Parameters extends ByteCode<LinkedList<Parameter>> {
    public final static String NAME = "parameters";

    public Parameters(LinkedList<Parameter> value) {
        super(value);
    }
}