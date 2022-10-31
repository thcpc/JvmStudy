package crg.clazz.classfile;

import crg.clazz.Clazz;
import crg.clazz.unit.U2;
import crg.support.ByteCode;

import java.io.InputStream;

public class FieldsCount extends ByteCode {
    public FieldsCount(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        int count = U2.read(inputStream);
        this.belongClazz().setFieldCount(count);
    }

    @Override
    public String getName() {
        return "fields_count";
    }
}
