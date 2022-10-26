package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.clazz.unit.U2;

import java.io.InputStream;

public class ConstantInvokeDynamicInfo extends CpInfo<ConstantInvokeDynamicInfo.InvokeDynamicInfo> {

    private int bootstrapMethodAttrIndex;

    private int nameAndTypeIndex;
    public ConstantInvokeDynamicInfo(Clazz clazz) {
        super(clazz);
    }

    @Override
    protected void lazyValue() {
        value = new InvokeDynamicInfo(belongClazz().getConstantNameAndTypeInfos().get(this.nameAndTypeIndex));
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        this.bootstrapMethodAttrIndex = U2.read(inputStream);
        this.nameAndTypeIndex = U2.read(inputStream);

        this.belongClazz().appendConstantInvokeDynamicInfo(this);
    }

    public int getBootstrapMethodAttrIndex() {
        return bootstrapMethodAttrIndex;
    }

    public int getNameAndTypeIndex() {
        return nameAndTypeIndex;
    }

    @Override
    public String getName() {
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
