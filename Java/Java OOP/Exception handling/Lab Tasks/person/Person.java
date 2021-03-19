package person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }


    private void setFirstName(String firstName) {
        validateString(firstName, "first name");
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        validateString(lastName, "last name");
        this.lastName = lastName;
    }

    private void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age should be in the range [0 ... 120]");
        }
        this.age = age;
    }

    private void validateString(String string, String fieldName) {
        if (string == null || string.trim().isEmpty()) {
            throw new IllegalStateException("The " + fieldName + " name cannot be null or empty!");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
