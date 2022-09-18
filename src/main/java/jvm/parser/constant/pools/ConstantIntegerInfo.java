package jvm.parser.constant.pools;

public class ConstantIntegerInfo extends ConstantInfo<Long> {

    public ConstantIntegerInfo(Long value) {
        super(value);
    }

    @Override
    public short getTag() {
        return 3;
    }

    @Override
    public String name() {
        return "Integer";
    }

}
