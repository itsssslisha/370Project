public class getSectionId {
    private static char _currentId = 'A'-1;
    public char getNextId(){
        if(_currentId<'Z') {
            return ++_currentId;
        }
        else throw new IllegalWarehouseException("Max amount of sections reached.");
    }
}