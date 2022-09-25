package jvm.parser.clazz.constant.pools;

import java.util.Map;

public class ConstantInterfaceMethodDefInfo extends ConstantInfo<Map<String,Integer>>{

    public final static String ClassIndex = "class_index";

    public final static String NameAndTypeIndex = "name_and_type_index";

    public ConstantInterfaceMethodDefInfo(Map<String, Integer> value) {
        super(value);
    }

    @Override
    public short getTag() {
        return 11;
    }

    @Override
    public String name() {
        return "InterfaceMethodref";
    }
}
