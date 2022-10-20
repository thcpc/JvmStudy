package crg.clazz.classfile.constant.pool;


import crg.clazz.Clazz;
import jvm.parser.clazz.constant.pools.ConstantInfo;

import java.io.InputStream;

public class ConstantLongInfo extends CpInfo {


    public ConstantLongInfo(Clazz clazz) {
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
