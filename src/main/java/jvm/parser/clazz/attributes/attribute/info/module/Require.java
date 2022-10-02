package jvm.parser.clazz.attributes.attribute.info.module;


import jvm.parser.clazz.attributes.attribute.info.module.requires.RequiresFlags;
import jvm.parser.clazz.attributes.attribute.info.module.requires.RequiresIndex;
import jvm.parser.clazz.attributes.attribute.info.module.requires.RequiresToCount;
import jvm.parser.clazz.attributes.attribute.info.module.requires.RequiresToIndex;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class Require extends ByteCode<Map<String, ByteCode>> {
    public final static String NAME = "Require";
    public static final String REQUIRES_FLAGS = RequiresFlags.NAME;
    public static final String REQUIRES_INDEX = RequiresIndex.NAME;
    public static final String REQUIRES_TO_COUNT = RequiresToCount.NAME;
    public static final String REQUIRES_TO_INDEX = RequiresToIndex.NAME;

    public Require(Map<String, ByteCode> value) {
        super(value);
    }
}