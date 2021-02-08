package Task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> values;

    public void add(T value) {
        this.values.add(value);
    }

    public void remove(int index) {
        this.values.remove(index);
    }

    public boolean contains(T element) {
        if (this.values.contains(element)) {
            return true;
        }
        return false;
    }

    public CustomList() {
        this.values = new ArrayList<>();
    }

    public long countGreater(T toCompare) {
        return this.values.stream().filter(e -> e.compareTo(toCompare) > 0).count();
    }

    public T getMax() {
        T maxElement = this.values.get(0);
        for (T value : values) {
            if (value.compareTo(maxElement) > 0) {
                maxElement = value;
            }
        }
        return maxElement;
    }

    public T getMin() {
        T minElement = this.values.get(0);
        for (T value : values) {
            if (value.compareTo(minElement) < 0) {
                minElement = value;
            }
        }
        return minElement;
    }


    public String print() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T value : this.values) {
            stringBuilder.append(value.toString())
                    .append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }

    public void swap(int index1, int index2) {
        Collections.swap(this.values, index1, index2);
    }

}
