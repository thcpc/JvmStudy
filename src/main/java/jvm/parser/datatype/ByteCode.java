package jvm.parser.datatype;

public abstract class ByteCode<T> {
    private final T value;

    public ByteCode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
