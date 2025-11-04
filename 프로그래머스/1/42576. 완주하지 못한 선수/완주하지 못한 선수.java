import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> pMap = new HashMap<>();
        for (String p : participant) {
            pMap.put(p, pMap.getOrDefault(p, 0) +1);
        }
        
        for (String c : completion) {
            if (pMap.containsKey(c)) {
                pMap.put(c, pMap.getOrDefault(c, 0) - 1);
            } else {
                pMap.put(c, 1);
            }
        }
        for (Map.Entry<String, Integer> entry: pMap.entrySet()) {
            if (entry.getValue() != 0) {
                answer = entry.getKey();
            }
        }
        return answer;
    }
}