package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.clazz.unit.U2;
import jvm.parser.clazz.constant.pools.ConstantInfo;

import java.io.InputStream;
import java.util.Map;

public class ConstantMethodTypeInfo extends CpInfo<ConstantMethodTypeInfo.MethodTypeInfo> {
    private int bootstrapMethodAttrIndex;

    private int nameAndTypeIndex;

    public ConstantMethodTypeInfo(Clazz clazz) {
        super(clazz);
    }

    @Override
    protected void lazyValue() {
        value = new MethodTypeInfo(belongClazz().getConstantNameAndTypeInfos().get(this.nameAndTypeIndex));
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        this.bootstrapMethodAttrIndex = U2.read(inputStream);
        this.nameAndTypeIndex = U2.read(inputStream);

        this.belongClazz().appendConstantMethodTypeInfo(this);
    }




    public int getBootstrapMethodAttrIndex() {
        return bootstrapMethodAttrIndex;
    }

    public int getNameAndTypeIndex() {
        return nameAndTypeIndex;
    }

    @Override
    public String getName() {
        return "CONSTANT_MethodType_info";
    }

    protected class MethodTypeInfo{
        private final ConstantNameAndTypeInfo nameAndTypeInfo;

        public MethodTypeInfo(ConstantNameAndTypeInfo nameAndTypeInfo) {
            this.nameAndTypeInfo = nameAndTypeInfo;
        }

        public ConstantNameAndTypeInfo getNameAndTypeInfo() {
            return nameAndTypeInfo;
        }
    }
}
