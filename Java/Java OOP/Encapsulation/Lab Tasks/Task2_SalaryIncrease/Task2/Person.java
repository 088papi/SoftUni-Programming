package Task2;
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;

    }


    public String getFirstName() {
        return this.firstName;
    }


    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }


    @Override
    public String toString(){
        return String.format("%s %s gets " + this.getSalary() + " leva" ,
                this.getFirstName(), this.getLastName());
    }

    public void increaseSalary(double percentage) {
        if(this.age < 30){
            this.setSalary(this.getSalary() + (this.getSalary() * percentage / 100 / 2));
        } else {
            this.setSalary(this.getSalary() + (this.getSalary() * percentage / 100));
        }

    }

    private void setSalary(double salary) {
        this.salary = salary;
    }
}

