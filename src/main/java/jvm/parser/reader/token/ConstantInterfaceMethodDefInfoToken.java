package jvm.parser.reader.token;

import jvm.parser.constant.pools.ConstantInfo;
import jvm.parser.constant.pools.ConstantInterfaceMethodDefInfo;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U2;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.ConstantToken;

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
        value.put(ConstantInterfaceMethodDefInfo.ClassIndex, this.read(inputStream));
        value.put(ConstantInterfaceMethodDefInfo.NameAndTypeIndex, this.read(inputStream));
        constantInterfaceMethodDefInfo = new ConstantInterfaceMethodDefInfo(value);
    }

    @Override
    public int read(InputStream inputStream) {
        return U.two(inputStream);
    }
}
