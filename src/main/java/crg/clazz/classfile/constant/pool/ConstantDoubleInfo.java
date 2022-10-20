package crg.clazz.classfile.constant.pool;


import crg.clazz.Clazz;
import crg.clazz.unit.U4;
import jvm.parser.clazz.constant.pools.ConstantInfo;

import java.io.InputStream;

public class ConstantDoubleInfo extends CpInfo<Long> {


    public ConstantDoubleInfo(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
       long highBytes = U4.read(inputStream);
       long lowBytes = U4.read(inputStream);
       value = (long)(highBytes<<32) + lowBytes;
       belongClazz().appendConstantDoubleInfo(this);
    }


    @Override
    public String getName() {
        return "CONSTANT_Double_info";
    }
}
