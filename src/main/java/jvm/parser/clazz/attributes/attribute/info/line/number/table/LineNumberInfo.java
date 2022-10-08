package jvm.parser.clazz.attributes.attribute.info.line.number.table;

import jvm.parser.clazz.attributes.attribute.info.common.StartPc;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class LineNumberInfo extends ByteCode<Map<String, ByteCode>> {

    public final static String START_PC = StartPc.NAME;

    public final static String LINE_NUMBER = LineNumber.Name;

    public LineNumberInfo(Map<String, ByteCode> value) {
        super(value);
    }
}