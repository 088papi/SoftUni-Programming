package foodShortage;

public class Citizen implements Person, Buyer, Identifiable{
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Citizen(String name, int age, String id, String birthDate) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthDate(birthDate);
        this.food = 0;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getId(){
        return this.id;
    }
    @Override
    public int getFood(){
        return this.food;
    }
    @Override
    public void buyFood(){
        this.food+=10;
    }



}
