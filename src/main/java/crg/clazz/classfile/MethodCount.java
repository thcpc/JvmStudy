package crg.clazz.classfile;

import crg.clazz.Clazz;
import crg.clazz.unit.U2;
import crg.support.ByteCode;

import java.io.InputStream;

public class MethodCount extends ByteCode {
    public MethodCount(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        int count = U2.read(inputStream);
        this.belongClazz().setMethodCount(count);
    }

    @Override
    public String getByteCodeName() {
        return null;
    }

}
