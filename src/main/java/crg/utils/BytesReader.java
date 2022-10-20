package crg.utils;

import java.io.IOException;
import java.io.InputStream;

public class BytesReader {

    public static byte[] bytesLoad(InputStream inputStream, byte[] bytes){
        try {
            inputStream.read(bytes);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        return bytes;
    }

    public static short byteToShort(InputStream inputStream){
        byte[] bytes = bytesLoad(inputStream,new byte[1]);
        short num = 0;
        for (byte elem : bytes) {
            num <<= 8;
            num |= (elem & 0xff);
        }
        return num;
    }

    public static int byteToInt(InputStream inputStream){
        byte[] bytes = bytesLoad(inputStream,new byte[2]);
        int num = 0;
        for (byte elem : bytes) {
            num <<= 8;
            num |= (elem & 0xff);
        }
        return num;
    }

    public static long byteToLong(InputStream inputStream){
        byte[] bytes = bytesLoad(inputStream,new byte[4]);
        long num = 0;
        for (byte elem : bytes) {
            num <<= 8;
            num |= (elem & 0xff);
        }
        return num;
    }



}
