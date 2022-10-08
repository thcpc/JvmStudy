package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.attribute.info.bootstrap.methods.BootstrapMethods;
import jvm.parser.clazz.attributes.attribute.info.bootstrap.methods.NumBootstrapMethods;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class BootstrapMethodsAttribute extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "BootstrapMethods";

    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;

    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    public static final String NUM_BOOTSTRAP_METHODS = NumBootstrapMethods.NAME;

    public static final String BOOTSTRAP_METHODS = BootstrapMethods.NAME;

    public BootstrapMethodsAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}