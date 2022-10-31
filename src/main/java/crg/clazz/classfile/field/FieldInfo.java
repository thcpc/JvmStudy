package crg.clazz.classfile.field;

import crg.clazz.Clazz;
import crg.support.ByteCode;

import java.io.InputStream;

public class FieldInfo extends ByteCode {
    public FieldInfo(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {

    }

    @Override
    public String getByteCodeName() {
        return null;
    }


}
