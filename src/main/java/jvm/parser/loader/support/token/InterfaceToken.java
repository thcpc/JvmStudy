package jvm.parser.loader.support.token;

import jvm.parser.clazz.Interfaces;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.Token;

import java.io.InputStream;
import java.util.Arrays;

public class InterfaceToken implements U2, Token<ClazzLoader> {
    private Interfaces interfaces;


    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        int interfacesCount = this.readU2(inputStream);
        Integer[] index = Arrays.stream(new Integer[interfacesCount]).map(i->this.readU2(inputStream)).toArray(Integer[]::new);
        interfaces = new Interfaces(index);
        visitor.getGeneratedObject().setInterfaces(interfaces);

    }
}
