package jvm.parser.loader.support.token;

import jvm.parser.clazz.constant.pools.ConstantDoubleInfo;
import jvm.parser.clazz.constant.pools.ConstantInfo;
import jvm.parser.datatype.U4;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.ConstantToken;

import java.io.InputStream;

public class ConstantDoubleToken implements ConstantToken, U4 {

    private ConstantDoubleInfo constantDoubleInfo;
    private long highBytes;
    private long lowBytes;

    @Override
    public ConstantInfo getConstantInfo() {
        return constantDoubleInfo;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        highBytes = readU4(inputStream);
        lowBytes = readU4(inputStream);
        constantDoubleInfo = new ConstantDoubleInfo((long)(highBytes<<32) + lowBytes);
    }
}
