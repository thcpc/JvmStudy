package jvm.parser.clazz.attributes.attribute.info.module.packages;

import jvm.parser.datatype.ByteCode;

public class PackageCount extends ByteCode<Integer> {
    public final static String NAME = "package_count";

    public PackageCount(Integer value) {
        super(value);
    }
}