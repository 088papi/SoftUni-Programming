package bakery;

import java.util.ArrayList;
import java.util.List;

public class Bakery {
    private List<Employee> employeeList;
    private String name;
    private int capacity;


    public Bakery(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employeeList = new ArrayList<>();
    }

    public void add(Employee employee) {
        if (capacity > this.employeeList.size()) {
            this.employeeList.add(employee);
        }
    }

    public boolean remove(String name) {
        return employeeList.removeIf(e -> e.getName().equals(name));
    }

    public Employee getOldestEmployee() {
        Employee employee = null;

        for (Employee employee1 : employeeList) {
            if (employee == null || employee.getAge() < employee1.getAge()) {
                employee = employee1;
            }

        }
        return employee;
    }

    public Employee getEmployee(String name) {
        for (Employee employee : employeeList) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public int getCount(){
        return this.employeeList.size();
    }

    public String report(){
        StringBuilder stringBuilder = new StringBuilder("Employee working at Bakery: " + name);

        for (Employee employee : employeeList) {
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append(employee.toString());

        }
        return stringBuilder.toString().trim();
    }
}
