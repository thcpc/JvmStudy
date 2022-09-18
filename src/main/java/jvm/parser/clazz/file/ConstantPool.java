package jvm.parser.clazz.file;

import jvm.parser.constant.pools.ConstantInfo;
import jvm.parser.datatype.ByteCode;
import jvm.parser.datatype.U2;

import java.io.InputStream;

public class ConstantPool extends ByteCode<ConstantInfo[]> {
    public ConstantPool(ConstantInfo[] value) {
        super(value);
    }
}
