package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.clazz.unit.U2;

import java.io.InputStream;


public class ConstantStringInfo extends CpInfo<String> {

    private int stringIndex;
    public ConstantStringInfo(Clazz clazz, int index) {
        super(clazz, index);
    }

    @Override
    protected void lazyValue() {
        value = (String) belongClazz().getConstantPoolInfo().get(stringIndex).getValue();
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        stringIndex = U2.read(inputStream);

        this.belongClazz().appendConstantStringInfo(this);
        this.belongClazz().appendConstantPoolInfo(this);
    }

    public int getStringIndex() {
        return stringIndex;
    }

    public String getString(){ return this.getValue(); }

    @Override
    public String getByteCodeName() {
        return "CONSTANT_String_info";
    }
}
