package crg.clazz.classfile;

import crg.clazz.Clazz;
import crg.clazz.classfile.field.FieldInfo;
import crg.clazz.classfile.method.MethodInfo;
import crg.support.ByteCode;

import java.io.InputStream;

/***
 * TODO 目前只是把Method 的 Attribute 占位而已，之后再去解决具体的Attribute
 */
public class Methods extends ByteCode {
    public Methods(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        for(int i = 0;i<belongClazz().getMethodCount();i++){
            MethodInfo methodInfo = new MethodInfo(belongClazz());
            methodInfo.read(inputStream);
            belongClazz().appendMethodInfo(methodInfo);
        }

    }

    @Override
    public String getByteCodeName() {
        return "method_info";
    }


}
