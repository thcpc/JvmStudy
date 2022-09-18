package jvm.parser.clazz.file;

import jvm.parser.constant.pools.ConstantInfo;

public class Clazz {
    private MagicNumber magicNumber;
    private MinorVersion minorVersion;
    private MajorVersion majorVersion;
    private ConstantPoolCount constantPoolCount;

    private ConstantPool constantPool;

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
