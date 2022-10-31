package crg.clazz.classfile;
import crg.clazz.Clazz;

import crg.clazz.classfile.constant.pool.*;
import crg.clazz.classfile.constant.pool.CpInfo;
import crg.clazz.unit.U1;
import crg.support.ByteCode;



import java.io.InputStream;

public class ConstantPool extends ByteCode {

    private final Class<CpInfo>[] cpInfos;
    public ConstantPool(Clazz clazz) {
        super(clazz);
        this.cpInfos = new Class[]{
                                null,//0
                 ConstantUtf8Info.class,//1
                null,//2
                 ConstantIntegerInfo.class,//3
                 ConstantFloatInfo.class,//4
                 ConstantLongInfo.class,//5
                 ConstantDoubleInfo.class, //6
                 ConstantClassInfo.class,//7
                 ConstantStringInfo.class,//8
                 ConstantFieldRefInfo.class,//9
                 ConstantMethodDRefInfo.class,//10
                 ConstantInterfaceMethodDRefInfo.class,//11
                 ConstantNameAndTypeInfo.class,//12
                null,//13
                null,//14
                 ConstantMethodHandleInfo.class,//15
                 ConstantMethodTypeInfo.class,//16
//                null,
                 ConstantDynamicInfo.class,//17  JDK 11
                 ConstantInvokeDynamicInfo.class,//18
        };
//        this.cpInfos = new CpInfo[]{
//                null,//0
//                new ConstantUtf8Info(this.belongClazz()),//1
//                null,//2
//                new ConstantIntegerInfo(this.belongClazz()),//3
//                new ConstantFloatInfo(this.belongClazz()),//4
//                new ConstantLongInfo(this.belongClazz()),//5
//                new ConstantDoubleInfo(this.belongClazz()), //6
//                new ConstantClassInfo(this.belongClazz()),//7
//                new ConstantStringInfo(this.belongClazz()),//8
//                new ConstantFieldRefInfo(this.belongClazz()),//9
//                new ConstantMethodDRefInfo(this.belongClazz()),//10
//                new ConstantInterfaceMethodDRefInfo(this.belongClazz()),//11
//                new ConstantNameAndTypeInfo(this.belongClazz()),//12
//                null,//13
//                null,//14
//                new ConstantMethodHandleInfo(this.belongClazz()),//15
//                new ConstantMethodTypeInfo(this.belongClazz()),//16
//                null,//17
//                new ConstantInvokeDynamicInfo(this.belongClazz()),//18
//
//
//        };
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
//        int realCount = 1;
        for(int i = 1;i< belongClazz().getConstantPoolCount();i++){
            short tag = U1.read(inputStream);

            if(this.cpInfos[tag] == null) throw new Exception("UnKnown Constant Info:" + tag);
            this.cpInfos[tag].getConstructor(Clazz.class,int.class).newInstance(belongClazz(),i).read(inputStream);
            if(tag == 5 || tag == 6){ i+=1;}
//            else realCount+=1;

        }


    }

    @Override
    public String getName() {
        return "ConstantPool";
    }
}
