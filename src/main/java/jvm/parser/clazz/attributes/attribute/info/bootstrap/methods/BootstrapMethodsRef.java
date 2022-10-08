package jvm.parser.clazz.attributes.attribute.info.bootstrap.methods;

import jvm.parser.datatype.ByteCode;

public class BootstrapMethodsRef extends ByteCode<Integer> {
    public final static String NAME = "bootstrap_methods_ref";

    public BootstrapMethodsRef(Integer value) {
        super(value);
    }
}