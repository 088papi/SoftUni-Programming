package garage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GarageTests {
    private Garage garage;

    @Before
    public void setUp() {
        garage = new Garage();
        Car car = new Car("Ferrari", 300, 2000000);
        Car car1 = new Car("Opel", 300, 3000000);
        Car car2 = new Car("Opel", 500, 5000000);

        garage.addCar(car);
        garage.addCar(car1);
        garage.addCar(car2);

    }

    @Test
    public void testFindAllCarsWithMaxSpeedAbove() {
        int speed = 200;

        List<Car> allCarsWithMaxSpeedAbove = garage.findAllCarsWithMaxSpeedAbove(speed);

        Assert.assertEquals(3, allCarsWithMaxSpeedAbove.size());


    }

    @Test
    public void testAddCarWithValidObject() {
        Car car = new Car("Audi", 200, 200000);
        garage.addCar(car);
        Assert.assertEquals(4, garage.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddCarWithInvalidObject() {
        Car car = null;
        garage.addCar(car);
    }

    @Test
    public void testGetMostExpensiveCar() {


        Car car3 = new Car("Renault", 300, 6000000);
        garage.addCar(car3);

        Car mostExpensive = garage.getTheMostExpensiveCar();


        Assert.assertEquals(car3, mostExpensive);
    }

    @Test
    public void testFindAllCarsByBrand() {
        String brand = "Opel";

        List<Car> allCarsByBrand = garage.findAllCarsByBrand(brand);

        Assert.assertEquals(2, allCarsByBrand.size());
    }


}