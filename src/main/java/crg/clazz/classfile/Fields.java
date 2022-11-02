package crg.clazz.classfile;

import crg.clazz.Clazz;
import crg.clazz.classfile.field.FieldInfo;
import crg.support.ByteCode;

import java.io.InputStream;

/***
 * TODO 目前只是把Field 的 Attribute 占位而已，之后再去解决具体的Attribute
 */
public class Fields extends ByteCode {
    public Fields(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        for(int i = 0;i<belongClazz().getFieldCount();i++){
            FieldInfo fieldInfo = new FieldInfo(belongClazz());
            fieldInfo.read(inputStream);
            belongClazz().appendFieldInfo(fieldInfo);
        }

    }

    @Override
    public String getByteCodeName() {
        return "field_info";
    }


}
