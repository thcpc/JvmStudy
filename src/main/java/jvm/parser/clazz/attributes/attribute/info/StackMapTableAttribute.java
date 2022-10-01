package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.clazz.attributes.attribute.info.stack.map.table.Entries;
import jvm.parser.clazz.attributes.attribute.info.stack.map.table.NumberOfEntries;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class StackMapTableAttribute extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "StackMapTable";

    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;

    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    public static final String NUMBER_OF_ENTRIES = NumberOfEntries.NAME;

    public static final String ENTRIES = Entries.NAME;

    public StackMapTableAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}