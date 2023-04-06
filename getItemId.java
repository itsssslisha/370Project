public class getItemId {
    private static int itemID = 0;
    public int nextItemID() {
        return ++itemID;
    }
}
