package jvm.parser.reader.token;

import jvm.parser.clazz.file.ThisClazz;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U2;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.Token;

import java.io.InputStream;

public class ThisClassToken implements U2, Token {
    private ThisClazz thisClazz;
    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        int index = this.read(inputStream);
        thisClazz = new ThisClazz(index);
        visitor.getClazz().setThisClazz(thisClazz);
    }

    @Override
    public int read(InputStream inputStream) {
        return U.two(inputStream);
    }
}
