package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.clazz.unit.U4;


import java.io.InputStream;

public class ConstantIntegerInfo extends CpInfo<Long>{


    public ConstantIntegerInfo(Clazz clazz,int index) {
        super(clazz,index );
    }

    @Override
    protected void lazyValue() { }

    @Override
    public void read(InputStream inputStream) throws Exception {
        value = U4.read(inputStream);
        this.belongClazz().appendConstantPoolInfo(this);
    }

    @Override
    public String getByteCodeName() {
        return "CONSTANT_Integer_info";
    }
}
