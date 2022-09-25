package jvm.parser.loader.support.token;

import jvm.parser.clazz.constant.pools.ConstantFloatInfo;
import jvm.parser.datatype.U4;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.ConstantToken;

import java.io.InputStream;

public class ConstantFloatToken implements ConstantToken, U4 {

    private ConstantFloatInfo constantFloatInfo;

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        constantFloatInfo = new ConstantFloatInfo(readU4(inputStream));
    }

    @Override
    public ConstantFloatInfo getConstantInfo() {
        return constantFloatInfo;
    }
}
