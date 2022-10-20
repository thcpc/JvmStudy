package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.support.ByteCode;

import java.io.InputStream;

public abstract class CpInfo extends ByteCode {

    public CpInfo(Clazz clazz) {
        super(clazz);
    }
}
