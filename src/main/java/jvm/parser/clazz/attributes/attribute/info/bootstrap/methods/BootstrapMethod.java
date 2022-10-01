package jvm.parser.clazz.attributes.attribute.info.bootstrap.methods;

import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class BootstrapMethod extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "bootstrap_methods";


    public static final String BOOTSTRAP_METHODS_REF = BootstrapMethodsRef.NAME;
    public static final String NUM_BOOTSTRAP_ARGUMENTS = NumBootstrapArguments.NAME;
    public static final String BOOTSTRAP_ARGUMENTS = BootstrapArguments.NAME;

    public BootstrapMethod(Map<String, ByteCode> value) {
        super(value);
    }
}