import jvm.parser.clazz.file.Clazz;
import jvm.parser.constant.pools.ConstantInfo;
import jvm.parser.reader.ClazzLoader;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Map;

public class ClassTest {


    public String getPath(){
        if(System.getProperty("os.name").equals("Mac OS X")) return "build/classes/java/main/ConstantPoolTest.class";
        return "build\\classes\\java\\main\\ConstantPoolTest.class";
    }

    @Test
    public void testClass() throws FileNotFoundException {

        ClazzLoader clazzLoader = new ClazzLoader(new File(this.getPath()));
        Clazz clazz =  clazzLoader.getClazz();
        assert clazz.isJavaCLass();
        assert clazz.jdk().equals("JDK8");
        System.out.println(clazz.getConstantPoolCount());
        System.out.println(clazz.getAccessFlags());
        System.out.println(clazz.getThisClazz());
        System.out.println(clazz.getSuperClazz());
        Arrays.stream(clazz.getInterfaces()).forEach(System.out::println);

    }

    @Test
    public void testClassConstantPool() throws FileNotFoundException {
        ClazzLoader clazzLoader = new ClazzLoader(new File(this.getPath()));
        Clazz clazz =  clazzLoader.getClazz();
        assert clazz.getConstantPoolCount() == 106;

        ConstantInfo[] constantPool = clazz.getConstantPool();
        assert constantPool.length == clazz.getConstantPoolCount();
        assert constantPool[1].name().equals("Methodref");
//        for(int i = 1;i < clazz.getConstantPoolCount();i++){
//            clazz.getConstantPool()
    }

    private int getKey(ConstantInfo constantInfo, String key){
        return ((Map<String,Integer>)constantInfo.getValue()).get(key);
    }
}
