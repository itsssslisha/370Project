public class getAisleId {
    private static int _aisleNum = 0;
    private static String _aisleId;
    public String getNextId(char sectionId) {
        _aisleNum++;
        _aisleId = String.valueOf(sectionId) + "" + _aisleNum;
        return _aisleId;
    }

}
