package jvm.parser.clazz.attributes.attribute.info.module;

import jvm.parser.datatype.ByteCode;

public class ModuleVersionIndex extends ByteCode<Integer> {
    public final static String NAME = "module_version_index";

    public ModuleVersionIndex(Integer value) {
        super(value);
    }
}