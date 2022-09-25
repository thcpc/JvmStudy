package jvm.parser.datatype;

import java.io.InputStream;

public interface U1 {
    default short readU1(InputStream inputStream) { return BytesReader.one(inputStream); }
}
