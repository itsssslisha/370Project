public class Item {

    private Integer itemID;
    private String name;
    private Category category;
    private Condition condition;
    private Double Price;
    public Item(String name, Double Price, Category category, Condition condition){
        this.Price = Price;
        this.name = name;
        itemID = new getItemId().nextItemID();
        this.category = category;
        this.condition = condition;
    }
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return Price;
    }
    public String getPriceInDollar() {
        return "$" + String.format("%.2f", getPrice());
    }
    public Integer getItemID() {
        return itemID;
    }

}
