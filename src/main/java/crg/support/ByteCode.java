package crg.support;

import crg.clazz.Clazz;


import java.io.InputStream;

public abstract class ByteCode {
    private Clazz clazz;

    public ByteCode(Clazz clazz) {
        this.clazz = clazz;
    }
    public abstract void read(InputStream inputStream) throws Exception;



    public abstract String getName();

    public Clazz belongClazz() { return clazz; }
}
