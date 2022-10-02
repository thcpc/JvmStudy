package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.clazz.attributes.attribute.info.method.parameters.Parameters;
import jvm.parser.clazz.attributes.attribute.info.method.parameters.ParametersCount;
import jvm.parser.clazz.attributes.attribute.info.module.packages.PackageCount;
import jvm.parser.clazz.attributes.attribute.info.module.packages.PackageIndex;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class ModulePackages extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "ModulePackages";

    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;

    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;

    public static final String PACKAGE_COUNT = PackageCount.NAME;

    public static final String PACKAGE_INDEX = PackageIndex.NAME;

    public ModulePackages(Map<String, ByteCode> value) {
        super(value);
    }
}