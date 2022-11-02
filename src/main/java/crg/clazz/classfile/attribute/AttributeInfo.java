package crg.clazz.classfile.attribute;


import crg.clazz.Clazz;
import crg.clazz.unit.U1;
import crg.clazz.unit.U2;
import crg.clazz.unit.U4;
import crg.support.ByteCode;

import java.io.InputStream;
import java.util.LinkedList;

public class AttributeInfo extends ByteCode {

    private int attributeNameIndex;
    private long attributeLength;
    private LinkedList<Short> info = new LinkedList<>();

    public AttributeInfo(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        attributeNameIndex = U2.read(inputStream);
        attributeLength = U4.read(inputStream);
        for(long i = 0;i<attributeLength;i++){
            info.add(U1.read(inputStream));
        }
    }

    @Override
    public String getByteCodeName() {
        return "attribute_info";
    }
}
