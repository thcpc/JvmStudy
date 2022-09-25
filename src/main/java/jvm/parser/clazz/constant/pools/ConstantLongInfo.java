package jvm.parser.clazz.constant.pools;



public class ConstantLongInfo extends ConstantInfo<Long>{

    public ConstantLongInfo(Long value) {
        super(value);
    }

    @Override
    public short getTag() { return 5; }

    @Override
    public String name() {
        return "Long";
    }
}
