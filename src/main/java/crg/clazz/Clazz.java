package crg.clazz;

import crg.clazz.classfile.constant.pool.*;
import crg.clazz.classfile.field.FieldInfo;


import java.util.LinkedList;

public class Clazz {

    private Long magic;
    private String jdkVersion;
    private Integer constantPoolCount;

    private Integer fieldCount;

    public Integer getFieldCount() {
        return fieldCount;
    }

    public void setFieldCount(Integer fieldCount) {
        this.fieldCount = fieldCount;
    }

    private Integer accessFlag;

    private String thisClass;

    private String superClass;

    private int interfaceCount;

    private LinkedList<String> interfaces = new LinkedList<>();

    public int getInterfaceCount() {
        return interfaceCount;
    }

    public void setInterfaceCount(int interfaceCount) {
        this.interfaceCount = interfaceCount;
    }

    public LinkedList<String> getInterfaces() {
        return interfaces;
    }

    public LinkedList<FieldInfo> getFieldInfos() {
        return fieldInfos;
    }

    public void appendFieldInfo(FieldInfo fieldInfo){
        this.fieldInfos.add(fieldInfo);
    }

    public void appendInterfaces(String interfaceString){
        this.getInterfaces().add(interfaceString);
    }

    public String getSuperClass() {
        return superClass;
    }

    public void setSuperClass(String superClass) {
        this.superClass = superClass;
    }

    public String getThisClass() {
        return thisClass;
    }

    public void setThisClass(String thisClass) {
        this.thisClass = thisClass;
    }

    public Integer getAccessFlag() {
        return accessFlag;
    }

    public void setAccessFlag(Integer accessFlag) {
        this.accessFlag = accessFlag;
    }

    private final LinkedList<ConstantIntegerInfo> constantIntegerInfos = new LinkedList<>();
    private final LinkedList<FieldInfo> fieldInfos = new LinkedList<>();

    private final LinkedList<ConstantClassInfo> constantClassInfos  = new LinkedList<>();
    private final LinkedList<ConstantFloatInfo> constantFloatInfos  = new LinkedList<>();
    private final LinkedList<ConstantInvokeDynamicInfo> constantInvokeDynamicInfos = new LinkedList<>();
    private final LinkedList<ConstantMethodHandleInfo> constantMethodHandleInfos = new LinkedList<>();
    private final LinkedList<ConstantStringInfo> constantStringInfos = new LinkedList<>();
    private final LinkedList<ConstantDoubleInfo> constantDoubleInfos = new LinkedList<>();

    private final LinkedList<ConstantLongInfo> constantLongInfos = new LinkedList<>();
    private final LinkedList<ConstantMethodTypeInfo> constantMethodTypeInfos = new LinkedList<>();
    private final LinkedList<ConstantUtf8Info> constantUtf8Infos = new LinkedList<>();
    private final LinkedList<ConstantFieldRefInfo> constantFieldDefInfos = new LinkedList<>();
    private final LinkedList<ConstantInterfaceMethodDRefInfo> constantInterfaceMethodDefInfos = new LinkedList<>();
    private final LinkedList<ConstantMethodDRefInfo> constantMethodDefInfos = new LinkedList<>();
    private final LinkedList<ConstantNameAndTypeInfo> constantNameAndTypeInfos = new LinkedList<>();

    private final LinkedList<CpInfo> constantPoolInfo = new LinkedList<>();


    public LinkedList<CpInfo> getConstantPoolInfo() {
        return constantPoolInfo;
    }

    public void appendConstantPoolInfo(CpInfo cpInfo){ this.constantPoolInfo.add(cpInfo) ;}

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

    public LinkedList<ConstantFieldRefInfo> getConstantFieldDefInfos() {
        return constantFieldDefInfos;
    }

    public LinkedList<ConstantInterfaceMethodDRefInfo> getConstantInterfaceMethodDefInfos() {
        return constantInterfaceMethodDefInfos;
    }

    public LinkedList<ConstantMethodDRefInfo> getConstantMethodDefInfos() {
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
    public void appendConstantFieldDefInfo(ConstantFieldRefInfo e){this.constantFieldDefInfos.add(e);}
    public void appendConstantInterfaceMethodDefInfo(ConstantInterfaceMethodDRefInfo e){this.constantInterfaceMethodDefInfos.add(e);}
    public void appendConstantMethodDefInfo(ConstantMethodDRefInfo e){this.constantMethodDefInfos.add(e);}
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

    public Clazz(){ constantPoolInfo.add(null);}
}
