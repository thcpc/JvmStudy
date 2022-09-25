package jvm.parser.loader.support.token;

import jvm.parser.clazz.MinorVersion;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.Token;

import java.io.InputStream;

public class MinorVersionToken implements U2, Token<ClazzLoader> {


    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        MinorVersion minorVersion = new MinorVersion(this.readU2(inputStream));
        visitor.getGeneratedObject().setMinorVersion(minorVersion);
    }
}
