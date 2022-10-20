
import crg.clazz.Clazz;
import crg.clazz.ClazzLoader;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

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

    }
}
