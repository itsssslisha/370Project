public interface Observer {
    public abstract void Notify(Section section);
    public abstract void Notify(Aisle aisle);
    public abstract void Notify(Item item);
}
