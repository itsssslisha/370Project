import java.lang.reflect.Array;
import java.util.ArrayList;

public class Aisle {
    private String aisleId;
    private ArrayList<Item> items = new ArrayList<Item>();
    public Aisle() {}
    public ArrayList<Item> getItems() {
        return items;
    }
    public String getAisleId() {
        return aisleId;
    }
    public void setAisleId(String s){
        this.aisleId = s;
    }
    public void addItem(Item i){
        items.add(i);
    }
}
