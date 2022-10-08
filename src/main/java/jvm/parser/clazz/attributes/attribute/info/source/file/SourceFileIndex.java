package jvm.parser.clazz.attributes.attribute.info.source.file;

import jvm.parser.datatype.ByteCode;

public class SourceFileIndex extends ByteCode<Integer> {
    public final static String NAME = "sourcefile_index";

    public SourceFileIndex(Integer value) {
        super(value);
    }
}