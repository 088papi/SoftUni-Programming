public class Cymric extends Cat {

    public String breed = "Cymric";
    public double furLength;

    public Cymric(String name, double furLength) {
        super(name);
        this.furLength = furLength;
    }
    @Override
    public String toString(){
        return String.format("%s %s %.2f", breed, name,furLength);
    }
}
