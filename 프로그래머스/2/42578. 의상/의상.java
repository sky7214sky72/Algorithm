import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothesType = new HashMap<>();
        for (String[] clothe : clothes) {
            clothesType.put(clothe[1], clothesType.getOrDefault(clothe[1], 0)+1);
        }
        for (int v : clothesType.values()) {
            int count = v + 1;
            answer*=count;
        }
        return answer-1;
    }
}