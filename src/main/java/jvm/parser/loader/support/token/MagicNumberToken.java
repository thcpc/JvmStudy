package jvm.parser.loader.support.token;

import jvm.parser.clazz.MagicNumber;
import jvm.parser.datatype.U4;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.Token;

import java.io.InputStream;

public class MagicNumberToken implements U4, Token<ClazzLoader> {

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        MagicNumber magicNumber = new MagicNumber(this.readU4(inputStream));
        visitor.getGeneratedObject().setMagicNumber(magicNumber);
    }
}
