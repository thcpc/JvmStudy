package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.clazz.attributes.attribute.info.exceptions.ExceptionIndexTable;
import jvm.parser.clazz.attributes.attribute.info.exceptions.NumberOfExceptions;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class ExceptionsAttribute extends ByteCode<Map<String, ByteCode>> {

    public final static String Name = "Exceptions";
    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;

    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    public final static String NUMBER_OF_EXCEPTIONS = NumberOfExceptions.NAME;

    public final static String EXCEPTION_INDEX_TABLE = ExceptionIndexTable.Name;

    public ExceptionsAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}