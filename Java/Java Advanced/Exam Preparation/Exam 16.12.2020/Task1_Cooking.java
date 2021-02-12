import java.util.*;
import java.util.stream.Collectors;

public class Task1_Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> products = new TreeMap<>();
        products.put("Bread", 0);
        products.put("Cake", 0);
        products.put("Pastry", 0);
        products.put("Fruit Pie", 0);


        ArrayDeque<Integer> liquidsQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> ingredientStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).forEach(ingredientStack::push);

        while (!liquidsQueue.isEmpty() && !ingredientStack.isEmpty()) {
            int liquid = liquidsQueue.peek();
            int ingredient = ingredientStack.peek();
            int sum = liquid + ingredient;

            cookFood(products, liquidsQueue, ingredientStack, ingredient, sum);
        }


        String output = "";

        if (products.values().stream().allMatch(e -> e >= 1)) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to to cook everything.");
        }

        System.out.println("Liquids left: " + getElementsInfo(liquidsQueue));
        System.out.println("Ingredients left: " + getElementsInfo(ingredientStack));

        products.forEach((a,b) ->{
            System.out.println(a + ": " + b);
        });
    }

    private static void cookFood(Map<String, Integer> products, ArrayDeque<Integer> liquidsQueue, ArrayDeque<Integer> ingredientStack, int ingredient, int sum) {
        if (sum == 25) {
            products.put("Bread", products.get("Bread") + 1);
            removeElements(liquidsQueue, ingredientStack);
        } else if (sum == 50) {
            products.put("Cake", products.get("Cake") + 1);
            removeElements(liquidsQueue, ingredientStack);
        } else if (sum == 75) {
            products.put("Pastry", products.get("Pastry") + 1);
            removeElements(liquidsQueue, ingredientStack);
        } else if (sum == 100) {
            products.put("Fruit Pie", products.get("Fruit Pie") + 1);
            removeElements(liquidsQueue, ingredientStack);
        } else {
            ingredient += 3;
            removeElements(liquidsQueue, ingredientStack);
            ingredientStack.push(ingredient);
        }
    }

    private static String getElementsInfo(ArrayDeque<Integer> deque) {
        return deque.isEmpty() ?"none"
                :deque
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    private static void removeElements(ArrayDeque<Integer> liquidsQueue, ArrayDeque<Integer> ingredientStack) {
        liquidsQueue.poll();
        ingredientStack.pop();
    }
}
