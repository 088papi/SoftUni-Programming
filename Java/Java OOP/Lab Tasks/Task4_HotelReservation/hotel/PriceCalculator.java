package hotel;

public class PriceCalculator {
    private double pricePerDay;
    private int daysCount;
    private Season season;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int daysCount, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.daysCount = daysCount;
        this.season = season;
        this.discountType = discountType;
    }

    public double getTotalPrice(){
        double totalPrice = daysCount * pricePerDay * season.getMultiplier();
        double percentage = discountType.getDiscountPercent();;

        return totalPrice-= totalPrice * percentage;
    }
}
