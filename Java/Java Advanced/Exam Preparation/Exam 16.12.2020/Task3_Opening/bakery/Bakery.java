package bakery;

import java.util.ArrayList;
import java.util.List;

public class Bakery {
    private List<Employee> employees;
    private String name;
    private int capacity;


    public Bakery(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        if (capacity > this.employees.size()) {
            this.employees.add(employee);
        }
    }

    public boolean remove(String name) {
        return employees.removeIf(e -> e.getName().equals(name));
    }

    public Employee getOldestEmployee() {
        Employee employee = null;

        for (Employee employee1 : employees) {
            if (employee == null || employee.getAge() < employee1.getAge()) {
                employee = employee1;
            }

        }
        return employee;
    }

    public Employee getEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public int getCount(){
        return this.employees.size();
    }

    public String report(){
        StringBuilder stringBuilder = new StringBuilder("Employees working at Bakery " + name + ":");

        for (Employee employee : employees) {
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append(employee.toString());

        }
        return stringBuilder.toString().trim();
    }
}
