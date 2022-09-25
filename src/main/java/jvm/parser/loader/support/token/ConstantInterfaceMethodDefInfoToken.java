package jvm.parser.loader.support.token;

import jvm.parser.clazz.constant.pools.ConstantInterfaceMethodDefInfo;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.ConstantToken;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ConstantInterfaceMethodDefInfoToken implements U2, ConstantToken {
    private ConstantInterfaceMethodDefInfo constantInterfaceMethodDefInfo;
    @Override
    public ConstantInterfaceMethodDefInfo getConstantInfo() {
        return constantInterfaceMethodDefInfo;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        Map<String,Integer> value = new HashMap<>();
        value.put(ConstantInterfaceMethodDefInfo.ClassIndex, this.readU2(inputStream));
        value.put(ConstantInterfaceMethodDefInfo.NameAndTypeIndex, this.readU2(inputStream));
        constantInterfaceMethodDefInfo = new ConstantInterfaceMethodDefInfo(value);
    }

}
