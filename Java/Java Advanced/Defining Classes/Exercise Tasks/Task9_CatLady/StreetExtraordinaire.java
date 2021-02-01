public class StreetExtraordinaire extends Cat {

    public String breed = "StreetExtraordinaire";
    public double decibelsOfMeows;

    public StreetExtraordinaire(String name, double decibelsOfMeows) {
        super(name);
        this.decibelsOfMeows = decibelsOfMeows;
    }
    @Override
    public String toString(){
        return String.format("%s %s %.2f", breed, name,decibelsOfMeows);
    }
}
