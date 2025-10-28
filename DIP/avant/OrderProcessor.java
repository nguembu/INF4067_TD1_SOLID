package avant;

public class OrderProcessor {
    private MySQLDatabase database; // Dépendance concrète

    public OrderProcessor() {
        this.database = new MySQLDatabase(); // Création directe
    }

    public void processOrder(String order) {
        database.save(order);
    }
}