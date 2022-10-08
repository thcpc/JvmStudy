package jvm.parser.clazz.attributes.attribute.info.module.opens;

import jvm.parser.clazz.attributes.attribute.info.module.Export;
import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class OpensToIndex extends ByteCode<LinkedList<Export>> {
    public final static String NAME = "opens_to_index";

    public OpensToIndex(LinkedList<Export> value) {
        super(value);
    }
}