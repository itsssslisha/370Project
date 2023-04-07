
    import org.junit.Assert;
    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    static Warehouse warehouse = new Warehouse();
    @Test
    void addListeners() {
        warehouse.addListener(new WorkIPad());
        Assert.assertEquals("Amount of Listeners is 1", warehouse.getNumListeners());
    }
    @Test
    void removeListeners() {
        WorkIPad testIPad = new WorkIPad();
        warehouse.addListener(testIPad);
        warehouse.removeListener(testIPad);
        Assert.assertEquals("Amount of Listeners is 0", warehouse.getNumListeners());
    }
    @Test
    void printInvoice() {
        warehouse.addSection(new Section());
        Assert.assertEquals("Section A:\n", warehouse.printInvoice());
    }
    @Test
    void printSection() {
        warehouse.addSection(new Section());
        warehouse.addSection(new Section());
        Assert.assertEquals("Section A, \nSection B\n", warehouse.printSection());
    }


    @Test
    void addSection() {
        warehouse.addSection(new Section());
        Assert.assertEquals('A', warehouse.getSection('A').getSectionId());
    }

    @Test
    void addAisle() {
        warehouse.addSection(new Section());
        warehouse.addAisle('A', new Aisle());
        Assert.assertEquals("A1", warehouse.getAisle("A1").getAisleId());
    }
}