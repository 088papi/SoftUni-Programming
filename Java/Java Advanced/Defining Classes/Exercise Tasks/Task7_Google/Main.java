import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Person> people = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String name = data[0];




            String personName = data[0];
            if (!people.containsKey(personName)) {
                Person person = new Person(data[0]);
                people.put(personName, person);
            }

            Person.Company company = null;
            Person.Parent parent = null;
            Person.Child child = null;
            Person.Car car = null;
            Person.Pokemon pokemon = null;

            switch (data[1]) {
                case "company":
                    company = setCompany(data);
                    people.get(personName).setCompany(company);

                    break;
                case "parents":
                    parent = setParent(data);
                    people.get(personName).getParentsList().add(parent);
                    break;

                case "pokemon":
                    pokemon = setPokemon(data);
                    people.get(personName).getPokemonList().add(pokemon);
                    break;

                case "children":
                    child = setChild(data);
                    people.get(personName).getChildrenList().add(child);
                    break;

                case "car":
                    car = setCar(data);
                    people.get(personName).setCar(car);
                    break;
            }


            input = scanner.nextLine();
        }


        input = scanner.nextLine();
        if (people.containsKey(input)){
            System.out.println(people.get(input).toString());
        }

        System.out.println();
    }

    private static Person.Pokemon setPokemon(String[] data) {
        String name = data[2];
        String type = data[3];

        return new Person.Pokemon(name, type);
    }

    private static Person.Child setChild(String[] data) {
        String childName = data[2];
        String birthDate = data[3];
        return new Person.Child(childName, birthDate);
    }

    private static Person.Car setCar(String[] data) {
        String model = data[2];
        String speed = data[3];
        return new Person.Car(model, speed);
    }

    private static Person.Parent setParent(String[] data) {
        String parentName = data[2];
        String birthDate = data[3];
        return new Person.Parent(parentName, birthDate);
    }

    private static Person.Company setCompany(String[] data) {
        String companyName = data[2];
        String department = data[3];
        double salary = Double.parseDouble(data[4]);
        return new Person.Company(companyName, department, salary);
    }
}
