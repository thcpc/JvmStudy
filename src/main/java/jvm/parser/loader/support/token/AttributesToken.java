package jvm.parser.loader.support.token;

import jvm.parser.clazz.AccessFlags;
import jvm.parser.clazz.attributes.AttributeInfo;
import jvm.parser.clazz.attributes.AttributeLength;
import jvm.parser.clazz.attributes.AttributeNameIndex;
import jvm.parser.clazz.attributes.Attributes;
import jvm.parser.clazz.fields.FieldDescriptionIndex;
import jvm.parser.clazz.fields.FieldInfo;
import jvm.parser.clazz.fields.FieldInfos;
import jvm.parser.clazz.fields.FieldNameIndex;
import jvm.parser.datatype.*;
import jvm.parser.loader.support.Token;
import jvm.parser.loader.support.Visitor;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class AttributesToken extends Visitor<Attributes, InputStream> implements U2, U1, U4, Token<FieldInfoToken> {

    @Override
    public void accept(FieldInfoToken fieldInfoToken, InputStream inputStream) {

    }

    @Override
    protected void createVisitObject() {

    }

    @Override
    protected void initTokens() {
        this.tokes.add(new Token<AttributesToken>() {

            @Override
            public void accept(AttributesToken attributesToken, InputStream inputStream) {
                AttributeNameIndex attributeNameIndex = new AttributeNameIndex(readU2(inputStream));
                AttributeLength attributeLength = new AttributeLength(readU4(inputStream));

                Map<String,ByteCode> value = new HashMap<>();
                value.put(AttributeInfo.AttributeLength,attributeLength);
                value.put(AttributeInfo.AttributeNameIndex, attributeNameIndex);
                // TODO 插入Attributes
                attributesToken.getGeneratedObject().getValue().add(new AttributeInfo(value));
            }
        });
//        this.tokes.add(new Token<AttributeInfoToken>() {
//            @Override
//            public void accept(AttributeInfoToken attributeInfoToken, InputStream inputStream) {
//                attributeInfoToken.getGeneratedObject().getValue().put(AttributeInfo.AttributeLength, new ByteCode<Integer>(BytesReader.two(inputStream)) {});
//            }
//        });
//        this.tokes.add(new Token<AttributeInfoToken>() {
//            @Override
//            public void accept(AttributeInfoToken attributeInfoToken, InputStream inputStream) {
//                attributeInfoToken.getGeneratedObject().getValue().put(FieldInfos.AttributeCount, new ByteCode<Integer>(BytesReader.two(inputStream)) {});
//            }
//        });
    }

    @Override
    protected void visit(InputStream inputStream) {

    }
}
