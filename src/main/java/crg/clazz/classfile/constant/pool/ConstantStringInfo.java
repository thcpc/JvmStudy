package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.clazz.unit.U2;

import java.io.InputStream;


public class ConstantStringInfo extends CpInfo<String> {

    private int stringIndex;
    public ConstantStringInfo(Clazz clazz) {
        super(clazz);
    }

    @Override
    protected void lazyValue() {
        value = belongClazz().getConstantUtf8Infos().get(stringIndex).getValue();
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        stringIndex = U2.read(inputStream);

        this.belongClazz().appendConstantStringInfo(this);
    }

    public int getStringIndex() {
        return stringIndex;
    }

    public String getString(){ return this.getValue(); }

    @Override
    public String getName() {
        return "CONSTANT_String_info";
    }
}
