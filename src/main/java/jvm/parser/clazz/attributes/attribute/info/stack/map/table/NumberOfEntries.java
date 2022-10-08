package jvm.parser.clazz.attributes.attribute.info.stack.map.table;

import jvm.parser.datatype.ByteCode;

public class NumberOfEntries extends ByteCode<Integer> {
    public final static String NAME = "number_of_entries";

    public NumberOfEntries(Integer value) {
        super(value);
    }
}