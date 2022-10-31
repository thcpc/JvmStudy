package crg.clazz.classfile;

import crg.clazz.Clazz;
import crg.support.ByteCode;

import java.io.InputStream;

public class Fields extends ByteCode {
    public Fields(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {

    }

    @Override
    public String getName() {
        return null;
    }
}
