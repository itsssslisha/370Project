import java.net.Inet4Address;

public class Item {
    private String name;
    private Integer cost;
    private Integer quantity;
    private String sellBy;
    private Boolean Used;
    private Integer itemID;

    public Item(){
        itemID = new getItemId().nextItemID();
    }

    public Integer getItemID() {
        return itemID;
    }
//    public Item(String n, Integer c, Integer q, String sb, Boolean u, Integer id) {
//        name = n;
//        cost = c;
//        quantity = q;
//        sellBy = sb;
//        Used = u;
//    }



}
