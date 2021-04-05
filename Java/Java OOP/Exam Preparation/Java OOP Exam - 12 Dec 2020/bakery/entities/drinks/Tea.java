package bakery.entities.drinks;

public class Tea extends BaseDrink {
    private static final double INITIAL_TEA_PRICE = 2.50;
    public Tea(String name, int portion, String brand) {
        super(name, portion,INITIAL_TEA_PRICE, brand);
    }
}
