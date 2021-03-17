import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
            for (Method getter : getters) {

                System.out.println(getter.getName() + " will return class "  + getter.getReturnType().getName());
            }

            for (Method setter : setters) {
                System.out.println(setter.getName() + " and will set field of class " + setter.getParameterTypes()[0].getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
