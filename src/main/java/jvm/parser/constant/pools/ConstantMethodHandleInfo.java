package jvm.parser.constant.pools;

import java.util.Map;

public class ConstantMethodHandleInfo extends ConstantInfo<Map<String,Integer>>{
    public static final String BootstrapMethodAttrIndex = "bootstrap_method_attr_index";
    public static final String NameAndTypeIndex = "name_and_type_index";
    public ConstantMethodHandleInfo(Map<String, Integer> value) {
        super(value);
    }

    @Override
    public short getTag() {
        return 15;
    }

    @Override
    public String name() {
        return "MethodHandle";
    }
}
