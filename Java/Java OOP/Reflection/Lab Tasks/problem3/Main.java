import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;


public class Main {

    public static class MethodComparator implements Comparator<Method>{


        @Override
        public int compare(Method f, Method s) {
            return f.getName().compareTo(s.getName());
        }
    }
    public static void main(String[] args) {

        Class<Reflection> reflection = Reflection.class;



        try {
           Method[] declaredMethods = reflection.getDeclaredMethods();
           Set<Method> getters = new TreeSet<>(new MethodComparator());
           Set<Method> setters = new TreeSet<>(new MethodComparator());

            for (Method declaredMethod : declaredMethods) {
                if (declaredMethod.getName().contains("get")){
                    getters.add(declaredMethod);
                } else if(declaredMethod.getName().contains("set")){
                    setters.add(declaredMethod);
                }
            }

            Arrays.stream(reflection.getDeclaredFields())
                    .filter(f->!Modifier.isPrivate(f.getModifiers()))
                    .sorted(Comparator.comparing(Field::getName))
                    .forEach(f -> System.out.println(f.getName() + " must be private!"));


            for (Method getter : getters) {
                if (!Modifier.isPublic(getter.getModifiers())){
                    System.out.println(getter.getName() + " have to be public!");
                }

            }

            for (Method setter : setters) {
                if (!Modifier.isPrivate(setter.getModifiers())) {
                    System.out.println(setter.getName() + " have to be private!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
