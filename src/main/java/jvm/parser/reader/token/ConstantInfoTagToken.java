package jvm.parser.reader.token;

import jvm.parser.datatype.U;
import jvm.parser.datatype.U1;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.Token;

import java.io.InputStream;

public class ConstantInfoTagToken implements U1, Token {
    private short tag;

    @Override
    public short read(InputStream inputStream) {
        return U.one(inputStream);
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        this.tag = this.read(inputStream);
    }

    public short getTag() {
        return tag;
    }
}
