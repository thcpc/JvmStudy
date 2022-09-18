package jvm.parser.constant.pools;


public class ConstantDoubleInfo extends ConstantInfo<Long> {

    public ConstantDoubleInfo(Long value) {
        super(value);
    }

    @Override
    public short getTag() { return 6; }

    @Override
    public String name() {
        return "Double";
    }
}
