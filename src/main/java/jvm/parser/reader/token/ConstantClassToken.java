package jvm.parser.reader.token;

import jvm.parser.constant.pools.ConstantClassInfo;
import jvm.parser.constant.pools.ConstantInfo;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U2;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.ConstantToken;
import jvm.parser.reader.Token;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ConstantClassToken implements ConstantToken, U2 {
    private ConstantClassInfo constantClassInfo;
    @Override
    public int read(InputStream inputStream) {
        return U.two(inputStream);
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        Map<String,Integer> value = new HashMap<>();
        value.put(ConstantClassInfo.NameIndex,this.read(inputStream));
        constantClassInfo = new ConstantClassInfo(value);
    }

    @Override
    public ConstantClassInfo getConstantInfo() {
        return constantClassInfo;
    }
}
