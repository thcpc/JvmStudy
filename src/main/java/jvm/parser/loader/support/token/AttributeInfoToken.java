package jvm.parser.loader.support.token;

import jvm.parser.clazz.attributes.AttributeInfo;
import jvm.parser.clazz.fields.FieldInfos;
import jvm.parser.datatype.*;
import jvm.parser.loader.support.Token;
import jvm.parser.loader.support.Visitor;

import java.io.InputStream;

public class AttributeInfoToken extends Visitor<AttributeInfo, InputStream> implements U2, U1, U4, Token<FieldInfoToken> {

    @Override
    public void accept(FieldInfoToken fieldInfoToken, InputStream inputStream) {

    }

    @Override
    protected void createVisitObject() {

    }

    @Override
    protected void initTokens() {
        this.tokes.add(new Token<AttributeInfoToken>() {
            @Override
            public void accept(AttributeInfoToken attributeInfoToken, InputStream inputStream) {
                attributeInfoToken.getGeneratedObject().getValue().put(AttributeInfo.AttributeNameIndex, new ByteCode<Integer>(BytesReader.two(inputStream)) {});
            }
        });
        this.tokes.add(new Token<AttributeInfoToken>() {
            @Override
            public void accept(AttributeInfoToken attributeInfoToken, InputStream inputStream) {
                attributeInfoToken.getGeneratedObject().getValue().put(AttributeInfo.AttributeLength, new ByteCode<Integer>(BytesReader.two(inputStream)) {});
            }
        });
        this.tokes.add(new Token<AttributeInfoToken>() {
            @Override
            public void accept(AttributeInfoToken attributeInfoToken, InputStream inputStream) {
                attributeInfoToken.getGeneratedObject().getValue().put(FieldInfos.AttributeCount, new ByteCode<Integer>(BytesReader.two(inputStream)) {});
            }
        });
    }

    @Override
    protected void visit(InputStream inputStream) {

    }
}
