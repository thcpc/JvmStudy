package jvm.parser.loader.support.token;

import jvm.parser.clazz.Fields;
import jvm.parser.datatype.*;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.Token;
import jvm.parser.loader.support.Visitor;

import java.io.InputStream;
import java.util.HashMap;
import java.util.function.Consumer;

public class FieldToken extends Visitor<Fields,InputStream> implements U2, U1, U4, Token<ClazzLoader> {

    public FieldToken() {
        this.initVisitor();
    }

    @Override
    public void accept(ClazzLoader clazzLoader, InputStream inputStream) {
            this.visit(inputStream);
            clazzLoader.getGeneratedObject().setFields(this.getGeneratedObject());
    }

    @Override
    protected void createVisitObject() {
        this.generatedObject = new Fields(new HashMap<>());
    }

    @Override
    protected void initTokens() {
        this.tokes.add(new Token<FieldToken>() {
            @Override
            public void accept(FieldToken fieldToken, InputStream inputStream) {
                fieldToken.getGeneratedObject().getValue().put(Fields.FieldCount, new ByteCode<Integer>(BytesReader.two(inputStream)) {});
            }
        });
        this.tokes.add(new FieldInfoToken());
    }

    @Override
    protected void visit(InputStream inputStream) {
        tokes.forEach(new Consumer<Token>() {
            @Override
            public void accept(Token token) {
                token.accept(FieldToken.this, inputStream);
            }
        });
    }
}
