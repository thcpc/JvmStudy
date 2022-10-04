package jvm.parser.loader.support.token.constant.pool;

import jvm.parser.clazz.constant.pools.ConstantLongInfo;
import jvm.parser.datatype.U4;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.ConstantToken;

import java.io.InputStream;

public class ConstantLongToken implements ConstantToken, U4 {
    private ConstantLongInfo constantLongInfo;
    private long highBytes;
    private long lowBytes;


    @Override
    public ConstantLongInfo getConstantInfo() {
        return constantLongInfo ;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        highBytes = readU4(inputStream);
        lowBytes = readU4(inputStream);
        constantLongInfo = new ConstantLongInfo((long)(highBytes<<32) + lowBytes);
    }
}
