import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private ArrayList<Section> section = new ArrayList<Section>();
    private List<Observer> listeners = new ArrayList<>();
    public Item findItem(){
        // given the item id, find the section num and aisle num
        // iterator pattern
        return null;
    }

    public void addListener(Observer o) {
        listeners.add(o);
    }
    public void removeListener(Observer o) {
        listeners.remove(o);
    }
    public void Notify(Section section) {
        for (Observer o: listeners) {
            o.Notify(section);
        }
    }
    public void Notify(Aisle aisle) {
        for (Observer o: listeners) {
            o.Notify(aisle);
        }
    }
    public void Notify(Item item) {
        for (Observer o: listeners) {
            o.Notify(item);
        }
    }
    public void removeSection(char sectionID) {
       // System.out.println("Num Sections " + section.size());
        section.remove(getSection(sectionID));
       // System.out.println("Num Sections " + section.size());
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
        Notify(newSection);
    }

    public void addAisle(char sectionID, Aisle a) {
        a.setAisleId(new getAisleId().getNextId(sectionID));
        getSection(sectionID).addAisleToSection(a);
        System.out.println(a.getAisleId());
        Notify(a);
    }

    public void addItem(String aisleID, Item i) {
        getAisle(aisleID).addItem(i);
        Notify(i);
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

    public String Invoice(){
        return "";
    }


}
