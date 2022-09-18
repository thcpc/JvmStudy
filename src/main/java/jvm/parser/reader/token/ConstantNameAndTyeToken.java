package jvm.parser.reader.token;

import jvm.parser.constant.pools.ConstantNameAndTypeInfo;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U2;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.ConstantToken;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ConstantNameAndTyeToken implements ConstantToken, U2 {
    private ConstantNameAndTypeInfo constantNameAndTypeInfo;

    @Override
    public int read(InputStream inputStream) {
        return U.two(inputStream);
    }

    @Override
    public ConstantNameAndTypeInfo getConstantInfo() {
        return constantNameAndTypeInfo;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        Map<String,Integer> value = new HashMap<>();
        value.put(ConstantNameAndTypeInfo.NameIndex, this.read(inputStream));
        value.put(ConstantNameAndTypeInfo.DescriptionIndex, this.read(inputStream));
        constantNameAndTypeInfo = new ConstantNameAndTypeInfo(value);
    }
}
