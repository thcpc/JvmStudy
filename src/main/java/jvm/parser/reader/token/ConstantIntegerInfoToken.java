package jvm.parser.reader.token;

import jvm.parser.constant.pools.ConstantInfo;
import jvm.parser.constant.pools.ConstantIntegerInfo;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U4;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.ConstantToken;
import jvm.parser.reader.Token;

import java.io.InputStream;

public class ConstantIntegerInfoToken implements ConstantToken, U4 {

    private ConstantIntegerInfo constantIntegerInfo;
    @Override
    public long read(InputStream inputStream) {
        return U.four(inputStream);
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        constantIntegerInfo = new ConstantIntegerInfo(read(inputStream));
    }

    @Override
    public ConstantIntegerInfo getConstantInfo() {
        return constantIntegerInfo;
    }
}
