package jvm.parser.constant.pools;

import java.util.Map;

public class ConstantNameAndTypeInfo extends ConstantInfo<Map<String,Integer>>{
    public final static String NameIndex = "name_index";
    public final static String DescriptionIndex = "description_index";

    public ConstantNameAndTypeInfo(Map<String, Integer> value) {
        super(value);
    }

    @Override
    public short getTag() {
        return 12;
    }

    @Override
    public String name() {
        return "NameAndType";
    }
}
