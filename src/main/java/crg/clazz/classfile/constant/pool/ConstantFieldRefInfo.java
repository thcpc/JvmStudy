package crg.clazz.classfile.constant.pool;

import crg.clazz.Clazz;
import crg.clazz.unit.U2;

import java.io.InputStream;

public class ConstantFieldRefInfo extends CpInfo<ConstantFieldRefInfo.FieldRef> {

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

    public ConstantFieldRefInfo(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        this.classIndex = U2.read(inputStream);
        this.nameAndTypeIndex = U2.read(inputStream);

        ConstantClassInfo constantClassInfo = this.belongClazz().getConstantClassInfos().get(classIndex);
        ConstantNameAndTypeInfo constantNameAndTypeInfo = this.belongClazz().getConstantNameAndTypeInfos().get(nameAndTypeIndex);
        value = new FieldRef(constantClassInfo, constantNameAndTypeInfo);
        this.belongClazz().appendConstantFieldDefInfo(this);

    }

    @Override
    public String getName() {
        return "CONSTANT_Fieldref_Info";
    }

    protected class FieldRef{
        private final ConstantClassInfo classInfo;
        private final ConstantNameAndTypeInfo nameAndTypeInfo;

        public FieldRef(ConstantClassInfo classInfo, ConstantNameAndTypeInfo nameAndTypeInfo) {
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
