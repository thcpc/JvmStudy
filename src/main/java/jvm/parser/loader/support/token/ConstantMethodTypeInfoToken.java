package jvm.parser.loader.support.token;

import jvm.parser.clazz.constant.pools.ConstantMethodTypeInfo;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.ConstantToken;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ConstantMethodTypeInfoToken implements U2, ConstantToken {
    private ConstantMethodTypeInfo constantMethodTypeInfo;
    @Override
    public ConstantMethodTypeInfo getConstantInfo() {
        return constantMethodTypeInfo;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        Map<String,Integer> value = new HashMap<>();
        value.put(ConstantMethodTypeInfo.BootstrapMethodAttrIndex,this.readU2(inputStream));
        value.put(ConstantMethodTypeInfo.NameAndTypeIndex, this.readU2(inputStream));
        constantMethodTypeInfo = new ConstantMethodTypeInfo(value);
    }


}
