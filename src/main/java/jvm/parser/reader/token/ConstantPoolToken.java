package jvm.parser.reader.token;

import jvm.parser.clazz.file.ConstantPool;
import jvm.parser.constant.pools.ConstantInfo;
import jvm.parser.constant.pools.ConstantInterfaceMethodDefInfo;
import jvm.parser.constant.pools.ConstantInvokeDynamicInfo;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U4;
import jvm.parser.reader.ClazzLoader;
import jvm.parser.reader.ConstantToken;
import jvm.parser.reader.Token;

import java.io.InputStream;

public class ConstantPoolToken implements U4, Token {

    private final Class[] constantTokenClasses;

    public ConstantPoolToken() {
        this.constantTokenClasses = new Class[]{
                null,//0
                ConstantUtf8Token.class,//1
                null,//2
                ConstantIntegerInfoToken.class,//3
                ConstantFloatToken.class,//4
                ConstantLongToken.class,//5
                ConstantDoubleToken.class, //6
                ConstantClassToken.class,//7
                ConstantStringInfoToken.class,//8
                ConstantFieldDefToken.class,//9
                ConstantMethodDefToken.class,//10
                ConstantInterfaceMethodDefInfoToken.class,//11
                ConstantNameAndTyeToken.class,//12
                null,//13
                null,//14
                ConstantMethodHandleInfoToken.class,//15
                ConstantMethodTypeInfoToken.class,//16
                null,//17
                ConstantInvokeDynamicInfoToken.class,//18


                };
    }

    private short readTag(ClazzLoader visitor, InputStream inputStream){
        ConstantInfoTagToken constantInfoTagToken = new ConstantInfoTagToken();
        constantInfoTagToken.accept(visitor,inputStream);
        return constantInfoTagToken.getTag();
    }

    private ConstantInfo readCPInfo(int tag, ClazzLoader visitor, InputStream inputStream){
        ConstantToken constantToken = null;
        try {
            constantToken = (ConstantToken) constantTokenClasses[tag].newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        constantToken.accept(visitor,inputStream);
        return constantToken.getConstantInfo();
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        ConstantInfo[] constantInfoArray = new ConstantInfo[visitor.getClazz().getConstantPoolCount()];
        for(int i = 1; i<visitor.getClazz().getConstantPoolCount(); i++){
            int tag = this.readTag(visitor,inputStream);
            constantInfoArray[i] = readCPInfo(tag,visitor,inputStream);
            if(constantInfoArray[i].getTag() == 5 || constantInfoArray[i].getTag() == 6){ i+=1;}
        }
        visitor.getClazz().setConstantPool(new ConstantPool(constantInfoArray));
    }


    @Override
    public long read(InputStream inputStream) {
        return U.four(inputStream);
    }
}
