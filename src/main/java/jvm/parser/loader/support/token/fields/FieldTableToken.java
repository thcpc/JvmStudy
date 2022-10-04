package jvm.parser.loader.support.token.fields;

import jvm.parser.clazz.FieldsTable;
import jvm.parser.clazz.fields.Fields;
import jvm.parser.datatype.*;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.Token;
import jvm.parser.loader.support.Visitor;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.function.Consumer;

public class FieldTableToken extends Visitor<FieldsTable,InputStream> implements U2, U1, U4, Token<ClazzLoader> {

    public FieldTableToken() {
        this.initVisitor();
    }

    @Override
    public void accept(ClazzLoader clazzLoader, InputStream inputStream) {
            this.visit(inputStream);
            clazzLoader.getClazz().setFieldTable(this.getGeneratedObject());
    }

    @Override
    protected void createVisitObject() {
        this.generatedObject = new FieldsTable(new HashMap<>());
    }

    @Override
    protected void initTokens() {
        this.tokes.add(new Token<FieldTableToken>() {
            @Override
            public void accept(FieldTableToken fieldTableToken, InputStream inputStream) {
                fieldTableToken.setFieldsCount(new ByteCode<Integer>(BytesReader.two(inputStream)) {});
            }
        });

        this.tokes.add(new FieldsToken());
    }

    public void setFieldsCount(ByteCode value){
        this.getGeneratedObject().getValue().put(FieldsTable.FIELDS_COUNT,value);
    }

    public void setFields(ByteCode value){
        this.getGeneratedObject().getValue().put(FieldsTable.FIELDS,value);
    }

    @Override
    protected void visit(InputStream inputStream) {
        tokes.forEach(new Consumer<Token>() {
            @Override
            public void accept(Token token) {
                token.accept(FieldTableToken.this, inputStream);
            }
        });
    }
}
