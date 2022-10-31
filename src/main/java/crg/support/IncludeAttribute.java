package crg.support;

import crg.clazz.classfile.attribute.AttributeInfo;

import java.util.LinkedList;

public interface IncludeAttribute {
    int getAttributeCount();
    void setAttributeCount(int count);
    void appendAttribute(AttributeInfo attributeInfo);
    LinkedList<AttributeInfo> getAttributes();
}
