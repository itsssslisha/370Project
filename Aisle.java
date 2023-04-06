import java.util.ArrayList;

public class Aisle implements IteratorForItem{
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


//newly added-Edwin
    //Item Iterator
    @Override
    public Iterator getItemIterator() {
        return new ItemIterator();
    }

    //Added-Edwin
    private class ItemIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < items.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return items.get(index++);
            }
            return null;
        }
    }
}
