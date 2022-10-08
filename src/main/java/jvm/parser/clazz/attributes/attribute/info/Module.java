package jvm.parser.clazz.attributes.attribute.info;

import jvm.parser.clazz.attributes.attribute.info.module.*;
import jvm.parser.clazz.attributes.attribute.info.module.uses.UsesIndex;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class Module extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "Module";

    public final static String ATTRIBUTE_NAME_INDEX = AttributeNameIndex.NAME;
    public final static String ATTRIBUTE_LENGTH = AttributeLength.NAME;
    public final static String MODULE_NAME_INDEX = ModuleNameIndex.NAME;
    public final static String MODULE_FLAGS = ModuleFlags.NAME;
    public final static String MODULE_VERSION_INDEX = ModuleVersionIndex.NAME;
    public final static String REQUIRES_COUNT = RequiresCount.NAME;
    public final static String REQUIRES = Requires.NAME;
    public final static String EXPORTS_COUNT = ExportsCount.NAME;
    public final static String EXPORTS = Exports.NAME;
    public final static String OPENS_COUNT = OpensCount.NAME;
    public final static String OPENS = Opens.NAME;
    public final static String USES_COUNT = UsesCount.NAME;
    public final static String USES_INDEX = UsesIndex.NAME;
    public final static String PROVIDES_COUNT = ProvidesCount.NAME;
    public final static String PROVIDES = Provides.NAME;

    public Module(Map<String, ByteCode> value) {
        super(value);
    }
}