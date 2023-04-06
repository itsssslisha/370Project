public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addListener(new SystemNotification());
        warehouse.addListener(new WorkPhone());
        warehouse.addListener(new WorkIPad());
        warehouse.addSection(new Section());
        warehouse.addSection(new Section());
        warehouse.addAisle('A', new Aisle());
        warehouse.addAisle('A', new Aisle());
        warehouse.addAisle('B', new Aisle());
        warehouse.addAisle('B', new Aisle());
        warehouse.addItem("A1", new Item());
        warehouse.addItem("A1", new Item());


    }
}
