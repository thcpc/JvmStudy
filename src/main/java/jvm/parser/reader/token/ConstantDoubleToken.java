package jvm.parser.reader.token;

import jvm.parser.constant.pools.ConstantDoubleInfo;
import jvm.parser.constant.pools.ConstantFloatInfo;
import jvm.parser.constant.pools.ConstantInfo;
import jvm.parser.constant.pools.ConstantLongInfo;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U4;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.ConstantToken;

import java.io.InputStream;

public class ConstantDoubleToken implements ConstantToken, U4 {

    private ConstantDoubleInfo constantDoubleInfo;
    private long highBytes;
    private long lowBytes;
    @Override
    public long read(InputStream inputStream) {
        highBytes = U.four(inputStream);
        lowBytes = U.four(inputStream);
        return (long)(highBytes<<32) + lowBytes;
    }

    @Override
    public ConstantInfo getConstantInfo() {
        return constantDoubleInfo;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        constantDoubleInfo = new ConstantDoubleInfo(read(inputStream));
    }
}
