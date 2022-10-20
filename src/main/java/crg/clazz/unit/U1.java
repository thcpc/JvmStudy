package crg.clazz.unit;

import crg.support.Unit;
import crg.utils.BytesReader;

import java.io.InputStream;

public class U1{

    public static Short read(InputStream inputStream) {
        return BytesReader.byteToShort(inputStream);
    }
}
