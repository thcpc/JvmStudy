package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.clazz.unit.U4;


import java.io.InputStream;

public class ConstantIntegerInfo extends CpInfo<Long>{


    public ConstantIntegerInfo(Clazz clazz) {
        super(clazz);
    }

    @Override
    protected void lazyValue() { }

    @Override
    public void read(InputStream inputStream) throws Exception {
        value = U4.read(inputStream);
        this.belongClazz().appendConstantPoolInfo(this);
    }

    @Override
    public String getName() {
        return "CONSTANT_Integer_info";
    }
}
