package jvm.parser.constant.pools;

import jvm.parser.datatype.ByteCode;

import java.io.IOException;
import java.io.InputStream;

public abstract class ConstantInfo<T>  extends ByteCode<T> {

    public ConstantInfo(T value) {super(value);}

    public abstract short getTag();

    public abstract String name();

}
