package jvm.parser.clazz.file;


import jvm.parser.datatype.ByteCode;

public class MagicNumber extends ByteCode<Long> {

    public MagicNumber(long value) {
        super(value);
    }

    public boolean is_class(){ return getValue() == 3405691582L; }
}
