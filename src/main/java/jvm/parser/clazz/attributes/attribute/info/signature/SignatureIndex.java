package jvm.parser.clazz.attributes.attribute.info.signature;

import jvm.parser.datatype.ByteCode;

public class SignatureIndex extends ByteCode<Integer> {
    public final static String NAME = "signature_index";

    public SignatureIndex(Integer value) {
        super(value);
    }
}