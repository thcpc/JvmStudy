package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.clazz.unit.U1;
import crg.clazz.unit.U2;

import java.io.InputStream;

public class ConstantMethodHandleInfo extends CpInfo<ConstantMethodHandleInfo.MethodHandleInfo> {

    private short referenceKind;

    private int referenceIndex;
    public ConstantMethodHandleInfo(Clazz clazz,int index) {
        super(clazz,index );
    }

    @Override
    protected void lazyValue() {
        ConstantMethodDRefInfo constantMethodDRefInfo = (ConstantMethodDRefInfo)belongClazz().getConstantPoolInfo().get(this.referenceIndex);
        value = new MethodHandleInfo(constantMethodDRefInfo);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        this.referenceKind = U1.read(inputStream);
        this.referenceIndex = U2.read(inputStream);
        this.belongClazz().appendConstantPoolInfo(this);
    }


    @Override
    public String getByteCodeName() {
        return "MethodHandle";
    }

    protected class MethodHandleInfo{
        private final ConstantMethodDRefInfo constantMethodDRefInfo;

        public MethodHandleInfo(ConstantMethodDRefInfo constantMethodDRefInfo) {
            this.constantMethodDRefInfo = constantMethodDRefInfo;
        }

        public ConstantMethodDRefInfo getConstantMethodDRefInfo() {
            return constantMethodDRefInfo;
        }
    }
}
