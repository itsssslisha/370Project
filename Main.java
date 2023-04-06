import Categories.Appliances;
import Categories.Hardware;
import Conditions.Damaged;
import Conditions.Used;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addSection(new Section());
        warehouse.addSection(new Section());
        warehouse.addAisle('A', new Aisle());
        warehouse.addAisle('B',  new Aisle());
        warehouse.addItem("A1", new Item("HDD", 39.99 ,new Hardware(),  new Used()));
        warehouse.addItem("B1", new Item("Fan", 59.99, new Appliances(),  new Damaged()));
    }
}
