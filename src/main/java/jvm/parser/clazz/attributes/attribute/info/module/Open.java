package jvm.parser.clazz.attributes.attribute.info.module;


import jvm.parser.clazz.attributes.attribute.info.module.opens.OpensFlags;
import jvm.parser.clazz.attributes.attribute.info.module.opens.OpensIndex;
import jvm.parser.clazz.attributes.attribute.info.module.opens.OpensToCount;
import jvm.parser.clazz.attributes.attribute.info.module.opens.OpensToIndex;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class Open extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "Open";

    public static final String OPENS_FLAGS = OpensFlags.NAME;
    public static final String OPENS_INDEX = OpensIndex.NAME;
    public static final String OPENS_TO_COUNT = OpensToCount.NAME;
    public static final String OPENS_TO_INDEX = OpensToIndex.NAME;

    public Open(Map<String, ByteCode> value) {
        super(value);
    }
}