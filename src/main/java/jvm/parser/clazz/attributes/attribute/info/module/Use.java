package jvm.parser.clazz.attributes.attribute.info.module;


import jvm.parser.clazz.attributes.attribute.info.module.uses.UsesFlags;
import jvm.parser.clazz.attributes.attribute.info.module.uses.UsesIndex;
import jvm.parser.clazz.attributes.attribute.info.module.uses.UsesToCount;
import jvm.parser.clazz.attributes.attribute.info.module.uses.UsesToIndex;
import jvm.parser.datatype.ByteCode;

public class Use extends ByteCode<Integer> {
    public final static String NAME = "Use";

    public static final String USES_FLAGS = UsesFlags.NAME;
    public static final String USES_INDEX = UsesIndex.NAME;
    public static final String USES_TO_COUNT = UsesToCount.NAME;
    public static final String USES_TO_INDEX = UsesToIndex.NAME;
    public Use(Integer value) {
        super(value);
    }
}