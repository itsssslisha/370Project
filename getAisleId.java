import java.util.HashMap;

public class getAisleId {
    private static HashMap<Character, Integer> sectionMap = new HashMap<Character, Integer>();
    private  String _aisleId;
    public String getNextId(char sectionId) {
        if (sectionMap.containsKey(sectionId)) {
            sectionMap.put(sectionId, sectionMap.get(sectionId) + 1);
        } else {
            sectionMap.put(sectionId, 1);
        }
        _aisleId = String.valueOf(sectionId) + "" + sectionMap.get(sectionId);

        return _aisleId;
    }
}