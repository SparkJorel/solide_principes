package DIP.before;

public class OrderProcessor {
    private MySQLDatabase database = new MySQLDatabase();

    public void processOrder(String order) {
        database.save(order);
    }
}