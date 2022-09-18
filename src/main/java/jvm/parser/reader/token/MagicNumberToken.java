package jvm.parser.reader.token;

import jvm.parser.clazz.file.MagicNumber;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U4;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.Token;

import java.io.InputStream;

public class MagicNumberToken implements U4, Token {
    @Override
    public long read(InputStream inputStream) {
        return U.four(inputStream);
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        MagicNumber magicNumber = new MagicNumber(this.read(inputStream));
        visitor.getClazz().setMagicNumber(magicNumber);
    }
}
