public class Car {
    String model;
    double fuelAmount;
    double fuelCost1km;
    double distanceTraveled;

    public Car(){
        distanceTraveled = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCost1km() {
        return fuelCost1km;
    }

    public void setFuelCost1km(double fuelCost1km) {
        this.fuelCost1km = fuelCost1km;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public void travel(double fuelAmount, double fuelCost1km, int distanceTraveled){
        if (fuelAmount >= fuelCost1km * distanceTraveled){
            fuelAmount-= fuelCost1km*distanceTraveled;
            this.fuelAmount = fuelAmount;
            this.distanceTraveled+=distanceTraveled;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }

    }
}
