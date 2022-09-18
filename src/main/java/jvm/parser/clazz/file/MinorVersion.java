package jvm.parser.clazz.file;

import jvm.parser.datatype.ByteCode;
import jvm.parser.datatype.U;

import jvm.parser.datatype.U2;

import java.io.InputStream;

public class MinorVersion extends ByteCode<Integer> {

    public MinorVersion(Integer value) {
        super(value);
    }
}
