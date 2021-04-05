package bakery.entities.drinks;

public class Water extends BaseDrink{
    private static final double INITIAL_WATER_PRICE = 1.50;
    public Water(String name, int portion, String brand) {
        super(name, portion, INITIAL_WATER_PRICE, brand);
    }
}
