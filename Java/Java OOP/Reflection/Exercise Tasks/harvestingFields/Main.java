package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Field[] declaredFields = RichSoilLand.class.getDeclaredFields();

        String input = scanner.nextLine();

        while (!input.equals("HARVEST")) {

            String modifier = input;

          Field[] fields = Arrays.stream(declaredFields)
                    .filter(method -> Modifier
                            .toString(method.getModifiers())
                            .equals(modifier))
                    .toArray(Field[]::new);

          if (fields.length == 0){
              printFields(declaredFields);
          } else {
              printFields(fields);
          }
            input = scanner.nextLine();
        }
    }

    private static void printFields(Field[] fields) {
        Arrays.stream(fields).forEach(f -> System.out.printf("%s %s %s%n",
                Modifier.toString(f.getModifiers()),
                f.getType().getSimpleName(), f.getName()));
    }
}
