
import crg.clazz.Clazz;
import crg.clazz.ClazzLoader;
import crg.clazz.classfile.constant.pool.CpInfo;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

public class ClassTest2 {
    public String getPath(){
        if(System.getProperty("os.name").equals("Mac OS X")) return "build/classes/java/main/ConstantPoolTest.class";
        return "build\\classes\\java\\main\\ConstantPoolTest.class";
    }

    @Test
    public void testClass() throws FileNotFoundException {

        ClazzLoader clazzLoader = new ClazzLoader(new File(this.getPath()));
        Clazz clazz =  clazzLoader.load();
        System.out.println(clazz.getMagic());
        System.out.println(clazz.getJdkVersion());

        System.out.println(clazz.getConstantPoolCount());
//        clazz.getConstantPoolInfo().get(0).getValue();
//        clazz.getConstantPoolInfo().stream().filter(Objects::nonNull).forEach(System.out::println);
//        System.out.println(clazz.getThisClass());
//        System.out.println(clazz.getSuperClass());
//        System.out.println(clazz.getInterfaceCount());
//        clazz.getInterfaces().forEach(System.out::println);
//        clazz.getFieldInfos().forEach(e->System.out.println(e.getName()+e.getDescriptor()));
        clazz.getMethodInfos().forEach(e->System.out.println(e.getName() + e.getDescriptor()));

    }
}
