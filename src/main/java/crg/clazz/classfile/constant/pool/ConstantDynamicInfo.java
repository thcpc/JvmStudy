package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.clazz.unit.U2;

import java.io.InputStream;

/**
 *  JDK 11
 */
public class ConstantDynamicInfo extends CpInfo<ConstantDynamicInfo.DynamicInfo> {
    private int bootstrapMethodAttrIndex;

    private int nameAndTypeIndex;

    public ConstantDynamicInfo(Clazz clazz, int index) {
        super(clazz, index);
    }

    @Override
    protected void lazyValue() {

    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        this.bootstrapMethodAttrIndex = U2.read(inputStream);
        this.nameAndTypeIndex = U2.read(inputStream);

        this.belongClazz().appendConstantPoolInfo(this);
    }

    @Override
    public String getByteCodeName() {
        return null;
    }

    protected class DynamicInfo{
        private final ConstantNameAndTypeInfo nameAndTypeInfo;

        public DynamicInfo(ConstantNameAndTypeInfo nameAndTypeInfo) {
            this.nameAndTypeInfo = nameAndTypeInfo;
        }

        public ConstantNameAndTypeInfo getNameAndTypeInfo() {
            return nameAndTypeInfo;
        }
    }
}
