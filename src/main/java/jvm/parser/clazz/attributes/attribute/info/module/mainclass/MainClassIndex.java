package jvm.parser.clazz.attributes.attribute.info.module.mainclass;

import jvm.parser.datatype.ByteCode;

public class MainClassIndex extends ByteCode<Integer> {
    public final static String NAME = "main_class_index";

    public MainClassIndex(Integer value) {
        super(value);
    }
}