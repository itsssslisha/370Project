import java.util.ArrayList;
import java.util.List;

public class Warehouse implements IteratorForSection{
    private ArrayList<Section> section = new ArrayList<Section>();
    private List<Observer> listeners = new ArrayList<>();

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

    public void addSection(Section newSection){
        this.section.add(newSection);
        Notify(newSection);
    }

    public void removeSection(char sectionID) {
        try {
            section.remove(getSection(sectionID));
        }
        catch (IllegalWarehouseException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addAisle(char sectionID, Aisle a) {
        a.setAisleId(new getAisleId().getNextId(sectionID));
        getSection(sectionID).addAisleToSection(a);
        Notify(a);
    }

    public void removeAisle(String aisleID) {
        try {
            char sectionID = aisleID.charAt(0);
            getSection(sectionID).getAisles().remove(getAisle(aisleID));
        }
        catch (IllegalWarehouseException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addItem(String aisleID, Item i) {
        getAisle(aisleID).addItem(i);
        Notify(i);
    }

    public void removeItem(String aisleID, int itemID) {
        try {
            getAisle(aisleID).getItems().remove(getItem(aisleID, 1));
        }
        catch (IllegalWarehouseException e) {
            System.out.println(e.getMessage());
        }
    }

    private Section getSection(char sectionID) {
        for (Section s : this.section) {
            if (s.getSectionId() == sectionID) {
                return s;
            }
        }
        throw new IllegalWarehouseException("UNKNOWN SECTION ERROR: Section Does Not Exist!");
    }

    private Aisle getAisle(String aisleID) {
        char sectionID = aisleID.charAt(0);
        for (Aisle a : getSection(sectionID).getAisles()) {
            if (a.getAisleId().equals(aisleID)) {
                return a;
            }
        }
        throw new IllegalWarehouseException("UNKNOWN AISLE ERROR: Aisle Does Not Exist!");
    }

    private Item getItem(String aisleID, int itemID){
        for (Item i: getAisle(aisleID).getItems()) {
            if (i.getItemID() == itemID) {
                return i;
            }
        }
        throw new IllegalWarehouseException("UNKNOWN ITEM ERROR: Item Does Not Exist!");
    }

    public void printInvoice(){
        for (Iterator iterator = this.getSectionIterator(); iterator.hasNext();) {
            Section section = (Section) iterator.next();
            System.out.println("Section " + section.getSectionId() + ":");
            for (Iterator iterator2 = section.getAisleIterator(); iterator2.hasNext();) {
                Aisle aisle = (Aisle) iterator2.next();
                System.out.println("    Aisle " + aisle.getAisleId() + ":");
                for (Iterator iterator3 = aisle.getItemIterator(); iterator3.hasNext();) {
                    Item item = (Item) iterator3.next();
                    System.out.println("        Item " + item.getItemID() + ": "+ item.getName() + " - " + item.getPriceInDollar());
                }
            }
        }
    }

    public void printSection() {
        for (Iterator iterator = this.getSectionIterator(); iterator.hasNext(); ) {
            Section section = (Section) iterator.next();
            if (iterator.hasNext())System.out.print("Section " + section.getSectionId() + ", ");
            else System.out.print("Section " + section.getSectionId());
        }
        System.out.println();
    }

    public void printAisle(char sectionID) {
        System.out.print("Section " + sectionID + " has the following Aisles: ");
        for (Iterator iterator = getSection(sectionID).getAisleIterator(); iterator.hasNext(); ) {
            Aisle aisle = (Aisle) iterator.next();
            if (iterator.hasNext())System.out.print(aisle.getAisleId() + ", ");
            else System.out.print(aisle.getAisleId());
        }
        System.out.println();
    }

    @Override
    public Iterator getSectionIterator() {
        return new SectionIterator();
    }

    private class SectionIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < section.size()) return true;
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
