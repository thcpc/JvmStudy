package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.Attributes;
import jvm.parser.clazz.attributes.AttributesCount;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class CodeAttribute extends ByteCode<Map<String,ByteCode>> {
    public final static String NAME = "Code";

    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;

    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    //jvm.parser.clazz.attributes.attribute.info.code.MaxStack
    public final static String MAX_STACK = "max_stack";

    //jvm.parser.clazz.attributes.attribute.info.code.MaxLocals
    public final static String MAX_LOCALS = "max_locals";

    //jvm.parser.clazz.attributes.attribute.info.code.CodeLength
    public final static String CODE_LENGTH = "code_length";

    //jvm.parser.clazz.attributes.attribute.info.code.Code
    public final static String CODE = "code";

    //jvm.parser.clazz.attributes.attribute.info.code.ExceptionTableLength
    public final static String EXCEPTION_TABLE_LENGTH = "exception_table_length";

    //jvm.parser.clazz.attributes.attribute.info.code.ExceptionTableArray
    public final static String EXCEPTION_TABLES = "exception_tables";

    public final static String ATTRIBUTE_COUNT = AttributesCount.NAME;


    public final static String ATTRIBUTES = Attributes.NAME;



    public CodeAttribute(Map<String, ByteCode> value) {
        super(value);
    }
}
