package jvm.parser.clazz.attributes.attribute.info.module.uses;

import jvm.parser.clazz.attributes.attribute.info.module.Export;
import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class UsesToIndex extends ByteCode<LinkedList<Export>> {
    public final static String NAME = "uses_to_index";

    public UsesToIndex(LinkedList<Export> value) {
        super(value);
    }
}