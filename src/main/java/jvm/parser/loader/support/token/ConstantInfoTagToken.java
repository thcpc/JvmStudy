package jvm.parser.loader.support.token;

import jvm.parser.datatype.U1;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.Token;

import java.io.InputStream;

public class ConstantInfoTagToken implements U1, Token<ClazzLoader> {
    private short tag;


    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        this.tag = this.readU1(inputStream);
    }

    public short getTag() {
        return tag;
    }
}
