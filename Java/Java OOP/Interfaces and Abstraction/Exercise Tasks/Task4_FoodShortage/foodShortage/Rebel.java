package foodShortage;

public class Rebel implements Person, Buyer {
    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group){
        this.setName(name);
        this.setAge(age);
        this.setGroup(group);
        this.food = 0;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public int getAge(){
        return this.age;
    }
    public String getGroup(){
        return this.group;
    }
    @Override
    public int getFood(){
        return this.food;
    }
    @Override
    public void buyFood(){
        this.food+=5;
    }


}
