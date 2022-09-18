package jvm.parser.reader.token;

import jvm.parser.constant.pools.ConstantMethodHandleInfo;
import jvm.parser.constant.pools.ConstantMethodTypeInfo;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U2;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.ConstantToken;

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
        value.put(ConstantMethodTypeInfo.BootstrapMethodAttrIndex,this.read(inputStream));
        value.put(ConstantMethodTypeInfo.NameAndTypeIndex, this.read(inputStream));
        constantMethodTypeInfo = new ConstantMethodTypeInfo(value);
    }

    @Override
    public int read(InputStream inputStream) {
        return U.two(inputStream);
    }
}
