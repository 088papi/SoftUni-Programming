package Task10;

public class Tuple<K,V> {
    private K first;
    private V second;

    public Tuple(K first, V second) {
        this.first = first;
        this.second = second;
    }


    @Override
    public String toString(){
        return String.format("%s -> %s",this.first.toString(), this.second.toString());
    }
}
