package crg.clazz.classfile;

import crg.clazz.Clazz;
import crg.clazz.unit.U2;
import crg.support.ByteCode;

import java.io.InputStream;

public class ConstantPoolCount extends ByteCode {
    public ConstantPoolCount(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        int constant_pool_count = U2.read(inputStream);
        this.belongClazz().setConstantPoolCount(constant_pool_count);
    }

    @Override
    public String getName() {
        return "ConstantPoolCount";
    }
}
