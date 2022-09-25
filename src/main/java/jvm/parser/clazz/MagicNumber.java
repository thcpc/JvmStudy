package jvm.parser.clazz;


import jvm.parser.datatype.ByteCode;

public class MagicNumber extends ByteCode<Long> {

    public MagicNumber(long value) {
        super(value);
    }

    public boolean is_class(){ return getValue() == 3405691582L; }
}
