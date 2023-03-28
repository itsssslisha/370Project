import java.net.Inet4Address;

public class Item {
    private String name;
    private Integer cost;
    private Integer quantity;
    private String sellBy;
    private Boolean Used;

    public Item(){}
    public Item(String n, Integer c, Integer q, String sb, Boolean u) {
        name = n;
        cost = c;
        quantity = q;
        sellBy = sb;
        Used = u;
    }



}
