public class Car {
    String model;
    Engine engine;
    String weight = "n/a";
    String color = "n/a";


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s:%n" +
                "%s:%n" +
                "Power: %s%n" +
                "Displacement: %s%n" +
                "Efficiency: %s%n" +
                "Weight: %s%n" +
                "Color: %s%n",
                getModel(),engine.getModel(),engine.getPower(),engine.getDisplacement(),
                engine.getEfficiency(), getWeight(), getColor());
    }
}
