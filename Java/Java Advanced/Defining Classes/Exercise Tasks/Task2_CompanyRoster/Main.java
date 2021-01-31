import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Employee>> departments = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            Employee employee = null;

            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String department = data[3];
            String email;
            int age;

            employee = new Employee(name, salary, position, department);
            switch (data.length) {
                case 5:
                    if (data[4].contains("@")) {
                        email = data[4];
                        employee = new Employee(name, salary, position, department, email);
                    } else {
                        age = Integer.parseInt(data[4]);
                        employee = new Employee(name, salary, position, department, age);
                    }
                    break;
                case 6:
                    email = data[4];
                    age = Integer.parseInt(data[5]);
                    employee = new Employee(name, salary, position, department, email, age);
            }

            if (!departments.containsKey(department)) {
                departments.put(department, new ArrayList<>());
                departments.get(department).add(employee);
            } else {
                departments.get(department).add(employee);
            }
        }

        System.out.println();
        double average;

        departments.entrySet().stream().sorted((firstDepartment, secondDepartment) -> {
            double first = firstDepartment.getValue().stream().mapToDouble(Employee::getSalary).average().orElse(Double.NaN);
            double second = secondDepartment.getValue().stream().mapToDouble(Employee::getSalary).average().orElse(Double.NaN);
            return Double.compare(second, first);
        }).limit(1).forEach(a -> {
            System.out.printf("Highest Average Salary: %s%n", a.getKey());

            a.getValue().stream().sorted((firstEmployee, secondEmployee) -> {
                double first = firstEmployee.getSalary();
                double second = secondEmployee.getSalary();
                return Double.compare(second, first);
            }).forEach((b) -> {
                System.out.printf("%s %.2f %s %d%n", b.getName(), b.getSalary(), b.getEmail(), b.getAge());
            });
        });


    }
}
