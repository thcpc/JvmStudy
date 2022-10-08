package jvm.parser.clazz.attributes.attribute.info.module.exports;

import jvm.parser.clazz.attributes.attribute.info.module.Export;
import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class ExportsToIndex extends ByteCode<LinkedList<Export>> {
    public final static String NAME = "exports_to_index";

    public ExportsToIndex(LinkedList<Export> value) {
        super(value);
    }
}