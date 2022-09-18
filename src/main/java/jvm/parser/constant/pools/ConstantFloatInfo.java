package jvm.parser.constant.pools;

public class ConstantFloatInfo extends ConstantInfo<Long> {
    public ConstantFloatInfo(Long value) {
        super(value);
    }

    @Override
    public short getTag() {return 4;}

    @Override
    public String name() {
        return "Float";
    }
}
