package jvm.parser.loader.support.token;

import jvm.parser.clazz.ThisClazz;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.Token;

import java.io.InputStream;

public class ThisClassToken implements U2, Token<ClazzLoader> {
    private ThisClazz thisClazz;
    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        int index = this.readU2(inputStream);
        thisClazz = new ThisClazz(index);
        visitor.getGeneratedObject().setThisClazz(thisClazz);
    }

}
