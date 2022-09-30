package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class ExceptionsAttribute extends ByteCode<Map<String, ByteCode>> {

    public final static String Name = "Exceptions";
    // jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex
    public final static String AttributeNameIndex = "attribute_name_index";

    // jvm.parser.clazz.attributes.attribute.info.common.AttributeLength
    public final static String AttributeLength = "attribute_length";

    // jvm.parser.clazz.attributes.attribute.info.exceptions.ExceptionIndexTable
    public final static String NumberOfExceptions = "number_of_exceptions";

    // jvm.parser.clazz.attributes.attribute.info.exceptions.NumberOfExceptions
    public final static String exceptionIndexTable = "exception_index_table";

    public ExceptionsAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}