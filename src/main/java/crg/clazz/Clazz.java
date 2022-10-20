package crg.clazz;

import crg.clazz.classfile.MagicNumber;
import crg.support.ByteCode;

import java.util.LinkedList;

public class Clazz {

    private Long magic;
    private String jdkVersion;

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
