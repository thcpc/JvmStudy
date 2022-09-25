package jvm.parser.clazz.constant.pools;



import java.util.Map;

public class ConstantClassInfo extends ConstantInfo<Map<String,Integer>> {
    public static final String NameIndex = "name_index";
    public ConstantClassInfo(Map<String, Integer> value) {
        super(value);
    }

    @Override
    public short getTag() { return 7; }

    @Override
    public String name() {
        return "Class";
    }

}
