import java.util.ArrayList;

public class Section {
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
}
