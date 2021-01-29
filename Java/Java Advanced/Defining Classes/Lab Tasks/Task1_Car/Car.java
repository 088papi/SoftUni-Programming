public class Car {

    String brand;
    String model;
    int horsePower;

    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public int getHorsePower(){
        return this.horsePower;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }
    @Override
    public String toString(){
        return String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.getHorsePower());
    }

}
