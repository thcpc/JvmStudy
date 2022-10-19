package crg.clazz.classfile;


import crg.clazz.Clazz;
import crg.clazz.unit.U2;
import crg.support.ByteCode;

import java.io.InputStream;

public class MajorVersion extends ByteCode {
    private final static int latestCode = 62;
    private final static int latestJDKVersion = 18;

    public MajorVersion(Clazz clazz) {
        super(clazz);
    }


    private String jdk(int version) throws Exception {
        if(version == 48) { return "JDK 1.4" ;}
        if(version == 47) { return "JDK 1.3" ;}
        if(version == 46) { return "JDK 1.2" ;}
        if(version == latestCode) { return "JDK "+ latestJDKVersion;}
        if(version<latestCode) { return "JDK" + (latestJDKVersion-(latestCode-version));}
        throw new Exception("Unknown Java Version");
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        int version = U2.read(inputStream);
        this.belongClazz().setJdkVersion(this.jdk(version));
    }

    @Override
    public String getName() {
        return "MajorVersion";
    }
}
