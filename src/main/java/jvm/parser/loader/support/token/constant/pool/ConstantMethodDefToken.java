package jvm.parser.loader.support.token.constant.pool;

import jvm.parser.clazz.constant.pools.ConstantMethodDefInfo;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.ConstantToken;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ConstantMethodDefToken implements ConstantToken, U2 {
    private ConstantMethodDefInfo constantMethodDefInfo;



    @Override
    public ConstantMethodDefInfo getConstantInfo() {
        return constantMethodDefInfo;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        Map<String,Integer> value = new HashMap<>();
        value.put(ConstantMethodDefInfo.ClassIndex, this.readU2(inputStream));
        value.put(ConstantMethodDefInfo.NameAndTypeIndex, this.readU2(inputStream));
        constantMethodDefInfo = new ConstantMethodDefInfo(value);
    }
}
