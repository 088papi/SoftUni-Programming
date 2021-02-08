package Task4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Box<T> {

    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void addElement(T value){
        this.values.add(value);
    }

    public void swap(int index1, int index2){
        Collections.swap(this.values,index1, index2);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(String.format("%s: %s", value.getClass().getName(), value.toString()));
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}