package jvm.parser.loader.support.token;

import jvm.parser.clazz.ConstantPoolCount;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.Token;

import java.io.InputStream;

public class ConstantPoolCountToken implements U2, Token<ClazzLoader> {


    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        ConstantPoolCount constantPoolCount = new ConstantPoolCount(readU2(inputStream));
        visitor.getGeneratedObject().setConstantPoolCount(constantPoolCount);
    }
}
