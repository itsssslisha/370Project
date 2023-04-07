import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    static Warehouse warehouse = new Warehouse();

    @Test
    void getName() {
        warehouse.addSection(new Section());
        warehouse.addAisle('A', new Aisle());
        warehouse.addItem("A1", new Item("HDD", 60.40, new Electronics(), new Damaged()));
        Assert.assertEquals("HDD", warehouse.getItem("A1", 1).getName());
    }

    @Test
    void getPrice() {
        warehouse.addSection(new Section());
        warehouse.addAisle('A', new Aisle());
        warehouse.addItem("A1", new Item("Computer", 599.99, new Electronics(), new New()));
        Assert.assertEquals( (Double) 599.99, warehouse.getItem("A1", 3).getPrice());
    }

    @Test
    void getItemID() {
        warehouse.addSection(new Section());
        warehouse.addAisle('A', new Aisle());
        warehouse.addItem("A1", new Item("Screwdriver", 7.99, new Hardware(), new New()));
        Assert.assertEquals((Integer) 1, warehouse.getItem("A1", 1).getItemID());
    }
}