package jvm.parser.clazz.attributes.attribute.info.module;

import jvm.parser.datatype.ByteCode;

public class ModuleNameIndex extends ByteCode<Integer> {
    public final static String NAME = "module_name_index";

    public ModuleNameIndex(Integer value) {
        super(value);
    }
}