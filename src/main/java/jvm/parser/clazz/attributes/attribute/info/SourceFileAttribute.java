package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.clazz.attributes.attribute.info.source.file.SourceFileIndex;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class SourceFileAttribute extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "SourceFile";

    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;

    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    public static final String SOURCEFILE_INDEX = SourceFileIndex.NAME;

    public SourceFileAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}