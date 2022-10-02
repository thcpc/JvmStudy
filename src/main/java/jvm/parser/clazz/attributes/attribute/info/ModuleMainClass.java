package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.clazz.attributes.attribute.info.module.mainclass.MainClassIndex;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class ModuleMainClass extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "ModuleMainClass";

    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;

    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    public static final String MAIN_CLASS_INDEX= MainClassIndex.NAME;

    public ModuleMainClass(Map<String, ByteCode> value) {
        super(value);
    }
}