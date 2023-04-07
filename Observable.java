    public interface Observable {
        void addListener(Observer observer);
        void removeListener(Observer observer);
        public void Notify(Section section);
        public void Notify(Aisle aisle);
        public void Notify(Item item);

    }
