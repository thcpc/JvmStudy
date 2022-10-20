package crg.clazz.unit;

import crg.support.Unit;
import crg.utils.BytesReader;

import java.io.InputStream;

public class U2 {

    public static Integer read(InputStream inputStream) {
        return BytesReader.byteToInt(inputStream);
    }
}
