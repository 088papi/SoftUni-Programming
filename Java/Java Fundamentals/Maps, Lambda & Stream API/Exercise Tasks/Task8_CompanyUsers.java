import java.util.*;
//100/100
public class Task8_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> employee = new TreeMap<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("End")) {
                break;
            }

            String[] data = input.split(" -> ");
            String companyName = data[0];
            String employeeID = data[1];

            employee.putIfAbsent(companyName, new ArrayList<>());

            List<String> list = new ArrayList<>();

            if (employee.containsKey(companyName)) {
                if (!employee.get(companyName).contains(employeeID)) {
                    employee.get(companyName).add(employeeID);
                }
            } else {
                employee.put(companyName, new ArrayList<>());
            }


        }

        employee.entrySet()
                .stream()
                .sorted((a, b) -> a.getKey().compareTo(b.getKey()))
                .forEach(a -> {
                    System.out.println(a.getKey());
                    a.getValue().stream()
                            .forEach(b -> System.out.println("-- " + b));

                });

    }
}
