package jvm.parser.loader.support;

import jvm.parser.clazz.constant.pools.ConstantInfo;
import jvm.parser.loader.ClazzLoader;

public interface ConstantToken extends Token<ClazzLoader> {
    ConstantInfo getConstantInfo();
}
