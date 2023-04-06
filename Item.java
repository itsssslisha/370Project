import Categories.Category;
import Conditions.Condition;

public class Item {

    private Integer itemID;
    private String name;
    private Category category;
    private Condition condition;
    private Double Price;
    public Item(String name, Double Price, Category category, Condition condition){
        this.Price = Price;
        itemID = new getItemId().nextItemID();
        System.out.println(name);
        System.out.println("$" + Price);
        category.showCategory();
        condition.itemCondition();
        System.out.println("");
    }

    public Integer getItemID() {
        return itemID;
    }

}
