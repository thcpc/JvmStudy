package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.clazz.unit.U2;
import jvm.parser.clazz.constant.pools.ConstantInfo;

import java.io.InputStream;
import java.util.Map;

public class ConstantNameAndTypeInfo extends CpInfo<ConstantNameAndTypeInfo.NameAndType>{
    private int name_index;
    private int descriptor_index;

    public ConstantNameAndTypeInfo(Clazz clazz) {
        super(clazz);
    }

    @Override
    protected void lazyValue() {
        String name = (String)belongClazz().getConstantPoolInfo().get(name_index).getValue();
        String descriptor = (String)belongClazz().getConstantPoolInfo().get(descriptor_index).getValue();
        value = new NameAndType(name,descriptor);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        name_index = U2.read(inputStream);
        descriptor_index = U2.read(inputStream);

        this.belongClazz().appendConstantPoolInfo(this);
    }

    public int getName_index() {
        return name_index;
    }

    public int getDescriptor_index() {
        return descriptor_index;
    }

    public String getFieldOrMethodName() {
        return this.getValue().getName();
    }

    public String getDescriptor() {
        return this.getValue().getDescriptor();
    }



    @Override
    public String getName() {
        return null;
    }

    protected class NameAndType{
        private final String name;
        private final String descriptor;

        public NameAndType(String name, String descriptor) {
            this.name = name;
            this.descriptor = descriptor;
        }

        public String getName() {
            return name;
        }

        public String getDescriptor() {
            return descriptor;
        }
    }
}
