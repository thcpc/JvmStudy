package jvm.parser.clazz.attributes.attribute.info.bootstrap.methods;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class BootstrapArguments extends ByteCode<LinkedList<Integer>> {
    public final static String NAME = "bootstrap_arguments";

    public BootstrapArguments(LinkedList<Integer> value) {
        super(value);
    }
}