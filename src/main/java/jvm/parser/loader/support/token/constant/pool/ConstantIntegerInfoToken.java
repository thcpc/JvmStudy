package jvm.parser.loader.support.token.constant.pool;

import jvm.parser.clazz.constant.pools.ConstantIntegerInfo;
import jvm.parser.datatype.U4;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.ConstantToken;

import java.io.InputStream;

public class ConstantIntegerInfoToken implements ConstantToken, U4 {

    private ConstantIntegerInfo constantIntegerInfo;

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        constantIntegerInfo = new ConstantIntegerInfo(readU4(inputStream));
    }

    @Override
    public ConstantIntegerInfo getConstantInfo() {
        return constantIntegerInfo;
    }
}
