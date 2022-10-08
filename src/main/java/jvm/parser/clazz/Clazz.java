package jvm.parser.clazz;

import jvm.parser.clazz.constant.pools.ConstantClassInfo;
import jvm.parser.clazz.constant.pools.ConstantInfo;
import jvm.parser.clazz.constant.pools.ConstantUtf8Info;

import java.util.Arrays;

public class Clazz {
    private MagicNumber magicNumber;
    private MinorVersion minorVersion;
    private MajorVersion majorVersion;
    private ConstantPoolCount constantPoolCount;

    private ConstantPool constantPool;

    private AccessFlags accessFlags;

    private ThisClazz thisClazz;

    public ConstantInfo[] getConstantPool() {
        return constantPool.getValue();
    }

    public void setConstantPool(ConstantPool constantPool) {
        this.constantPool = constantPool;
    }

    public int getConstantPoolCount() {
        return constantPoolCount.getValue();
    }

    public void setConstantPoolCount(ConstantPoolCount constantPoolCount) {
        this.constantPoolCount = constantPoolCount;
    }

    public void setAccessFlags(AccessFlags accessFlags) {
        this.accessFlags = accessFlags;
    }

    public long getAccessFlags(){ return this.accessFlags.getValue();}

    public void setThisClazz(ThisClazz thisClazz){ this.thisClazz = thisClazz; }

    private Interfaces interfaces;




    public String[] getInterfaces() {
        return Arrays.stream(interfaces.getValue())
                .map(class_index -> ((ConstantClassInfo)this.getConstantPool()[class_index]).getValue().get(ConstantClassInfo.NameIndex))
                .map(utf_index->(String)this.getConstantPool()[utf_index].getValue()).toArray(String[]::new);
    }

    public void setInterfaces(Interfaces interfaces) {
        this.interfaces = interfaces;
    }

    private SuperClazz superClazz;

    public String getSuperClazz() {
        int class_index = this.superClazz.getValue();
        final ConstantClassInfo constantClassInfo = (ConstantClassInfo)this.getConstantPool()[class_index];
        int utf_index = constantClassInfo.getValue().get(ConstantClassInfo.NameIndex);
        final ConstantUtf8Info constantUtf8Info = (ConstantUtf8Info) this.getConstantPool()[utf_index];
        return constantUtf8Info.getValue();
    }

    public void setSuperClazz(SuperClazz superClazz) {
        this.superClazz = superClazz;
    }

    public String getThisClazz(){
        int class_index = this.thisClazz.getValue();
        final ConstantClassInfo constantClassInfo = (ConstantClassInfo)this.getConstantPool()[class_index];
        int utf_index = constantClassInfo.getValue().get(ConstantClassInfo.NameIndex);
        final ConstantUtf8Info constantUtf8Info = (ConstantUtf8Info) this.getConstantPool()[utf_index];
        return constantUtf8Info.getValue();
    }

    private FieldsTable fieldsTable;

    public void setFieldTable(FieldsTable fieldsTable){ this.fieldsTable = fieldsTable; }

    public FieldsTable getFields(){ return fieldsTable; }

    public int fieldCount(){
        return (int) fieldsTable.getValue().get(FieldsTable.FIELDS_COUNT).getValue();
    }


    public Clazz(){}

    public MagicNumber getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(MagicNumber magicNumber) {
        this.magicNumber = magicNumber;
    }

    public MajorVersion getMajorVersion() {
        return majorVersion;
    }

    public void setMinorVersion(MinorVersion minorVersion)  { this.minorVersion = minorVersion;}

    public void setMajorVersion(MajorVersion majorVersion) { this.majorVersion = majorVersion; }

    public boolean isJavaCLass(){ return getMagicNumber().is_class();}

    public String jdk() {return getMajorVersion().jdk();}
}
