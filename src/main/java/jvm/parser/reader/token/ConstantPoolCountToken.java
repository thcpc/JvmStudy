package jvm.parser.reader.token;

import jvm.parser.clazz.file.ConstantPoolCount;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U2;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.Token;

import java.io.InputStream;

public class ConstantPoolCountToken implements U2, Token {
    @Override
    public int read(InputStream inputStream) {
        return U.two(inputStream);
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        ConstantPoolCount constantPoolCount = new ConstantPoolCount(read(inputStream));
        visitor.getClazz().setConstantPoolCount(constantPoolCount);
    }
}
