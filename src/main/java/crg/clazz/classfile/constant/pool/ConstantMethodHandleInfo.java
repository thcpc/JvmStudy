package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.clazz.unit.U2;
import jvm.parser.clazz.constant.pools.ConstantInfo;

import java.io.InputStream;
import java.util.Map;

public class ConstantMethodHandleInfo extends CpInfo {

    private int bootstrapMethodAttrIndex;

    private int nameAndTypeIndex;
    public ConstantMethodHandleInfo(Clazz clazz) {
        super(clazz);
    }

    @Override
    protected void lazyValue() {
        ConstantNameAndTypeInfo constantNameAndTypeInfo = (ConstantNameAndTypeInfo)belongClazz().getConstantPoolInfo().get(this.nameAndTypeIndex);
        value = new MethodHandleInfo(constantNameAndTypeInfo);
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
    public String getName() {
        return "CONSTANT_MethodHandle_info";
    }

    protected class MethodHandleInfo{
        private final ConstantNameAndTypeInfo nameAndTypeInfo;

        public MethodHandleInfo(ConstantNameAndTypeInfo nameAndTypeInfo) {
            this.nameAndTypeInfo = nameAndTypeInfo;
        }

        public ConstantNameAndTypeInfo getNameAndTypeInfo() {
            return nameAndTypeInfo;
        }
    }
}
