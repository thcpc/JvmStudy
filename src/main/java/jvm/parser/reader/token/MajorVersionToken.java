package jvm.parser.reader.token;

import jvm.parser.clazz.file.MajorVersion;
import jvm.parser.clazz.file.MinorVersion;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U2;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.Token;

import java.io.InputStream;

public class MajorVersionToken implements U2, Token {
    @Override
    public int read(InputStream inputStream) {
        return U.two(inputStream);
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        MajorVersion majorVersion = new MajorVersion(this.read(inputStream));
        visitor.getClazz().setMajorVersion(majorVersion);
    }
}
