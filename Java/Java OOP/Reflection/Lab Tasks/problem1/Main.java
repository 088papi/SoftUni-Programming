import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> reflection = Reflection.class;

        System.out.println(reflection);
        Class<?> superClass = reflection.getSuperclass();
        System.out.println(superClass);

        Class[] interfaces = reflection.getInterfaces();

        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Object reflectionObject = null;
        try {
            reflectionObject = reflection.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println(reflectionObject);
    }
}
