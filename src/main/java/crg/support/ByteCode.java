package crg.support;

import crg.clazz.Clazz;

import java.io.InputStream;

public abstract class ByteCode<T> {
    private Clazz clazz;

    public ByteCode(Clazz clazz) {
        this.clazz = clazz;
    }
    public abstract T read(InputStream inputStream);
}
