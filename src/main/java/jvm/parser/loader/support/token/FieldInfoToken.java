package jvm.parser.loader.support.token;

import jvm.parser.clazz.AccessFlags;
import jvm.parser.clazz.Fields;
import jvm.parser.clazz.attributes.AttributeLength;
import jvm.parser.clazz.attributes.AttributesCount;
import jvm.parser.clazz.fields.FieldDescriptionIndex;
import jvm.parser.clazz.fields.FieldInfo;
import jvm.parser.clazz.fields.FieldInfos;
import jvm.parser.clazz.fields.FieldNameIndex;
import jvm.parser.datatype.*;
import jvm.parser.loader.support.Token;
import jvm.parser.loader.support.Visitor;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
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
                AccessFlags accessFlags = new AccessFlags(readU2(inputStream));
                FieldNameIndex fieldNameIndex = new FieldNameIndex(readU2(inputStream));
                FieldDescriptionIndex fieldDescriptionIndex = new FieldDescriptionIndex(readU2(inputStream));
                AttributesCount attributesCount = new AttributesCount(readU2(inputStream));
                Map<String,ByteCode> value = new HashMap<>();
                value.put(FieldInfo.ACCESS_FLAGS,accessFlags);
                value.put(FieldInfo.NameIndex,fieldNameIndex);
                value.put(FieldInfo.DescriptionIndex,fieldDescriptionIndex);
                value.put(FieldInfo.AttributeCount,attributesCount);
//               TODO 插入Attributes

                FieldInfo fieldInfo = new FieldInfo(value);
                fieldInfoToken.getGeneratedObject().getValue().add(fieldInfo);

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
        int count = (int) fieldToken.getGeneratedObject().getValue().get(Fields.FieldCount).getValue();
        for(int i = 0;i<=count; i ++) this.visit(inputStream);
//        fieldToken.getGeneratedObject().getValue().put(Fields.FieldInfo, this.getGeneratedObject());

    }
}
