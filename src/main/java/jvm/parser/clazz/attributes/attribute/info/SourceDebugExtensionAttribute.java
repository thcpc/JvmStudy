package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.clazz.attributes.attribute.info.source.debug.extension.DebugExtension;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class SourceDebugExtensionAttribute extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "SourceDebugExtension";

    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;

    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    public static final String DEBUG_EXTENSION = DebugExtension.NAME;

    public SourceDebugExtensionAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}