package jvm.parser.loader.support.token.constant.pool;

import jvm.parser.clazz.constant.pools.ConstantInvokeDynamicInfo;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.ConstantToken;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ConstantInvokeDynamicInfoToken implements U2, ConstantToken {
    private ConstantInvokeDynamicInfo constantInvokeDynamicInfo;
    @Override
    public ConstantInvokeDynamicInfo getConstantInfo() {
        return constantInvokeDynamicInfo;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        Map<String,Integer> value = new HashMap<>();
        value.put(ConstantInvokeDynamicInfo.BootstrapMethodAttrIndex,this.readU2(inputStream));
        value.put(ConstantInvokeDynamicInfo.NameAndTypeIndex, this.readU2(inputStream));
        constantInvokeDynamicInfo = new ConstantInvokeDynamicInfo(value);
    }

}
