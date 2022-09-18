package jvm.parser.constant.pools;

import java.util.Map;

public class ConstantStringInfo extends ConstantInfo<Map<String,Integer>>{
    public static final String StringIndex = "string_index";
    public ConstantStringInfo(Map<String,Integer> value) {
        super(value);
    }

    @Override
    public short getTag() {
        return 8;
    }

    @Override
    public String name() {
        return "String";
    }
}
