package crg.clazz.classfile;

import crg.clazz.Clazz;
import crg.clazz.unit.U1;
import crg.clazz.unit.U4;
import crg.support.ByteCode;

import java.io.InputStream;


public class MagicNumber extends ByteCode {

    public MagicNumber(Clazz clazz) {
        super(clazz);
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        Long magic = U4.read(inputStream);
        if(magic!=3405691582L) throw new Exception("非法的Class文件");
        this.belongClazz().setMagic(magic);
    }

    @Override
    public String getName() {
        return "MagicNumber";
    }
}
