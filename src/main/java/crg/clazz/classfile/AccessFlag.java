package crg.clazz.classfile;


import crg.clazz.Clazz;
import crg.clazz.unit.U2;
import crg.support.ByteCode;

import java.io.InputStream;

public class AccessFlag extends ByteCode {

    public final static int ACC_PUBLIC = 0x0001;
    public final static int ACC_FINAL = 0x0010;
    public final static int ACC_SUPER = 0x0020;
    public final static int ACC_INTERFACE = 0x0200;
    public final static int ACC_ABSTRACT = 0x0400;
    public final static int ACC_SYNTHETIC = 0x1000;
    public final static int ACC_ANNOTATION = 0x2000;
    public final static int ACC_ENUM = 0x4000;


    public AccessFlag(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        int access = U2.read(inputStream);
        this.belongClazz().setAccessFlag(access);
    }

    @Override
    public String getByteCodeName() {
        return "Access_flags";
    }
}
