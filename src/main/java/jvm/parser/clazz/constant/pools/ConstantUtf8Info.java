package jvm.parser.clazz.constant.pools;


public class ConstantUtf8Info extends ConstantInfo<String> {

    public ConstantUtf8Info(String value) {
        super(value);
    }

    @Override
    public short getTag() {
        return 1;
    }

    @Override
    public String name() {
        return "Utf8";
    }
}
