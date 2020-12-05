import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
//100/100
public class Task4_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Double> products = new LinkedHashMap<>();
        Map<String, Integer> products2 = new LinkedHashMap<>();


        while (true) {
            String input = scanner.nextLine();

            if (input.equals("buy")) {
                break;
            }


            String[] data = input.split("\\s+");
            String product = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            if (!products.containsKey(product)) {
                products.put(product, quantity*price);
                products2.put(product,quantity);
            } else {
                products2.put(product, products2.get(product) + quantity);
                products.put(product, products2.get(product) * price);
            }



        }

        products.forEach((key, value) ->
                System.out.println(String.format("%s -> %.2f", key,value)));
    }
}
