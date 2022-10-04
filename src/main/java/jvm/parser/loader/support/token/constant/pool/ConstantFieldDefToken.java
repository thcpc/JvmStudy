package jvm.parser.loader.support.token.constant.pool;

import jvm.parser.clazz.constant.pools.ConstantFieldDefInfo;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.ConstantToken;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ConstantFieldDefToken implements ConstantToken, U2 {
    private ConstantFieldDefInfo constantFieldDefInfo;


    @Override
    public ConstantFieldDefInfo getConstantInfo() {
        return constantFieldDefInfo;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        Map<String,Integer> value = new HashMap<>();
        value.put(ConstantFieldDefInfo.ClassIndex, this.readU2(inputStream));
        value.put(ConstantFieldDefInfo.NameAndTypeIndex, this.readU2(inputStream));
        constantFieldDefInfo = new ConstantFieldDefInfo(value);
    }
}
