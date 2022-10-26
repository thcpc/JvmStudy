package crg.clazz.classfile.constant.pool;



import crg.clazz.Clazz;
import crg.clazz.unit.U2;
import jvm.parser.clazz.constant.pools.ConstantInfo;

import java.io.InputStream;
import java.util.Map;

public class ConstantClassInfo extends CpInfo<String> {

    private int name_index;

    public ConstantClassInfo(Clazz clazz) {
        super(clazz);
    }

    @Override
    protected void lazyValue() {
        this.value = belongClazz().getConstantUtf8Infos().get(name_index).getValue();
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        name_index = U2.read(inputStream);
        this.belongClazz().appendConstantClassInfo(this);
    }

    public int getNameIndex() {return this.name_index; }

    public String getClassName() { return this.getValue();}

    @Override
    public String getName() {
        return "CONSTANT_Class_info";
    }
}
