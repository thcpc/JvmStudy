import jdk.nashorn.internal.runtime.options.Option;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

public class ConstantPoolTest implements Runnable {
    public final int i = 68;
    public int j = 50;
    public final double aDouble = 888;
    public final long aLong = 9999L;
    public final String aString = "XXXX";
    public final float aFloat = 123;

    public final void a(){
        int x = 1 + 2;
        int y = 2;
        int z = y + x;
        this.b();
    }

    public void b(){
        String zz = "xxx";
        testLambda();
    }

    public void testLambda(){
        Integer[] integers = new Integer[]{1,2,3,4,5,6};
        Optional<Integer> i = Arrays.stream(integers).findAny().flatMap(new Function<Integer, Optional<Integer>>() {
            @Override
            public Optional<Integer> apply(Integer integer) {
                return Optional.empty();
            }
        });
    }

    public void run(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                a();
            }
        };
        r.run();
    }
}
