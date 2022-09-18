import jvm.parser.clazz.file.Clazz;
import jvm.parser.constant.pools.ConstantInfo;
import jvm.parser.reader.ClazzLoader;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class ClassTest {

    @Test
    public void testClass() throws FileNotFoundException {
        ClazzLoader clazzLoader = new ClazzLoader(new File("/Users/chenpengcheng/GitHub/JVMStudy/build/classes/java/main/ConstantPoolInteger.class"));
        Clazz clazz =  clazzLoader.getClazz();
        assert clazz.isJavaCLass();
        assert clazz.jdk().equals("JDK8");
        System.out.println(clazz.getConstantPoolCount());
    }

    @Test
    public void testClassConstantPool() throws FileNotFoundException {
        ClazzLoader clazzLoader = new ClazzLoader(new File("/Users/chenpengcheng/GitHub/JVMStudy/build/classes/java/main/ConstantPoolTest.class"));
        Clazz clazz =  clazzLoader.getClazz();
        assert clazz.getConstantPoolCount() == 62;

        ConstantInfo[] constantPool = clazz.getConstantPool();
        assert constantPool.length == clazz.getConstantPoolCount();
//        for(int i = 1;i < clazz.getConstantPoolCount();i++){
//            clazz.getConstantPool()
//        }
    }
}
