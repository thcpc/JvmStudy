package jvm.parser.clazz.attributes.attribute.info.local.variable.table;

import jvm.parser.datatype.ByteCode;

public class DescriptorIndex extends ByteCode<Integer> {
    public final static String NAME = "descriptor_index";

    public DescriptorIndex(Integer value) {
        super(value);
    }
}