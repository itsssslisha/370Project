import java.util.ArrayList;

//added "implements IteratorForSection"-Edwin
public class Warehouse implements IteratorForSection {
    private ArrayList<Section> section = new ArrayList<Section>();
    public Item findItem(){
        // given the item id, find the section num and aisle num
        // iterator pattern
        return null;
    }
    
    public void removeSection(char sectionID) {
        System.out.println("Num Sections " + section.size());
        section.remove(getSection(sectionID));
        System.out.println("Num Sections " + section.size());
    }
    public void removeAisle(String aisleID) {
        char sectionID = aisleID.charAt(0);
      //  System.out.println("Num of Aisles in Section " + getSection(sectionID).getAisles().size());
        getSection(sectionID).getAisles().remove(getAisle(aisleID));
      //  System.out.println("Num of Aisles in Section " + getSection(sectionID).getAisles().size());
    }

    public void removeItem(String aisleID, int itemID) {
    //    System.out.println("Number of items in Aisle " + getAisle(aisleID).getItems().size());
        getAisle(aisleID).getItems().remove(getItem(aisleID, 1));
    //    System.out.println("Number of items in Aisle " + getAisle(aisleID).getItems().size());
    }

    public void addSection(Section newSection){
        this.section.add(newSection);
        System.out.println(newSection.getSectionId());
    }

    public void addAisle(char sectionID, Aisle a) {
        a.setAisleId(new getAisleId().getNextId(sectionID));
        getSection(sectionID).addAisleToSection(a);
        System.out.println(a.getAisleId());
    }

    public void addItem(String aisleID, Item i) {
        getAisle(aisleID).addItem(i);
    }

    // These 3 get functions to be private for final version
    public Section getSection(char sectionID) {
        for (Section s : this.section) {
            if (s.getSectionId() == sectionID) {
                return s;
            }
        }
        return null;
    }

    public Aisle getAisle(String aisleID) {
        char sectionID = aisleID.charAt(0);
        for (Aisle a : getSection(sectionID).getAisles()) {
            if (a.getAisleId().equals(aisleID)) {
                return a;
            }
        }
        return null;
    }

    public Item getItem(String aisleID, int itemID){
        for (Item i: getAisle(aisleID).getItems()) {
            if (i.getItemID() == itemID) {
                return i;
            }
        }
        return null;
    }

    
    //Added PrintInvoice-Edwin
    public void printInvoice(){
        for (Iterator iterator = this.getSectionIterator(); iterator.hasNext();) {
            Section section = (Section) iterator.next();
            System.out.println("Section " + section.getSectionId() + ":");
            for (Iterator iterator2 = section.getAisleIterator(); iterator2.hasNext();) {
                Aisle aisle = (Aisle) iterator2.next();
                System.out.println("Aisle " + aisle.getAisleId() + ":");
                for (Iterator iterator3 = aisle.getItemIterator(); iterator3.hasNext();) {
                    Item item = (Item) iterator3.next();
                    System.out.println("Item " + item.getItemID() + ":");
                }
            }
        }
    }
    

//NEWLY ADDED-Edwin
    //Section Iterator
    @Override
    public Iterator getSectionIterator() {
        return new SectionIterator();

    }
    
    //Added class-Edwin
    private class SectionIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if(index < section.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return section.get(index++);
            }
            return null;
        }
    }

}
