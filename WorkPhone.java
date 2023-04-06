public class WorkPhone implements Observer{
    public void Notify(Section section) {
        System.out.println("IPad ALERT:");
        System.out.println("    New Section Created: " + section.getSectionId());
    }
    public void Notify(Aisle aisle) {
        System.out.println("IPad ALERT:");
        System.out.println("    New Aisle Created: " + aisle.getAisleId());
    }
    public void Notify(Item item) {
        System.out.println("IPad ALERT:");
        System.out.println("    New Item Created: " + item.getItemID());
    }

}
