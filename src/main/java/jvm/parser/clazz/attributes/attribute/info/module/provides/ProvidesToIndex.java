package jvm.parser.clazz.attributes.attribute.info.module.provides;

import jvm.parser.clazz.attributes.attribute.info.module.Export;
import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class ProvidesToIndex extends ByteCode<LinkedList<Export>> {
    public final static String NAME = "provides_to_index";

    public ProvidesToIndex(LinkedList<Export> value) {
        super(value);
    }
}