package jvm.parser.loader.support.token.constant.pool;

import jvm.parser.clazz.constant.pools.ConstantNameAndTypeInfo;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.ConstantToken;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ConstantNameAndTyeToken implements ConstantToken, U2 {
    private ConstantNameAndTypeInfo constantNameAndTypeInfo;



    @Override
    public ConstantNameAndTypeInfo getConstantInfo() {
        return constantNameAndTypeInfo;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        Map<String,Integer> value = new HashMap<>();
        value.put(ConstantNameAndTypeInfo.NameIndex, this.readU2(inputStream));
        value.put(ConstantNameAndTypeInfo.DescriptionIndex, this.readU2(inputStream));
        constantNameAndTypeInfo = new ConstantNameAndTypeInfo(value);
    }
}
