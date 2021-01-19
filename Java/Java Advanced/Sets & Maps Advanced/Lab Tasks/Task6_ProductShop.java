import java.util.*;

public class Task6_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Map<String, Double>> shopInfo = new TreeMap<>();

        String inputData = scanner.nextLine();

        while (!inputData.equals("Revision")) {

            String[] data = inputData.split(", ");
            String shop = data[0];
            String product = data[1];
            double price = Double.parseDouble(data[2]);

            if (shopInfo.containsKey(shop)) {
                shopInfo.get(shop).put(product,price);
            } else {
                shopInfo.put(shop, new LinkedHashMap<>());
                shopInfo.get(shop).put(product, price);
            }

            inputData = scanner.nextLine();

        }

       shopInfo.entrySet().stream().forEach(a->{
           System.out.printf("%s->%n",a.getKey());
           a.getValue().entrySet().stream().forEach(b->{
               System.out.printf("Product: %s, Price: %.1f%n", b.getKey(), b.getValue());

           });

       });
    }
}
