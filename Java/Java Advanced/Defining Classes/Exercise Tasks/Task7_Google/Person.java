import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private Company company;
    private List<Pokemon> pokemonList;
    private List<Parent> parentsList;
    private List<Child> childrenList;
    private Car car;

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public List<Parent> getParentsList() {
        return parentsList;
    }

    public List<Child> getChildrenList() {
        return childrenList;
    }

    public Car getCar() {
        return car;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public void setParentsList(List<Parent> parentsList) {
        this.parentsList = parentsList;
    }

    public void setChildrenList(List<Child> childrenList) {
        this.childrenList = childrenList;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Person(String name) {
        this.name = name;
        this.company = null;
        this.pokemonList = new ArrayList<>();
        this.parentsList = new ArrayList<>();
        this.childrenList = new ArrayList<>();
        this.car = null;
    }

    public static class Company {

        String companyName;
        String department;
        double salary;

        public Company(String companyName, String department, double salary) {
            this.companyName = companyName;
            this.department = department;
            this.salary = salary;
        }

        public String getString(Company company){
            return String.format("%s %s %.2f", this.companyName, this.department, this.salary);
        }
    }

    public static class Pokemon {
        String pokemonName;
        String pokemonType;

        public Pokemon(String pokemonName, String pokemonType) {
            this.pokemonName = pokemonName;
            this.pokemonType = pokemonType;
        }

        public String getString(Pokemon pokemon){
            return String.format("%s %s",this.pokemonName, this.pokemonType);
        }
    }

    public static class Parent {
        String parentName;
        String parentBirthday;

        public Parent(String parentName, String parentBirthday) {
            this.parentName = parentName;
            this.parentBirthday = parentBirthday;
        }

        public String getString(Parent parent) {
        return String.format("%s %s", this.parentName, this.parentBirthday);
        }
    }

    public static class Child {
        String childName;
        String childBirthday;

        public Child(String childName, String childBirthday) {
            this.childName = childName;
            this.childBirthday = childBirthday;
        }

        public String getString(Child child){
            return String.format("%s %s", this.childName, this.childBirthday);
        }
    }

    public static class Car {
        String carModel;
        String carSpeed;

        public Car(String carModel, String carSpeed) {
            this.carModel = carModel;
            this.carSpeed = carSpeed;


        }
        public String getString(Car car){
            return String.format("%s %s",this.carModel,this.carSpeed);
        }
    }
@Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(System.lineSeparator());
        sb.append("Company:").append(System.lineSeparator());
        if (this.company != null){
            sb.append(company.getString(company));
            sb.append(System.lineSeparator());
        }
        sb.append("Car:").append(System.lineSeparator());
        if (this.car != null){
            sb.append(car.getString(car)).append(System.lineSeparator());
        }

        sb.append("Pokemon:").append(System.lineSeparator());
        if (this.getPokemonList().size() != 0){
            getPokemonList().forEach(pokemon ->{
                sb.append(pokemon.getString(pokemon));
                sb.append(System.lineSeparator());
            } );
        }

        sb.append("Parents:").append(System.lineSeparator());
        if (this.getParentsList().size() != 0){
            getParentsList().forEach(parent -> {
                sb.append(parent.getString(parent));
                        sb.append(System.lineSeparator());
            });
        }
    sb.append("Children:").append(System.lineSeparator());
    if (this.getChildrenList().size() != 0){
        getChildrenList().forEach(child -> {
            sb.append(child.getString(child));
            sb.append(System.lineSeparator());
        });
    }


        return sb.toString();
    }


}
