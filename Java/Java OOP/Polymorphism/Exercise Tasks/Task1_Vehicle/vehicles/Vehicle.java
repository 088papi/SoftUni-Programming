package vehicles;

import java.text.DecimalFormat;

public class Vehicle implements IVehicle{

    private double fuelQuantity;
    private double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        setFuelConsumption(fuelConsumption);
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String drive(double distance) {
        double fuelNeeded = distance * this.fuelConsumption;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = "needs refueling";

        if (this.fuelQuantity >= fuelNeeded) {
            this.fuelQuantity -= fuelNeeded;
            result = String.format("travelled %s km", decimalFormat.format(distance));
        }


        return result;
    }

    @Override
    public void refuel(double litres) {
        this.fuelQuantity+=litres;
    }


    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
