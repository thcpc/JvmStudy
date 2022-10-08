package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.clazz.attributes.attribute.info.method.parameters.Parameters;
import jvm.parser.clazz.attributes.attribute.info.method.parameters.ParametersCount;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class MethodParametersAttribute extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "MethodParameters";

    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;

    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    public static final String PARAMETERS_COUNT = ParametersCount.NAME;

    public static final String PARAMETERS = Parameters.NAME;

    public MethodParametersAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}