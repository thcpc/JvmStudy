package jvm.parser.reader.token;

import jvm.parser.constant.pools.ConstantFieldDefInfo;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U2;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.ConstantToken;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ConstantFieldDefToken implements ConstantToken, U2 {
    private ConstantFieldDefInfo constantFieldDefInfo;

    @Override
    public int read(InputStream inputStream) {
        return U.two(inputStream);
    }

    @Override
    public ConstantFieldDefInfo getConstantInfo() {
        return constantFieldDefInfo;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        Map<String,Integer> value = new HashMap<>();
        value.put(ConstantFieldDefInfo.ClassIndex, this.read(inputStream));
        value.put(ConstantFieldDefInfo.NameAndTypeIndex, this.read(inputStream));
        constantFieldDefInfo = new ConstantFieldDefInfo(value);
    }
}
