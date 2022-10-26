package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.support.ByteCode;

public abstract class CpInfo<T> extends ByteCode {

    protected T value;
    public CpInfo(Clazz clazz) {
        super(clazz);
    }

    public T getValue(){
        if(value == null){
            lazyValue();
        }
        return value;
    }

    protected abstract void lazyValue();
}
