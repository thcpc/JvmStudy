package jvm.parser.clazz;

import jvm.parser.clazz.constant.pools.ConstantInfo;
import jvm.parser.datatype.ByteCode;

public class ConstantPool extends ByteCode<ConstantInfo[]> {
    public ConstantPool(ConstantInfo[] value) {
        super(value);
    }
}
