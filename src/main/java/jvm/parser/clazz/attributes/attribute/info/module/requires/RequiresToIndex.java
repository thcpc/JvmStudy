package jvm.parser.clazz.attributes.attribute.info.module.requires;

import jvm.parser.clazz.attributes.attribute.info.module.Export;
import jvm.parser.datatype.ByteCode;

import java.util.LinkedList;

public class RequiresToIndex extends ByteCode<LinkedList<Export>> {
    public final static String NAME = "requires_to_index";

    public RequiresToIndex(LinkedList<Export> value) {
        super(value);
    }
}