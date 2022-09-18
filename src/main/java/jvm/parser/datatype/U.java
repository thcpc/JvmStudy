package jvm.parser.datatype;

import java.io.IOException;
import java.io.InputStream;

public class U {


    public static short one(InputStream inputStream){
        byte[] bytes = new byte[1];
        try {
            inputStream.read(bytes);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }

        return offset(bytes,(short)0);
    }
    public static int two(InputStream inputStream){
        byte[] bytes = new byte[2];
        try {
            inputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return offset(bytes,(int)0);
    }

    public static long four(InputStream inputStream){
        byte[] bytes = new byte[4];
        try {
            inputStream.read(bytes);
        } catch (IOException e) {

            e.printStackTrace();

        }
        return offset(bytes, (long)0);
    }

     protected static short offset(byte[] bytes, short num) {
        for (byte aByte : bytes) {
            num <<= 8;
            num |= (aByte & 0xff);
        }
        return num;
    }

    protected static int offset(byte[] bytes, int num) {
        for (byte aByte : bytes) {
            num <<= 8;
            num |= (aByte & 0xff);
        }
        return num;
    }

    protected static long offset(byte[] bytes, long num) {
        for (byte aByte : bytes) {
            num <<= 8;
            num |= (aByte & 0xff);
        }
        return num;
    }
}
