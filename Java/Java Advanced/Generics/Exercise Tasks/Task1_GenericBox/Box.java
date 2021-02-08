package Task2;

public class Box<T> {

    private T value;

    public Box(T value) {
        this.value = (T) value;
    }

    @Override
    public String toString(){
        return value.getClass().toString().substring(6) + ": " + value;
    }
}
