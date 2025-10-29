package DIP.after;

public class Main {
    public static void main(String[] args) {
        Database database = new MySQLDatabase();
        OrderProcessor order = new OrderProcessor(database);
        order.processOrder("Données à sauvegarder");

        database = new MongoDBDatabase();
        order = new OrderProcessor(database);
        order.processOrder("Données à sauvegarder");
    }
}