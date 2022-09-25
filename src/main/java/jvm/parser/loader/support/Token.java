package jvm.parser.loader.support;

import java.io.InputStream;

public interface Token<Visitor> {
    void accept(Visitor visitor, InputStream inputStream);
}
