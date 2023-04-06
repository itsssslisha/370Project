public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        //warehouse.addListener(new WorkIPad());
        warehouse.addSection(new Section());
        warehouse.addSection(new Section());
        warehouse.addAisle('A', new Aisle());
        warehouse.addAisle('A', new Aisle());
        warehouse.addAisle('A', new Aisle());
        warehouse.addAisle('B', new Aisle());
        warehouse.addAisle('B', new Aisle());
        warehouse.addItem("B1", new Item("HDD", 59.56, new Electronics(), new New()));
        warehouse.addItem("B1", new Item("Hi", 69.65, new Electronics(), new New()));
        //warehouse.printInvoice();
        warehouse.printSection();
        warehouse.printAisle('A');
    }
}
