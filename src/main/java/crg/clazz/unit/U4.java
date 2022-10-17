package crg.clazz.unit;

import crg.support.Unit;
import crg.utils.BytesReader;

import java.io.InputStream;

public class U4 extends Unit<Long> {

    @Override
    public Long read(InputStream inputStream) {
        return BytesReader.byteToLong(inputStream);
    }
}
