package Task6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Box<T extends Comparable<T>> {

    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void addElement(T value){
        this.values.add(value);
    }

    public long countGreater(T toCompare){
        return this.values.stream().filter(e -> e.compareTo(toCompare) > 0).count();
    }

}