package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;


import java.io.InputStream;

public class ConstantIntegerInfo extends CpInfo{


    public ConstantIntegerInfo(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {

    }

    @Override
    public String getName() {
        return "CONSTANT_Integer_info";
    }
}
