package jvm.parser.loader.support.token;

import jvm.parser.clazz.AccessFlags;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.Token;

import java.io.InputStream;

public class AccessFlagToken implements U2, Token<ClazzLoader> {


    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        visitor.getGeneratedObject().setAccessFlags(new AccessFlags(this.readU2(inputStream)));
    }

}
