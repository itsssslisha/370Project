import java.util.ArrayList;

public class Section implements IteratorForAisle{
    private char sectionID;
    private ArrayList<Aisle> aisles = new ArrayList<Aisle>();
    String deliveryDay;

    public Section() {
        this.sectionID = new getSectionId().getNextId();
    }

    public ArrayList<Aisle> getAisles() {
        return  aisles;
    }

    public void addAisleToSection(Aisle a) {
        aisles.add(a);
    }
    public char getSectionId () {
        return sectionID;
    }

    public String printSection(String sectionName){
        return "";
    }

//newly added-Edwin
    //AisleIterator
    @Override
    public Iterator getAisleIterator() {
        return new AisleIterator();
    }
    
    //Added-Edwin
    private class AisleIterator implements Iterator{
        int index;


        @Override
        public boolean hasNext() {
            if(index < aisles.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return aisles.get(index++);
            }
            return null;
        }
    }
}
