package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.clazz.unit.U2;

import java.io.InputStream;

public class ConstantMethodTypeInfo extends CpInfo<String> {
//    private int bootstrapMethodAttrIndex;

    private int descriptor_index;

    public ConstantMethodTypeInfo(Clazz clazz,int index) {
        super(clazz, index);
    }

    @Override
    protected void lazyValue() {
        value = (String)belongClazz().getConstantPoolInfo().get(this.descriptor_index).getValue();
//        value = new MethodTypeInfo(constantNameAndTypeInfo);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        this.descriptor_index = U2.read(inputStream);


        this.belongClazz().appendConstantPoolInfo(this);
    }


    public int getDescriptor_index() {
        return descriptor_index;
    }

    @Override
    public String getByteCodeName() {
        return "MethodType";
    }

}
