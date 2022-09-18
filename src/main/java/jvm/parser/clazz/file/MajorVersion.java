package jvm.parser.clazz.file;

import jvm.parser.datatype.ByteCode;
import jvm.parser.datatype.U;
import jvm.parser.datatype.U1;
import jvm.parser.datatype.U2;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class MajorVersion extends ByteCode<Integer> {
    private final static int latestCode = 62;
    private final static int latestJDKVersion = 18;

    public MajorVersion(Integer value) {
        super(value);
    }

    public String jdk(){
        if(this.getValue() == 48) { return "JDK 1.4" ;}
        if(this.getValue() == 47) { return "JDK 1.3" ;}
        if(this.getValue() == 46) { return "JDK 1.2" ;}
        if(this.getValue() == latestCode) { return "JDK "+ latestJDKVersion;}
        if(this.getValue()<latestCode) { return "JDK" + (latestJDKVersion-(latestCode-getValue()));}
        return  "Unknown Java Version";
    }
}
