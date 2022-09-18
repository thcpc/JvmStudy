public class ConstantPoolTest implements Runnable {
    public final int i = 68;
    public int j = 50;
    public final double aDouble = 888;
    public final long aLong = 9999L;
    public final String aString = "XXXX";
    public final float aFloat = 123;

    public final void a(){}

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
