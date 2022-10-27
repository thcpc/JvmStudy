package crg.clazz.classfile.constant.pool;


import crg.clazz.Clazz;
import crg.clazz.unit.U4;

import java.io.InputStream;

public class ConstantLongInfo extends CpInfo<Long> {


    public ConstantLongInfo(Clazz clazz,int index) {
        super(clazz, index);
    }

    @Override
    protected void lazyValue() { }

    @Override
    public void read(InputStream inputStream) throws Exception {
        long highBytes = U4.read(inputStream);
        long lowBytes = U4.read(inputStream);
        value = (long)(highBytes<<32) + lowBytes;
        this.belongClazz().appendConstantPoolInfo(this);
        this.belongClazz().appendConstantPoolInfo(null);
//        this.belongClazz().appendConstantPoolInfo(null);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("#").append(this.getIndex());
        sb.append("=");
        sb.append(this.getByteCodeName());
        sb.append("    ");
        sb.append(this.getValue()).append("L");
        return sb.toString();
    }

    @Override
    public String getByteCodeName() {
        return "Long";
    }
}
