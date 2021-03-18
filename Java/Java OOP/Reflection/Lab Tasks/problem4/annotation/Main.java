package annotation;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Class<MyMethods> clazz = MyMethods.class;

        Method[] declaredMethods = clazz.getDeclaredMethods();

        Map<String, Method> methodsByAuthors = new TreeMap<>();
        for (Method declaredMethod : declaredMethods) {
            Author subject = declaredMethod.getAnnotation(Author.class);


            if (subject != null) {
                methodsByAuthors.put(subject.author(), declaredMethod);
            }
        }

        for (Map.Entry<String, Method> entry : methodsByAuthors.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().getName());
        }
    }
}
