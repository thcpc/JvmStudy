package jvm.parser.loader.support.token;

import jvm.parser.clazz.constant.pools.ConstantMethodHandleInfo;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.ConstantToken;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ConstantMethodHandleInfoToken implements U2, ConstantToken {
    private ConstantMethodHandleInfo constantMethodHandleInfo;
    @Override
    public ConstantMethodHandleInfo getConstantInfo() {
        return constantMethodHandleInfo;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        Map<String,Integer> value = new HashMap<>();
        value.put(ConstantMethodHandleInfo.BootstrapMethodAttrIndex,this.readU2(inputStream));
        value.put(ConstantMethodHandleInfo.NameAndTypeIndex, this.readU2(inputStream));
        constantMethodHandleInfo = new ConstantMethodHandleInfo(value);
    }


}
