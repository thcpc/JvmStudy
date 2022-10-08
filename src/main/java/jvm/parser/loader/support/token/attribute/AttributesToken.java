package jvm.parser.loader.support.token.attribute;

import jvm.parser.clazz.attributes.AttributeInfo;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeLength;
import jvm.parser.clazz.attributes.attribute.info.common.AttributeNameIndex;
import jvm.parser.clazz.attributes.Attributes;
import jvm.parser.datatype.*;
import jvm.parser.loader.support.Token;
import jvm.parser.loader.support.Visitor;
import jvm.parser.loader.support.token.fields.FieldsToken;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class AttributesToken extends Visitor<Attributes, InputStream> implements U2, U1, U4, Token<FieldsToken> {

    @Override
    public void accept(FieldsToken fieldsToken, InputStream inputStream) {

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
                value.put(AttributeInfo.ATTRIBUTE_LENGTH,attributeLength);
                value.put(AttributeInfo.ATTRIBUTE_NAME_INDEX, attributeNameIndex);
                // TODO 插入Attributes
                attributesToken.getGeneratedObject().getValue().add(new AttributeInfo(value));
            }
        });
    }

    @Override
    protected void visit(InputStream inputStream) {

    }
}
