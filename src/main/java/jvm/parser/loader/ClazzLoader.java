package jvm.parser.loader;

import jvm.parser.clazz.Clazz;
import jvm.parser.loader.support.Token;
import jvm.parser.loader.support.Visitor;
import jvm.parser.loader.support.token.*;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.function.Consumer;

public class ClazzLoader extends Visitor<Clazz,FileInputStream> {


    public ClazzLoader(File file) throws FileNotFoundException {
        this.initVisitor();
        this.visit(new FileInputStream(file));
    }

    @Override
    protected void createVisitObject() { this.generatedObject = new Clazz(); }

    @Override
    protected void initTokens() {
        tokes.add(new MagicNumberToken());
        tokes.add(new MinorVersionToken());
        tokes.add(new MajorVersionToken());
        tokes.add(new ConstantPoolCountToken());
        tokes.add(new ConstantPoolToken());
        tokes.add(new AccessFlagToken());
        tokes.add(new ThisClassToken());
        tokes.add(new SuperClazzToken());
        tokes.add(new InterfaceToken());
        tokes.add(new FieldToken());
    }

    @Override
    protected void visit(FileInputStream fileInputStream){
        tokes.forEach(new Consumer<Token>() {
            @Override
            public void accept(Token token) {
                token.accept(ClazzLoader.this, fileInputStream);
            }
        });
    }

    public Clazz getClazz(){ return this.getGeneratedObject(); }



//    @Override
//    public Clazz getVisitObject() {
//        return clazz;
//    }

}


