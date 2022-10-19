package crg.clazz.unit;

import crg.support.Unit;
import crg.utils.BytesReader;

import java.io.InputStream;

public class U4{

    public static Long read(InputStream inputStream) {
        return BytesReader.byteToLong(inputStream);
    }


}
