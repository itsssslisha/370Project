public class getSectionId {
    private static char _currentId = 'A'-1;
    public char getNextId(){
//        if _currentId > ascii z {
//            return TooManySectionsException
//        }
        _currentId++;
        return _currentId;
    }
}
