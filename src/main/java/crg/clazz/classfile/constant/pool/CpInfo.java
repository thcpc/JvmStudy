package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.support.ByteCode;

public abstract class CpInfo<T> extends ByteCode {

    private final int index;
    protected T value;
    public CpInfo(Clazz clazz, int index) {
        super(clazz);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public T getValue(){
        if(value == null){
            lazyValue();
        }
        return value;
    }

    protected abstract void lazyValue();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("#").append(this.getIndex()).append(" = ").append(this.getByteCodeName());
        return sb.toString();
    }
}
