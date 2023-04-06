import java.net.Inet4Address;

public class Item {
    private int itemID;
    private String name;
    private Category category;
    private Status status;


    public Item(String s, Category c, Status status){
        name = s;
        itemID = new getItemId().nextItemID();
        category = c;
        this.status = status;
       // category.showCategory();
    }

    public Integer getItemID() {
        return itemID;
    }




}
