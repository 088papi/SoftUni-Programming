package hotel;

public enum DiscountType {

    VIP(20),
    SECOND_VISIT(10),
    NONE(0);

    private double discount;
    DiscountType(int discount) {
        this.discount = discount;
    }

    public double getDiscountPercent(){
        return this.discount / 100;
    }
}
