package crg.clazz.classfile;
import crg.clazz.Clazz;

import crg.clazz.classfile.constant.pool.*;
import crg.clazz.classfile.constant.pool.CpInfo;
import crg.clazz.unit.U1;
import crg.support.ByteCode;



import java.io.InputStream;

public class ConstantPool extends ByteCode {

    private final CpInfo[] cpInfos;
    public ConstantPool(Clazz clazz) {
        super(clazz);
        this.cpInfos = new CpInfo[]{
                null,//0
                new ConstantUtf8Info(this.belongClazz()),//1
                null,//2
                new ConstantIntegerInfo(this.belongClazz()),//3
                new ConstantFloatInfo(this.belongClazz()),//4
                new ConstantLongInfo(this.belongClazz()),//5
                new ConstantDoubleInfo(this.belongClazz()), //6
                new ConstantClassInfo(this.belongClazz()),//7
                new ConstantStringInfo(this.belongClazz()),//8
                new ConstantFieldDefInfo(this.belongClazz()),//9
                new ConstantMethodDefInfo(this.belongClazz()),//10
                new ConstantInterfaceMethodDefInfo(this.belongClazz()),//11
                new ConstantNameAndTypeInfo(this.belongClazz()),//12
                null,//13
                null,//14
                new ConstantMethodHandleInfo(this.belongClazz()),//15
                new ConstantMethodTypeInfo(this.belongClazz()),//16
                null,//17
                new ConstantInvokeDynamicInfo(this.belongClazz()),//18


        };
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        for(int i = 0;i< belongClazz().getConstantPoolCount();i++){
            int tag = U1.read(inputStream);
            this.cpInfos[tag].read(inputStream);

        }

    }

    @Override
    public String getName() {
        return "ConstantPool";
    }
}
