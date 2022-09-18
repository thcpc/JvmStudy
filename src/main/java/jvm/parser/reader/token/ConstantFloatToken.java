package jvm.parser.reader.token;

import jvm.parser.constant.pools.ConstantFloatInfo;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U4;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.ConstantToken;

import java.io.InputStream;

public class ConstantFloatToken implements ConstantToken, U4 {

    private ConstantFloatInfo constantFloatInfo;


    @Override
    public long read(InputStream inputStream) {
        return U.four(inputStream);
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        constantFloatInfo = new ConstantFloatInfo(read(inputStream));
    }

    @Override
    public ConstantFloatInfo getConstantInfo() {
        return constantFloatInfo;
    }
}
