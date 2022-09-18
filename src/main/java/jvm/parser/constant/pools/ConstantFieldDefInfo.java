package jvm.parser.constant.pools;

import java.util.Map;

public class ConstantFieldDefInfo extends ConstantInfo<Map<String,Integer>>{

    public final static String ClassIndex = "class_index";
    public final static String NameAndTypeIndex = "name_and_type_index";

    public ConstantFieldDefInfo(Map<String, Integer> value) {
        super(value);
    }

    @Override
    public short getTag() {
        return 9;
    }

    @Override
    public String name() {
        return "Fieldref";
    }
}
