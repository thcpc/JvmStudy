package jvm.parser.clazz.attributes.attribute.info.bootstrap.methods;

import jvm.parser.datatype.ByteCode;

public class NumBootstrapMethods extends ByteCode<Integer> {
    public final static String NAME = "num_bootstrap_methods";

    public NumBootstrapMethods(Integer value) {
        super(value);
    }
}