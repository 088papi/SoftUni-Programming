package bakery.entities.tables;

public class OutsideTable extends BaseTable{
    private static final double PRICE_PER_PERSON = 3.50;

    public OutsideTable(int tableNumber, int capacity) {
        super(tableNumber, capacity, PRICE_PER_PERSON);
    }

    @Override
    public String getFreeTableInfo() {

        String stringBuilder = "Table: " + getTableNumber() + System.lineSeparator() +
                "Type: " + "OutsideTable" + System.lineSeparator() +
                "Capacity: " + getCapacity() + System.lineSeparator() +
                "Price per Person: 3.50";
        return stringBuilder.trim();
    }
}
