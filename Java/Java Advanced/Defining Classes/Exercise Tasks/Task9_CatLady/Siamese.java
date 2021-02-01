public class Siamese extends Cat{

    public String breed = "Siamese";
    public double earSize;

    public Siamese(String name, double earSize) {
        super(name);
        this.earSize = earSize;
    }
@Override
    public String toString(){
        return String.format("%s %s %.2f", breed, name,earSize);
}

}
