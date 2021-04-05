package bakery.entities.tables;

public class InsideTable extends BaseTable{

    private static final double PRICE_PER_PERSON = 2.50;
    public InsideTable(int tableNumber, int capacity) {
        super(tableNumber, capacity, PRICE_PER_PERSON);
    }

    @Override
    public String getFreeTableInfo() {

        String stringBuilder = "Table: " + getTableNumber() + System.lineSeparator() +
                "Type: " + "InsideTable" + System.lineSeparator() +
                "Capacity: " + getCapacity() + System.lineSeparator() +
                "Price per Person: 2.50";
        return stringBuilder.trim();
    }
}
