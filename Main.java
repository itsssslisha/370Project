public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addSection(new Section());
        warehouse.addSection(new Section());
        warehouse.addAisle('A', new Aisle());
        warehouse.addAisle('B', new Aisle());
        warehouse.addAisle('B', new Aisle());
        // warehouse.addItem("B1", new Item());
    }
}
