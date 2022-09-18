package jvm.parser.reader.token;

import jvm.parser.constant.pools.ConstantInfo;
import jvm.parser.constant.pools.ConstantIntegerInfo;
import jvm.parser.constant.pools.ConstantLongInfo;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U4;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.ConstantToken;

import java.io.InputStream;

public class ConstantLongToken implements ConstantToken, U4 {
    private ConstantLongInfo constantLongInfo;
    private long highBytes;
    private long lowBytes;

    @Override
    public long read(InputStream inputStream) {
        highBytes = U.four(inputStream);
        lowBytes = U.four(inputStream);
        return (long)(highBytes<<32) + lowBytes;
    }

    @Override
    public ConstantLongInfo getConstantInfo() {
        return constantLongInfo ;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        constantLongInfo = new ConstantLongInfo(read(inputStream));
    }
}
