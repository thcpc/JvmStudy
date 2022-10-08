package jvm.parser.loader.support.token.fields;

import jvm.parser.clazz.AccessFlags;
import jvm.parser.clazz.FieldsTable;
import jvm.parser.clazz.attributes.AttributesCount;
import jvm.parser.clazz.fields.field.info.DescriptionIndex;
import jvm.parser.clazz.fields.FieldInfo;
import jvm.parser.clazz.fields.Fields;
import jvm.parser.clazz.fields.field.info.NameIndex;
import jvm.parser.datatype.*;
import jvm.parser.loader.support.Token;
import jvm.parser.loader.support.Visitor;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Consumer;

public class FieldsToken extends Visitor<Fields, InputStream> implements U2, Token<FieldTableToken> {


    public FieldsToken() {
        this.initVisitor();
    }

    @Override
    protected void createVisitObject() {
        this.generatedObject = new Fields(new LinkedList<FieldInfo>());
    }

    @Override
    protected void initTokens() {
        this.tokes.add(new Token<FieldsToken>() {
            @Override
            public void accept(FieldsToken fieldsToken, InputStream inputStream) {
                AccessFlags accessFlags = new AccessFlags(readU2(inputStream));
                NameIndex fieldNameIndex = new NameIndex(readU2(inputStream));
                DescriptionIndex fieldDescriptionIndex = new DescriptionIndex(readU2(inputStream));
                AttributesCount attributesCount = new AttributesCount(readU2(inputStream));
                Map<String,ByteCode> value = new HashMap<>();
                value.put(FieldInfo.ACCESS_FLAGS,accessFlags);
                value.put(FieldInfo.NAME_INDEX,fieldNameIndex);
                value.put(FieldInfo.DESCRIPTION_INDEX,fieldDescriptionIndex);
                value.put(FieldInfo.ATTRIBUTE_COUNT,attributesCount);
//               TODO 插入Attributes

                FieldInfo fieldInfo = new FieldInfo(value);
                fieldsToken.append(fieldInfo);

            }
        });
    }

    public void append(FieldInfo fieldInfo){ this.generatedObject.getValue().add(fieldInfo); }

    @Override
    protected void visit(InputStream inputStream) {
        tokes.forEach(new Consumer<Token>() {
            @Override
            public void accept(Token token) {
                token.accept(FieldsToken.this, inputStream);
            }
        });
    }

    @Override
    public void accept(FieldTableToken fieldTableToken, InputStream inputStream) {
        int count = (int) fieldTableToken.getGeneratedObject().getValue().get(FieldsTable.FIELDS_COUNT).getValue();
        for(int i = 0;i<=count; i ++) this.visit(inputStream);
        fieldTableToken.setFields(this.getGeneratedObject());
//        fieldToken.getGeneratedObject().getValue().put(Fields.FieldInfo, this.getGeneratedObject());

    }
}
