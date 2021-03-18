package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);


        Constructor<BlackBoxInt> declaredConstructor = BlackBoxInt.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        BlackBoxInt blackBoxInt = declaredConstructor.newInstance();

        Method[] methods = blackBoxInt.getClass().getDeclaredMethods();
        Field innerValue = blackBoxInt.getClass().getDeclaredField("innerValue");
        innerValue.setAccessible(true);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] inputArr = input.split("_");
            String methodName = inputArr[0];
            int value = Integer.parseInt(inputArr[1]);

            Method method = Arrays.stream(blackBoxInt.getClass()
                    .getDeclaredMethods())
                    .filter(m -> m.getName().equals(methodName)).findFirst().get();
            method.setAccessible(true);
            method.invoke(blackBoxInt, value);
            System.out.println(innerValue.getInt(blackBoxInt));


            input = scanner.nextLine();
        }


    }
}
