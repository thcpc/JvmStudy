package jvm.parser.loader.support.token;

import jvm.parser.clazz.Fields;
import jvm.parser.clazz.fields.FieldInfo;
import jvm.parser.datatype.*;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.Token;
import jvm.parser.loader.support.Visitor;

import java.io.InputStream;
import java.util.HashMap;
import java.util.function.Consumer;

public class FieldInfoToken extends Visitor<FieldInfo, InputStream> implements U2, Token<FieldToken> {
    private FieldInfo fieldInfo;

    @Override
    protected void createVisitObject() {
        this.generatedObject = new FieldInfo(new HashMap<>());
    }

    @Override
    protected void initTokens() {
        this.tokes.add(new Token<FieldInfoToken>() {
            @Override
            public void accept(FieldInfoToken fieldInfoToken, InputStream inputStream) {
                fieldInfoToken.getGeneratedObject().getValue().put(FieldInfo.ACCESS_FLAGS, new ByteCode<Integer>(BytesReader.two(inputStream)) {});
            }
        });
        this.tokes.add(new Token<FieldInfoToken>() {
            @Override
            public void accept(FieldInfoToken fieldInfoToken, InputStream inputStream) {
                fieldInfoToken.getGeneratedObject().getValue().put(FieldInfo.NameIndex, new ByteCode<Integer>(BytesReader.two(inputStream)) {});
            }
        });
        this.tokes.add(new Token<FieldInfoToken>() {
            @Override
            public void accept(FieldInfoToken fieldInfoToken, InputStream inputStream) {
                fieldInfoToken.getGeneratedObject().getValue().put(FieldInfo.DescriptionIndex, new ByteCode<Integer>(BytesReader.two(inputStream)) {});
            }
        });
        this.tokes.add(new Token<FieldInfoToken>() {
            @Override
            public void accept(FieldInfoToken fieldInfoToken, InputStream inputStream) {
                fieldInfoToken.getGeneratedObject().getValue().put(FieldInfo.AttributeCount, new ByteCode<Integer>(BytesReader.two(inputStream)) {});
            }
        });
    }

    @Override
    protected void visit(InputStream inputStream) {
        tokes.forEach(new Consumer<Token>() {
            @Override
            public void accept(Token token) {
                token.accept(FieldInfoToken.this, inputStream);
            }
        });
    }

    @Override
    public void accept(FieldToken fieldToken, InputStream inputStream) {
        this.visit(inputStream);
        fieldToken.getGeneratedObject().getValue().put(Fields.FieldInfo, this.getGeneratedObject());

    }
}
