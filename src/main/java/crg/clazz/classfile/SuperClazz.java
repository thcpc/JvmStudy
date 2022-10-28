package crg.clazz.classfile;

import crg.clazz.Clazz;
import crg.clazz.classfile.constant.pool.ConstantClassInfo;
import crg.clazz.unit.U2;
import crg.support.ByteCode;

import java.io.InputStream;

public class SuperClazz extends ByteCode {
    private int nameIndex;
    public SuperClazz(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        nameIndex = U2.read(inputStream);
        ConstantClassInfo constantClassInfo = (ConstantClassInfo)this.belongClazz().getConstantPoolInfo().get(nameIndex);
        belongClazz().setSuperClass(constantClassInfo.getClassName());

    }

    @Override
    public String getByteCodeName() {
        return null;
    }
}
