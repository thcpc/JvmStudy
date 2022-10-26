package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.clazz.unit.U4;
import jvm.parser.clazz.constant.pools.ConstantInfo;

import java.io.InputStream;

public class ConstantFloatInfo extends CpInfo<Long> {

    public ConstantFloatInfo(Clazz clazz) {
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
        return "CONSTANT_Float_info";
    }
}
