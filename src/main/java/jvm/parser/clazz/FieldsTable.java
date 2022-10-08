package jvm.parser.clazz;

import jvm.parser.clazz.fields.Fields;
import jvm.parser.clazz.fields.FieldsCount;
import jvm.parser.datatype.ByteCode;

import java.util.Map;

public class FieldsTable extends ByteCode<Map<String,ByteCode>> {
    public static final String NAME = "Fields";
    public final static String FIELDS_COUNT = FieldsCount.NAME;
    public final static String FIELDS = Fields.NAME;

    public FieldsTable(Map<String,ByteCode> value) {
        super(value);
    }
}
