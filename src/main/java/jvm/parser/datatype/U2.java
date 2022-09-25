package jvm.parser.datatype;

import java.io.InputStream;

public interface U2 {
     default int readU2(InputStream inputStream) { return BytesReader.two(inputStream); }
}
