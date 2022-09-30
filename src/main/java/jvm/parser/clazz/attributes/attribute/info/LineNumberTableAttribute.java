package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.clazz.attributes.attribute.info.line.number.table.LineNumberTable;
import jvm.parser.clazz.attributes.attribute.info.line.number.table.LineNumberTableLength;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class LineNumberTableAttribute extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "LineNumberTable";

    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;

    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    public final static String LINE_NUMBER_TABLE_LENGTH = LineNumberTableLength.NAME;

    public final static String LINE_NUMBER_TABLE = LineNumberTable.NAME;

    public LineNumberTableAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}
