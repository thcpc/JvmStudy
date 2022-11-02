package crg.clazz.classfile.field;

import crg.clazz.Clazz;
import crg.clazz.classfile.attribute.AttributeInfo;
import crg.clazz.unit.U2;
import crg.support.ByteCode;
import crg.support.IncludeAttribute;

import java.io.InputStream;
import java.util.LinkedList;

public class FieldInfo extends ByteCode implements IncludeAttribute {

    private int accessFlags;
    private int nameIndex;
    private int descriptorIndex;
    private int attributeCount;
    private LinkedList<AttributeInfo> attributes = new LinkedList<>();
    public FieldInfo(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        accessFlags = U2.read(inputStream);
        nameIndex = U2.read(inputStream);
        descriptorIndex = U2.read(inputStream);
        attributeCount = U2.read(inputStream);
        for(int i = 0;i<attributeCount;i++){
            AttributeInfo attributeInfo = new AttributeInfo(this.belongClazz());
            attributeInfo.read(inputStream);
            this.attributes.add(attributeInfo);
        }
    }


    public String getName(){
        return (String) this.belongClazz().getConstantPoolInfo().get(nameIndex).getValue();
    }
    public String getDescriptor(){
        return (String) this.belongClazz().getConstantPoolInfo().get(descriptorIndex).getValue() ;
    }

    @Override
    public String getByteCodeName() {
        return null;
    }


    @Override
    public int getAttributeCount() {
        return this.attributeCount;
    }

    @Override
    public void setAttributeCount(int count) { }

    @Override
    public void appendAttribute(AttributeInfo attributeInfo) {

    }

    @Override
    public LinkedList<AttributeInfo> getAttributes() {
        return attributes;
    }
}
