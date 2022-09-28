package jvm.parser.loader.support.token;

import jvm.parser.clazz.Fields;
import jvm.parser.clazz.fields.FieldInfo;
import jvm.parser.clazz.fields.FieldInfos;
import jvm.parser.datatype.*;
import jvm.parser.loader.support.Token;
import jvm.parser.loader.support.Visitor;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.function.Consumer;

public class FieldInfoToken extends Visitor<FieldInfos, InputStream> implements U2, Token<FieldToken> {
    private FieldInfos fieldInfos;

    public FieldInfoToken() {
        this.initVisitor();
    }

    @Override
    protected void createVisitObject() {
        this.generatedObject = new FieldInfos(new LinkedList<FieldInfo>());
    }

    @Override
    protected void initTokens() {
        this.tokes.add(new Token<FieldInfoToken>() {
            @Override
            public void accept(FieldInfoToken fieldInfoToken, InputStream inputStream) {
                fieldInfoToken.getGeneratedObject().getValue().put(FieldInfos.ACCESS_FLAGS, new ByteCode<Integer>(BytesReader.two(inputStream)) {});
            }
        });
//        this.tokes.add(new Token<FieldInfoToken>() {
//            @Override
//            public void accept(FieldInfoToken fieldInfoToken, InputStream inputStream) {
//                fieldInfoToken.getGeneratedObject().getValue().put(FieldInfos.NameIndex, new ByteCode<Integer>(BytesReader.two(inputStream)) {});
//            }
//        });
//        this.tokes.add(new Token<FieldInfoToken>() {
//            @Override
//            public void accept(FieldInfoToken fieldInfoToken, InputStream inputStream) {
//                fieldInfoToken.getGeneratedObject().getValue().put(FieldInfos.DescriptionIndex, new ByteCode<Integer>(BytesReader.two(inputStream)) {});
//            }
//        });
//        this.tokes.add(new Token<FieldInfoToken>() {
//            @Override
//            public void accept(FieldInfoToken fieldInfoToken, InputStream inputStream) {
//                fieldInfoToken.getGeneratedObject().getValue().put(FieldInfos.AttributeCount, new ByteCode<Integer>(BytesReader.two(inputStream)) {});
//            }
//        });
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
        int count = (int) fieldToken.getGeneratedObject().getValue().get(Fields.FieldCount).getValue();
        for(int i = 0;i<=count; i ++) this.visit(inputStream);
//        fieldToken.getGeneratedObject().getValue().put(Fields.FieldInfo, this.getGeneratedObject());

    }
}
