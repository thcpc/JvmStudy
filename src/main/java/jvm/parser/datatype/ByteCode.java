package jvm.parser.datatype;

public abstract class ByteCode<T> {
    private T value;

    public ByteCode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) { this.value = value;}
}
