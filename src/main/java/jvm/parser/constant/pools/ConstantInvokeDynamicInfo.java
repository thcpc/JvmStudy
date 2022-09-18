package jvm.parser.constant.pools;

import java.util.Map;

public class ConstantInvokeDynamicInfo extends ConstantInfo<Map<String,Integer>>{
    public static final String BootstrapMethodAttrIndex = "bootstrap_method_attr_index";
    public static final String NameAndTypeIndex = "name_and_type_index";

    public ConstantInvokeDynamicInfo(Map<String, Integer> value) {
        super(value);
    }

    @Override
    public short getTag() {
        return 18;
    }

    @Override
    public String name() {
        return "InvokeDynamic";
    }
}
