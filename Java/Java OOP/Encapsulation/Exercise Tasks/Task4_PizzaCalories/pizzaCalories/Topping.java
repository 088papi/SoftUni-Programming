package pizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50 ) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].",
                    this.toppingType));
        }
        this.weight = weight;
    }

    private void setToppingType(String toppingType) {
        //
        if (!toppingType.equals("Meat")
                && !toppingType.equals("Veggies")
                && !toppingType.equals("Cheese")
                && !toppingType.equals("Sauce")) {
        throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.",
                toppingType));
        }
        this.toppingType = toppingType;
    }


    public double calculateCalories() {
        return this.weight * 2 * getModifier(this.toppingType);
    }

    private double getModifier(String toppingType) {

        switch (toppingType) {
            case "Meat":
                return 1.2;
            case "Veggies":
                return 0.8;
            case "Cheese":
                return 1.1;
            case "Sauce":
                return 0.9;
            default:
                return 0.0;
        }
    }
}
