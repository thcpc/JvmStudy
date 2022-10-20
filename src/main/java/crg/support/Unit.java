package crg.support;

import java.io.InputStream;

public abstract class Unit<T> {
    public abstract T read(InputStream inputStream);
}
