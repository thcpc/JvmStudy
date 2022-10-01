package jvm.parser.clazz.attributes.attribute.info.bootstrap.methods;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class BootstrapMethods extends ByteCode<LinkedList<BootstrapMethod>> {
    public final static String NAME = "bootstrap_methods";

    public BootstrapMethods(LinkedList<BootstrapMethod> value) {
        super(value);
    }
}