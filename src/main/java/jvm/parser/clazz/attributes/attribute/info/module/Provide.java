package jvm.parser.clazz.attributes.attribute.info.module;


import jvm.parser.clazz.attributes.attribute.info.module.provides.ProvidesFlags;
import jvm.parser.clazz.attributes.attribute.info.module.provides.ProvidesIndex;
import jvm.parser.clazz.attributes.attribute.info.module.provides.ProvidesToCount;
import jvm.parser.clazz.attributes.attribute.info.module.provides.ProvidesToIndex;
import jvm.parser.datatype.ByteCode;


public class Provide extends ByteCode<Integer> {
    public final static String NAME = "Provide";


    public static final String PROVIDES_FLAGS = ProvidesFlags.NAME;
    public static final String PROVIDES_INDEX = ProvidesIndex.NAME;
    public static final String PROVIDES_TO_COUNT = ProvidesToCount.NAME;
    public static final String PROVIDES_TO_INDEX = ProvidesToIndex.NAME;

    public Provide(Integer value) {
        super(value);
    }
}