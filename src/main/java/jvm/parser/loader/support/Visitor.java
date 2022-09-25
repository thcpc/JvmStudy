package jvm.parser.loader.support;

import java.util.ArrayList;
import java.util.List;

public abstract class Visitor<GeneratedObject,AccessObjects> {

    protected GeneratedObject generatedObject;

    protected void initVisitor(){
        this.createVisitObject();
        this.initTokens();

    }

    protected abstract void createVisitObject();

    protected final List<Token> tokes= new ArrayList<>();

    protected abstract void initTokens();
    protected abstract void visit(AccessObjects accessObjects);
    public GeneratedObject getGeneratedObject() { return generatedObject;};
}
