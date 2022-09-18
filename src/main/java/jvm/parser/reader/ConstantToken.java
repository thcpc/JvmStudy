package jvm.parser.reader;

import jvm.parser.constant.pools.ConstantInfo;

public interface ConstantToken extends Token {
    ConstantInfo getConstantInfo();
}
