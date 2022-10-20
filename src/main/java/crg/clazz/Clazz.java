package crg.clazz;

import crg.clazz.classfile.MagicNumber;
import crg.clazz.classfile.constant.pool.*;

import crg.support.ByteCode;

import java.util.LinkedList;

public class Clazz {

    private Long magic;
    private String jdkVersion;
    private Integer constantPoolCount;

    private final LinkedList<ConstantIntegerInfo> constantIntegerInfos = new LinkedList<>();

    private final LinkedList<ConstantClassInfo> constantClassInfos  = new LinkedList<>();
    private final LinkedList<ConstantFloatInfo> constantFloatInfos  = new LinkedList<>();
    private final LinkedList<ConstantInvokeDynamicInfo> constantInvokeDynamicInfos = new LinkedList<>();
    private final LinkedList<ConstantMethodHandleInfo> constantMethodHandleInfos = new LinkedList<>();
    private final LinkedList<ConstantStringInfo> constantStringInfos = new LinkedList<>();
    private final LinkedList<ConstantDoubleInfo> constantDoubleInfos = new LinkedList<>();

    private final LinkedList<ConstantLongInfo> constantLongInfos = new LinkedList<>();
    private final LinkedList<ConstantMethodTypeInfo> constantMethodTypeInfos = new LinkedList<>();
    private final LinkedList<ConstantUtf8Info> constantUtf8Infos = new LinkedList<>();
    private final LinkedList<ConstantFieldDefInfo> constantFieldDefInfos = new LinkedList<>();
    private final LinkedList<ConstantInterfaceMethodDefInfo> constantInterfaceMethodDefInfos = new LinkedList<>();
    private final LinkedList<ConstantMethodDefInfo> constantMethodDefInfos = new LinkedList<>();
    private final LinkedList<ConstantNameAndTypeInfo> constantNameAndTypeInfos = new LinkedList<>();




    public LinkedList<ConstantIntegerInfo> getConstantIntegerInfos() {
        return constantIntegerInfos;
    }

    public LinkedList<ConstantClassInfo> getConstantClassInfos() {
        return constantClassInfos;
    }

    public LinkedList<ConstantFloatInfo> getConstantFloatInfos() {
        return constantFloatInfos;
    }

    public LinkedList<ConstantInvokeDynamicInfo> getConstantInvokeDynamicInfos() {
        return constantInvokeDynamicInfos;
    }

    public LinkedList<ConstantMethodHandleInfo> getConstantMethodHandleInfos() {
        return constantMethodHandleInfos;
    }

    public LinkedList<ConstantStringInfo> getConstantStringInfos() {
        return constantStringInfos;
    }

    public LinkedList<ConstantDoubleInfo> getConstantDoubleInfos() {
        return constantDoubleInfos;
    }

    public LinkedList<ConstantLongInfo> getConstantLongInfos() {
        return constantLongInfos;
    }

    public LinkedList<ConstantMethodTypeInfo> getConstantMethodTypeInfos() {
        return constantMethodTypeInfos;
    }

    public LinkedList<ConstantUtf8Info> getConstantUtf8Infos() {
        return constantUtf8Infos;
    }

    public LinkedList<ConstantFieldDefInfo> getConstantFieldDefInfos() {
        return constantFieldDefInfos;
    }

    public LinkedList<ConstantInterfaceMethodDefInfo> getConstantInterfaceMethodDefInfos() {
        return constantInterfaceMethodDefInfos;
    }

    public LinkedList<ConstantMethodDefInfo> getConstantMethodDefInfos() {
        return constantMethodDefInfos;
    }

    public LinkedList<ConstantNameAndTypeInfo> getConstantNameAndTypeInfos() {
        return constantNameAndTypeInfos;
    }

    public void appendConstantIntegerInfo(ConstantIntegerInfo e){ this.constantIntegerInfos.add(e); }


    public void appendConstantClassInfo(ConstantClassInfo e) { this.constantClassInfos.add(e);}
    public void appendConstantFloatInfo(ConstantFloatInfo e){this.constantFloatInfos.add(e);}
    public void appendConstantInvokeDynamicInfo(ConstantInvokeDynamicInfo e){this.constantInvokeDynamicInfos.add(e);}
    public void appendConstantMethodHandleInfo(ConstantMethodHandleInfo e){this.constantMethodHandleInfos.add(e);}
    public void appendConstantStringInfo(ConstantStringInfo e){this.constantStringInfos.add(e);}
    public void appendConstantDoubleInfo(ConstantDoubleInfo e){this.constantDoubleInfos.add(e);}
    public void appendConstantLongInfo(ConstantLongInfo e){this.constantLongInfos.add(e);}
    public void appendConstantMethodTypeInfo(ConstantMethodTypeInfo e){this.constantMethodTypeInfos.add(e);}
    public void appendConstantUtf8Info(ConstantUtf8Info e){this.constantUtf8Infos.add(e);}
    public void appendConstantFieldDefInfo(ConstantFieldDefInfo e){this.constantFieldDefInfos.add(e);}
    public void appendConstantInterfaceMethodDefInfo(ConstantInterfaceMethodDefInfo e){this.constantInterfaceMethodDefInfos.add(e);}
    public void appendConstantMethodDefInfo(ConstantMethodDefInfo e){this.constantMethodDefInfos.add(e);}
    public void appendConstantNameAndTypeInfo(ConstantNameAndTypeInfo e){this.constantNameAndTypeInfos.add(e);}






    public Integer getConstantPoolCount() {
        return constantPoolCount;
    }

    public void setConstantPoolCount(Integer constantPoolCount) {
        this.constantPoolCount = constantPoolCount;
    }

    public String getJdkVersion() {
        return jdkVersion;
    }

    public void setJdkVersion(String jdkVersion) {
        this.jdkVersion = jdkVersion;
    }

    public Long getMagic() { return magic; }

    public void setMagic(Long magic) { this.magic = magic; }

    public boolean isValid(){ return this.getMagic() == 3405691582L; }
}
