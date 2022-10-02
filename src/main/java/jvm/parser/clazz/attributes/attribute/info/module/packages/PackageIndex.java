package jvm.parser.clazz.attributes.attribute.info.module.packages;

import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class PackageIndex extends ByteCode<LinkedList<Integer>> {
    public final static String NAME = "package_index";

    public PackageIndex(LinkedList<Integer> value) {
        super(value);
    }
}