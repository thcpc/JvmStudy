package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.clazz.unit.U2;

import java.io.InputStream;

public class ConstantMethodDRefInfo extends CpInfo<ConstantMethodDRefInfo.MethodRef> {

    private int classIndex;
    private int nameAndTypeIndex;

    public int getClassIndex() {
        return classIndex;
    }

    public int getNameAndTypeIndex() {
        return nameAndTypeIndex;
    }

    public ConstantClassInfo getClassInfo(){ return this.getValue().getClassInfo(); }
    public ConstantNameAndTypeInfo getNameAndTypeInfo() { return this.getValue().getNameAndTypeInfo(); }

    public ConstantMethodDRefInfo(Clazz clazz, int index) {
        super(clazz, index);
    }

    @Override
    protected void lazyValue() {
        ConstantClassInfo constantClassInfo = (ConstantClassInfo)this.belongClazz().getConstantPoolInfo().get(classIndex);
        ConstantNameAndTypeInfo constantNameAndTypeInfo = (ConstantNameAndTypeInfo)this.belongClazz().getConstantPoolInfo().get(nameAndTypeIndex);
        value = new MethodRef(constantClassInfo, constantNameAndTypeInfo);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        this.classIndex = U2.read(inputStream);
        this.nameAndTypeIndex = U2.read(inputStream);
        this.belongClazz().appendConstantPoolInfo(this);
    }

    @Override
    public String toString() {
        return this.getByteCodeName() + "  #"+this.classIndex + "  #"+this.nameAndTypeIndex + "// "+ getValue().getClassInfo().getValue() + ":" + getValue().getNameAndTypeInfo().getValue().getName();
    }

    @Override
    public String getByteCodeName() {
        return "Methodref";
    }

    protected class MethodRef {
        private final ConstantClassInfo classInfo;
        private final ConstantNameAndTypeInfo nameAndTypeInfo;

        public MethodRef(ConstantClassInfo classInfo, ConstantNameAndTypeInfo nameAndTypeInfo) {
            this.classInfo = classInfo;
            this.nameAndTypeInfo = nameAndTypeInfo;
        }

        public ConstantClassInfo getClassInfo() {
            return classInfo;
        }

        public ConstantNameAndTypeInfo getNameAndTypeInfo() {
            return nameAndTypeInfo;
        }
    }
}
