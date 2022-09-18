package jvm.parser.reader.token;

import jvm.parser.constant.pools.ConstantInfo;
import jvm.parser.constant.pools.ConstantMethodHandleInfo;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U2;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.ConstantToken;

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
        value.put(ConstantMethodHandleInfo.BootstrapMethodAttrIndex,this.read(inputStream));
        value.put(ConstantMethodHandleInfo.NameAndTypeIndex, this.read(inputStream));
        constantMethodHandleInfo = new ConstantMethodHandleInfo(value);
    }

    @Override
    public int read(InputStream inputStream) {
        return U.two(inputStream);
    }
}
