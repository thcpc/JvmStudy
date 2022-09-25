package jvm.parser.loader.support.token;

import jvm.parser.clazz.MajorVersion;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.Token;

import java.io.InputStream;

public class MajorVersionToken implements U2, Token<ClazzLoader> {


    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        MajorVersion majorVersion = new MajorVersion(this.readU2(inputStream));
        visitor.getGeneratedObject().setMajorVersion(majorVersion);
    }
}
