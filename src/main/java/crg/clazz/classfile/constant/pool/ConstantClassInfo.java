package crg.clazz.classfile.constant.pool;



import crg.clazz.Clazz;
import crg.clazz.unit.U2;

import java.io.InputStream;

public class ConstantClassInfo extends CpInfo<String> {

    private int name_index;

    public ConstantClassInfo(Clazz clazz,int index) {
        super(clazz,index );
    }

    @Override
    protected void lazyValue() {
        this.value = (String) belongClazz().getConstantPoolInfo().get(name_index).getValue();
    }

    @Override
    public void read(InputStream inputStream) throws Exception {
        name_index = U2.read(inputStream);
//        this.belongClazz().appendConstantClassInfo(this);
        this.belongClazz().appendConstantPoolInfo(this);
    }

    public int getNameIndex() {return this.name_index; }

    public String getClassName() { return this.getValue();}


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(this.getIndex());
        sb.append("=");
        sb.append(this.getByteCodeName());
        sb.append("   ");
        sb.append("#");
        sb.append(this.getNameIndex());
        sb.append("    ");
        sb.append(this.getValue());
        return sb.toString();
    }

    @Override
    public String getByteCodeName() {
        return "Class";
    }
}
