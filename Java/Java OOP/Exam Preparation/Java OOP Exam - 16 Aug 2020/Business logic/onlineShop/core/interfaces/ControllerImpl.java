package onlineShop.core.interfaces;

import onlineShop.models.products.components.*;
import onlineShop.models.products.computers.Computer;
import onlineShop.models.products.computers.DesktopComputer;
import onlineShop.models.products.computers.Laptop;
import onlineShop.models.products.peripherals.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static onlineShop.common.constants.ExceptionMessages.*;
import static onlineShop.common.constants.OutputMessages.*;

public class ControllerImpl implements Controller {

    private Map<Integer, Computer> computers;
    private Map<Integer, Component> components;
    private Map<Integer, Peripheral> peripherals;

    public ControllerImpl() {
        this.computers = new LinkedHashMap<>();
        this.components = new LinkedHashMap<>();
        this.peripherals = new LinkedHashMap<>();
    }


    @Override
    public String addComputer(String computerType, int id, String manufacturer, String model, double price) {

        if (computers.containsKey(id)) {
            throw new IllegalArgumentException(EXISTING_COMPUTER_ID);
        }

        Computer computer = null;

        if (computerType.equals("DesktopComputer")) {
            computer = new DesktopComputer(id, manufacturer, model, price);
        } else if (computerType.equals("Laptop")) {
            computer = new Laptop(id, manufacturer, model, price);
        } else {
            throw new IllegalArgumentException(INVALID_COMPUTER_TYPE);
        }

        computers.put(id, computer);

        return String.format(ADDED_COMPUTER, id);
    }

    @Override
    public String addComponent(int computerId, int id, String componentType, String manufacturer, String model, double price, double overallPerformance, int generation) {
        validateComputerId(computerId);
        if (components.containsKey(id)) {
            throw new IllegalArgumentException(EXISTING_COMPONENT_ID);
        }

        Component component = null;

        switch (componentType) {
            case "CentralProcessingUnit":
                component = new CentralProcessingUnit(id, manufacturer, model, price, overallPerformance, generation);
                break;
            case "Motherboard":
                component = new Motherboard(id, manufacturer, model, price, overallPerformance, generation);
                break;
            case "PowerSupply":
                component = new PowerSupply(id, manufacturer, model, price, overallPerformance, generation);
                break;
            case "RandomAccessMemory":
                component = new RandomAccessMemory(id, manufacturer, model, price, overallPerformance, generation);
                break;
            case "SolidStateDrive":
                component = new SolidStateDrive(id, manufacturer, model, price, overallPerformance, generation);
                break;
            case "VideoCard":
                component = new VideoCard(id, manufacturer, model, price, overallPerformance, generation);
                break;
            default:
                throw new IllegalArgumentException(INVALID_COMPONENT_TYPE);
        }

        components.put(id, component);
        computers.get(computerId).addComponent(component);

        return String.format(ADDED_COMPONENT, componentType, id, computerId);
    }


    @Override
    public String addPeripheral(int computerId, int id, String peripheralType, String manufacturer, String model, double price, double overallPerformance, String connectionType) {
        validateComputerId(computerId);

        if (peripherals.containsKey(id)) {
            throw new IllegalArgumentException(EXISTING_PERIPHERAL_ID);
        }
        Peripheral peripheral = null;
        switch (peripheralType){
            case "Headset":
                peripheral = new Headset(id,manufacturer,manufacturer,price,overallPerformance,connectionType);
                break;
            case "Keyboard":
                peripheral = new Keyboard(id,manufacturer,manufacturer,price,overallPerformance,connectionType);
                break;
            case "Monitor":
                peripheral = new Monitor(id,manufacturer,manufacturer,price,overallPerformance,connectionType);
                break;
            case "Mouse":
                peripheral = new Mouse(id,manufacturer,manufacturer,price,overallPerformance,connectionType);
                break;
            default:
                throw new IllegalArgumentException(INVALID_PERIPHERAL_TYPE);
        }

        computers.get(computerId).addPeripheral(peripheral);
        peripherals.put(id,peripheral);

        return String.format(ADDED_PERIPHERAL, peripheralType, id, computerId);
    }

    @Override
    public String removePeripheral(String peripheralType, int computerId) {
        validateComputerId(computerId);
        Peripheral peripheral = computers.get(computerId).removePeripheral(peripheralType);

        peripherals.remove(peripheral.getId());

        return String.format(REMOVED_PERIPHERAL, peripheralType, peripheral.getId());
    }


    @Override
    public String removeComponent(String componentType, int computerId) {
        validateComputerId(computerId);
        Component component = computers.get(computerId).removeComponent(componentType);

        components.remove(component.getId());
        return String.format(REMOVED_COMPONENT, componentType, component.getId());
    }

    @Override
    public String buyComputer(int id) {
        validateComputerId(id);
        Computer removed = computers.remove(id);
        return removed.toString();
    }

    @Override
    public String BuyBestComputer(double budget) {
        List<Computer> filteredComputers = computers.values().stream().filter(c -> c.getPrice() <= budget)
                .sorted(Comparator.comparing(Computer::getOverallPerformance).reversed())
                .collect(Collectors.toList());
        if (filteredComputers.isEmpty()){
            throw new IllegalArgumentException(String.format(CAN_NOT_BUY_COMPUTER, budget));
        }
        Computer computer = filteredComputers.get(0);
        computers.remove(computer.getId());
        return computer.toString();
    }

    @Override
    public String getComputerData(int id) {
        validateComputerId(id);
        return computers.get(id).toString();
    }

    private void validateComputerId(int id) {
        if (!computers.containsKey(id)) {
            throw new IllegalArgumentException(NOT_EXISTING_COMPUTER_ID);
        }
    }

}
