package crg.clazz.classfile;


import crg.clazz.Clazz;
import crg.clazz.unit.U2;
import crg.support.ByteCode;

import java.io.InputStream;

public class MinorVersion extends ByteCode {

    public MinorVersion(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        U2.read(inputStream);
    }

    @Override
    public String getByteCodeName() {
        return "MinorVersion";
    }
}
