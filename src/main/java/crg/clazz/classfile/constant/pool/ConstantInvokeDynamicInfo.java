package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.clazz.unit.U2;

import java.io.InputStream;

public class ConstantInvokeDynamicInfo extends CpInfo<ConstantInvokeDynamicInfo.InvokeDynamicInfo> {

    private int bootstrapMethodAttrIndex;

    private int nameAndTypeIndex;
    public ConstantInvokeDynamicInfo(Clazz clazz, int index) {
        super(clazz,index );
    }

    @Override
    protected void lazyValue() {
        ConstantNameAndTypeInfo constantNameAndTypeInfo = (ConstantNameAndTypeInfo)belongClazz().getConstantPoolInfo().get(this.nameAndTypeIndex);
        value = new InvokeDynamicInfo(constantNameAndTypeInfo);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        this.bootstrapMethodAttrIndex = U2.read(inputStream);
        this.nameAndTypeIndex = U2.read(inputStream);

        this.belongClazz().appendConstantPoolInfo(this);
    }

    public int getBootstrapMethodAttrIndex() {
        return bootstrapMethodAttrIndex;
    }

    public int getNameAndTypeIndex() {
        return nameAndTypeIndex;
    }

    @Override
    public String getByteCodeName() {
        return null;
    }

    protected class InvokeDynamicInfo{
        private final ConstantNameAndTypeInfo nameAndTypeInfo;

        public InvokeDynamicInfo(ConstantNameAndTypeInfo nameAndTypeInfo) {
            this.nameAndTypeInfo = nameAndTypeInfo;
        }

        public ConstantNameAndTypeInfo getNameAndTypeInfo() {
            return nameAndTypeInfo;
        }
    }
}
