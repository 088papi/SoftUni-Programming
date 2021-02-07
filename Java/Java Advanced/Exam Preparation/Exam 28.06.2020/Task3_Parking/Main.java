package parking;

public class Main {
    public static void main(String[] args) {


// Initialize the repository
        Parking parking = new Parking("Underground parking garage", 3);
        Parking parking1 = new Parking("Utopia", 2);
// Initialize entity
        Car volvo = new Car("Volvo", "XC70", 2010);


// Add Car
        parking.add(volvo);

        Car peugeot = new Car("Peugeot", "307", 2011);
        Car audi = new Car("Audi", "S4", 2011);
        parking1.add(audi);
        parking.add(peugeot);
        parking.add(audi);

        System.out.println(parking.getStatistics());
        System.out.println(parking1.getStatistics());


    }
}
