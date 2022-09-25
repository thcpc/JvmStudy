package jvm.parser.loader.support.token;

import jvm.parser.clazz.SuperClazz;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.Token;

import java.io.InputStream;

public class SuperClazzToken implements U2, Token<ClazzLoader> {
    private SuperClazz superClazz;


    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        this.superClazz = new SuperClazz(this.readU2(inputStream));
        visitor.getGeneratedObject().setSuperClazz(this.superClazz);
    }
}
