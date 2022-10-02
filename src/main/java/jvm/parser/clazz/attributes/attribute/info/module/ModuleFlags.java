package jvm.parser.clazz.attributes.attribute.info.module;

import jvm.parser.datatype.ByteCode;

public class ModuleFlags extends ByteCode<Integer> {
    public final static String NAME = "module_flags";

    public ModuleFlags(Integer value) {
        super(value);
    }
}