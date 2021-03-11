package vehicles;

public class Car extends Vehicle{

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }


    @Override
    public void setFuelConsumption(double consumption) {
        super.setFuelConsumption(consumption + 0.9);
    }

    @Override
    public String drive (double distance) {
        return "Car " + super.drive(distance);
    }





}
