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
                null,//17
                 ConstantInvokeDynamicInfo.class,//18
        };

    }

    @Override
    public void read(InputStream inputStream) throws Exception {
//        int realCount = 1;
        for(int i = 1;i< belongClazz().getConstantPoolCount();i++){
            short tag = U1.read(inputStream);

            if(this.cpInfos[tag] == null) throw new Exception("UnKnown Constant Info:" + tag);
            this.cpInfos[tag].getConstructor(Clazz.class).newInstance(belongClazz()).read(inputStream);
            if(tag == 5 || tag == 6){ i+=1;}
//            else realCount+=1;

        }


    }

    @Override
    public String getName() {
        return "ConstantPool";
    }
}
