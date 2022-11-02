package crg.clazz;

import crg.clazz.classfile.*;
import crg.support.ByteCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;

public class ClazzLoader {

    private final File file;

    public LinkedList<ByteCode> byteCodes = new LinkedList<>();
    public ClazzLoader(File file) throws FileNotFoundException {
        this.file = file;

    }

    public Clazz load() throws FileNotFoundException {
        Clazz clazz = new Clazz();
        byteCodes.add(new MagicNumber(clazz));
        byteCodes.add(new MinorVersion(clazz));
        byteCodes.add(new MajorVersion(clazz));
        byteCodes.add(new ConstantPoolCount(clazz));
        byteCodes.add(new ConstantPool(clazz));
        byteCodes.add(new AccessFlag(clazz));
        byteCodes.add(new ThisClazz(clazz));
        byteCodes.add(new SuperClazz(clazz));
        byteCodes.add(new Interfaces(clazz));
        byteCodes.add(new FieldsCount(clazz));
        byteCodes.add(new Fields(clazz));
        FileInputStream fileInputStream = new FileInputStream(this.file);
        byteCodes.forEach(byteCode -> {
            try {
                byteCode.read(fileInputStream);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        return clazz;
    }
}
