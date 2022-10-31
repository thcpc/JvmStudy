package crg.clazz.classfile.attribute;

import crg.clazz.Clazz;
import crg.support.ByteCode;

import java.io.InputStream;

public class AttributeCount<Parent> extends ByteCode {
    private Parent t;
    public AttributeCount(Clazz clazz, Parent parent) {
        super(clazz);
        this.t = parent;
    }

    @Override
    public void read(InputStream inputStream) throws Exception {

    }

    @Override
    public String getByteCodeName() {
        return null;
    }


}
