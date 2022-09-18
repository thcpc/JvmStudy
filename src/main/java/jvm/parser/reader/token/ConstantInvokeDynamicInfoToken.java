package jvm.parser.reader.token;

import jvm.parser.constant.pools.ConstantInvokeDynamicInfo;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U2;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.ConstantToken;

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
        value.put(ConstantInvokeDynamicInfo.BootstrapMethodAttrIndex,this.read(inputStream));
        value.put(ConstantInvokeDynamicInfo.NameAndTypeIndex, this.read(inputStream));
        constantInvokeDynamicInfo = new ConstantInvokeDynamicInfo(value);
    }

    @Override
    public int read(InputStream inputStream) {
        return U.two(inputStream);
    }
}
