package jvm.parser.reader.token;

import jvm.parser.constant.pools.ConstantInfo;
import jvm.parser.constant.pools.ConstantStringInfo;
import jvm.parser.constant.pools.ConstantUtf8Info;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U2;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.ConstantToken;

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
        value.put(ConstantStringInfo.StringIndex, this.read(inputStream));
        constantStringInfo = new ConstantStringInfo(value);
    }

    @Override
    public int read(InputStream inputStream) {
        return U.two(inputStream);
    }
}
