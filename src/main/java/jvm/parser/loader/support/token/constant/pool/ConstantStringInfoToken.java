package jvm.parser.loader.support.token.constant.pool;

import jvm.parser.clazz.constant.pools.ConstantStringInfo;
import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.ConstantToken;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ConstantStringInfoToken implements U2, ConstantToken {

    private ConstantStringInfo constantStringInfo;

    @Override
    public ConstantStringInfo getConstantInfo() {
        return constantStringInfo;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        Map<String, Integer> value = new HashMap<>();
        value.put(ConstantStringInfo.StringIndex, this.readU2(inputStream));
        constantStringInfo = new ConstantStringInfo(value);
    }

}
