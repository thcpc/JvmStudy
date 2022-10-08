package jvm.parser.loader.support.token.constant.pool;

import jvm.parser.clazz.constant.pools.ConstantClassInfo;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.ConstantToken;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ConstantClassToken implements ConstantToken, U2 {
    private ConstantClassInfo constantClassInfo;


    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        Map<String,Integer> value = new HashMap<>();
        value.put(ConstantClassInfo.NameIndex,this.readU2(inputStream));
        constantClassInfo = new ConstantClassInfo(value);
    }

    @Override
    public ConstantClassInfo getConstantInfo() {
        return constantClassInfo;
    }
}
