package jvm.parser.clazz.attributes.attribute.info.module;

import jvm.parser.clazz.attributes.attribute.info.module.exports.ExportsFlags;
import jvm.parser.clazz.attributes.attribute.info.module.exports.ExportsIndex;
import jvm.parser.clazz.attributes.attribute.info.module.exports.ExportsToCount;
import jvm.parser.clazz.attributes.attribute.info.module.exports.ExportsToIndex;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class Export extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "Export";

    public static final String EXPORTS_FLAGS = ExportsFlags.NAME;
    public static final String EXPORTS_INDEX = ExportsIndex.NAME;
    public static final String EXPORTS_TO_COUNT = ExportsToCount.NAME;
    public static final String EXPORTS_TO_INDEX = ExportsToIndex.NAME;

    public Export(Map<String, ByteCode> value) {
        super(value);
    }
}