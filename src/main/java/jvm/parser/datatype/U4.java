package jvm.parser.datatype;

import java.io.InputStream;

public interface U4 {
     default long readU4(InputStream inputStream) {return BytesReader.four(inputStream);}
}
