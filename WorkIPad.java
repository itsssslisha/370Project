    public class WorkIPad implements Observer{
        public void Notify(Section section) {
            String message = "Mobile ALERT:\n    New Section Created: " + section.getSectionId();
            System.out.println(message);
        }
        public void Notify(Aisle aisle) {
            System.out.println("Mobile ALERT:");
            System.out.println("    New Aisle Created: " + aisle.getAisleId());
        }
        public void Notify(Item item) {
            System.out.println("Mobile ALERT:");
            System.out.println("    New Item Created: " + item.getName() + ": " + item.getPrice());
        }
    }
