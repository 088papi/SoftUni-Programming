package Task9;

import java.util.Collections;

public class Sorter{
    public static  <T extends Comparable<T>> void sort(CustomList<T> values){

        for (int i = 0; i < values.size(); i++) {
            T currentEl = values.get(i);
            for (int j = i + 1; j < values.size() ; j++) {
                if (currentEl.compareTo(values.get(j)) > 0){
                    values.swap(i,j);
                }
            }
        }
    }

}
