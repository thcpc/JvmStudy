package jvm.parser.reader;

import java.io.InputStream;

public interface Token {
    void accept(ClazzLoader visitor, InputStream inputStream);
}
