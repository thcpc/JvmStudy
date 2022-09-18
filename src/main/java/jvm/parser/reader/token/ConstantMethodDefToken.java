package jvm.parser.reader.token;

import jvm.parser.constant.pools.ConstantMethodDefInfo;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U2;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.ConstantToken;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ConstantMethodDefToken implements ConstantToken, U2 {
    private ConstantMethodDefInfo constantMethodDefInfo;

    @Override
    public int read(InputStream inputStream) {
        return U.two(inputStream);
    }

    @Override
    public ConstantMethodDefInfo getConstantInfo() {
        return constantMethodDefInfo;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        Map<String,Integer> value = new HashMap<>();
        value.put(ConstantMethodDefInfo.ClassIndex, this.read(inputStream));
        value.put(ConstantMethodDefInfo.NameAndTypeIndex, this.read(inputStream));
        constantMethodDefInfo = new ConstantMethodDefInfo(value);
    }
}
