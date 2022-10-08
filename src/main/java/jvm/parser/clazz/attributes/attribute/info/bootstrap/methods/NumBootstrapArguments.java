package jvm.parser.clazz.attributes.attribute.info.bootstrap.methods;

import jvm.parser.datatype.ByteCode;

public class NumBootstrapArguments extends ByteCode<Integer> {
    public final static String NAME = "num_bootstrap_arguments";

    public NumBootstrapArguments(Integer value) {
        super(value);
    }
}