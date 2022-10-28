package crg.clazz.classfile;

import crg.clazz.Clazz;
import crg.clazz.classfile.constant.pool.ConstantClassInfo;
import crg.clazz.unit.U2;
import crg.support.ByteCode;

import java.io.InputStream;

public class Interfaces extends ByteCode {
    public Interfaces(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        int interfacesCount = U2.read(inputStream);
        this.belongClazz().setInterfaceCount(interfacesCount);
        for(int i= 0; i<interfacesCount; i++){
            int nameIndex = U2.read(inputStream);
            ConstantClassInfo constantClassInfo = (ConstantClassInfo)belongClazz().getConstantPoolInfo().get(nameIndex);
            this.belongClazz().appendInterfaces(constantClassInfo.getClassName());
        }

    }

    @Override
    public String getByteCodeName() {
        return null;
    }
}
