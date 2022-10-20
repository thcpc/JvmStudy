package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.support.ByteCode;

import java.io.InputStream;

public abstract class CpInfo<T> extends ByteCode {

    protected T value;
    public CpInfo(Clazz clazz) {
        super(clazz);
    }

    public T getValue(){ return value;}
}
