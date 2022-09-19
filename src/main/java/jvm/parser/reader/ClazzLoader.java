package jvm.parser.reader;

import jvm.parser.clazz.file.Clazz;
import jvm.parser.reader.token.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ClazzLoader {
    private final FileInputStream fileInputStream;
    private final Clazz clazz;

    private final List<Token> tokes= new ArrayList<>();
    public ClazzLoader(File file) throws FileNotFoundException {
        fileInputStream = new FileInputStream(file);
        clazz = new Clazz();
        tokes.add(new MagicNumberToken());
        tokes.add(new MinorVersionToken());
        tokes.add(new MajorVersionToken());
        tokes.add(new ConstantPoolCountToken());
        tokes.add(new ConstantPoolToken());
        tokes.add(new AccessFlagToken());
        this.visitor();
    }

    private void visitor(){
        tokes.forEach(new Consumer<Token>() {
            @Override
            public void accept(Token token) {
                token.accept(ClazzLoader.this, fileInputStream);
            }
        });
    }


    public Clazz getClazz() {
        return clazz;
    }

}


