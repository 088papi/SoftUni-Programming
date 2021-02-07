import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListUtils {


    public static <T extends Comparable<T>> T getMax(List<T> elements){
        checkIfEmpty(elements);
        return Collections.max(elements);
    }


    public static <T extends Comparable<T>> T getMin(List<T> elements){
        checkIfEmpty(elements);
        return Collections.min(elements);
    }



    private static <T extends Comparable<T>> void checkIfEmpty(List<T> elements) {
        if (elements.isEmpty()){
            throw new IllegalArgumentException();
        }
    }




}
