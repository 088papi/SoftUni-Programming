package easterRaces.core.interfaces;

import easterRaces.entities.cars.Car;
import easterRaces.entities.cars.MuscleCar;
import easterRaces.entities.cars.SportsCar;
import easterRaces.entities.drivers.Driver;
import easterRaces.entities.drivers.DriverImpl;
import easterRaces.entities.racers.Race;
import easterRaces.entities.racers.RaceImpl;
import easterRaces.repositories.interfaces.CarRepository;
import easterRaces.repositories.interfaces.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static easterRaces.common.ExceptionMessages.*;
import static easterRaces.common.OutputMessages.*;

public class ControllerImpl implements Controller {

    private Repository<Car> cars;
    private Repository<Driver> drivers;
    private Repository<Race> races;


    public ControllerImpl(Repository<Driver> riderRepository, Repository<Car> motorcycleRepository, Repository<Race> raceRepository) {
        this.cars =  motorcycleRepository;
        this.drivers = riderRepository;
        this.races = raceRepository;
    }

    @Override
    public String createDriver(String driver) {


        if (drivers.getAll().stream().anyMatch(e-> e.getName().equals(driver))){
            throw new IllegalArgumentException(String.format(DRIVER_EXISTS, driver));
        }

        drivers.add(new DriverImpl(driver));

        return String.format(DRIVER_CREATED, driver);
    }

    @Override
    public String createCar(String type, String model, int horsePower) {
        Car car =null;

        switch (type) {
            case "Muscle":
                car = new MuscleCar(model, horsePower);

                break;
            case "Sports":
                car = new SportsCar(model, horsePower);
                break;
        }
        Car finalCar = car;

      if (cars.getAll().stream().anyMatch(e -> e.equals(finalCar))) {
            throw new IllegalArgumentException(String.format(CAR_EXISTS, model));
        }

        cars.add(car);

        return String.format(CAR_CREATED, type + "Car", model);
    }

    @Override
    public String addCarToDriver(String driverName, String carModel) {
        Collection<Car> all = cars.getAll();
        boolean doesCarExist = all.stream().anyMatch(e -> e.getModel().equals(carModel));

        Collection<Driver> allDrivers = drivers.getAll();
        boolean doesDriverExists = allDrivers.stream().anyMatch(e -> e.getName().equals(driverName));

        if (!doesDriverExists) {
            throw new IllegalArgumentException(String.format(DRIVER_NOT_FOUND, driverName));
        }

        if (!doesCarExist) {
            throw new IllegalArgumentException(String.format(CAR_NOT_FOUND, carModel));
        }

        Car car = cars.getByName(carModel);
        cars.remove(car);
        drivers.getByName(driverName).addCar(car);
        return String.format(CAR_ADDED, driverName, carModel);

    }

    @Override
    public String addDriverToRace(String raceName, String driverName) {

        Collection<Driver> allDrivers = drivers.getAll();
        boolean driverExists = allDrivers.stream().anyMatch(e -> e.getName().equals(driverName));

        Collection<Race> allRaces = races.getAll();
        boolean raceExists = allRaces.stream().anyMatch(e -> e.getName().equals(raceName));

        if (!raceExists) {
            throw new IllegalArgumentException(String.format(RACE_NOT_FOUND, raceName));
        }
        if (!driverExists) {
            throw new IllegalArgumentException(String.format(DRIVER_NOT_FOUND, driverName));
        }

        races.getByName(raceName).addDriver(drivers.getByName(driverName));

        return String.format(DRIVER_ADDED, driverName, raceName);
    }

    @Override
    public String startRace(String raceName) {

        Collection<Driver> all = drivers.getAll();
        Collection<Race> allRaces = races.getAll();

        if (races.getAll().stream().noneMatch(e -> e.getName().equals(raceName))) {
            throw new IllegalArgumentException(String.format(RACE_NOT_FOUND, raceName));
        }

        Race race = races.getByName(raceName);

        if (race.getDrivers().size() < 3) {
            throw new IllegalArgumentException(String.format(RACE_INVALID, raceName, 3));
        }



        List<Driver> firstThree = all.stream().sorted((a, b) ->
                Double.compare(a.getCar().calculateRacePoints(races.getByName(raceName).getLaps()),
                        b.getCar().calculateRacePoints(races.getByName(raceName).getLaps()))).limit(3)
                .collect(Collectors.toList());

        Collections.reverse(firstThree);
        Driver driver = firstThree.stream().findFirst().get();
        firstThree.remove(driver);
        Driver driver1 = firstThree.stream().findFirst().get();
        firstThree.remove(driver1);
        Driver driver2 = firstThree.stream().findFirst().get();
        firstThree.remove(driver2);


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format(DRIVER_FIRST_POSITION, driver.getName(), raceName))
                .append(System.lineSeparator());
        stringBuilder.append(String.format(DRIVER_SECOND_POSITION, driver1.getName(), raceName))
                .append(System.lineSeparator());
        stringBuilder.append(String.format(DRIVER_THIRD_POSITION, driver2.getName(), raceName))
                .append(System.lineSeparator());
        return stringBuilder.toString().trim();
    }

    @Override
    public String createRace(String name, int laps) {
        RaceImpl race = new RaceImpl(name, laps);
        if (races.getAll().contains(race)) {
            throw new IllegalArgumentException(String.format(RACE_EXISTS, name));
        }

        races.add(race);

        return String.format(RACE_CREATED, name);
    }
}
