import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> nMap = new HashMap<>(); 
        for (int a : array) {
            int count = nMap.getOrDefault(a, 0) + 1;
            nMap.put(a, count);

            if (count > maxCount) {
                maxCount = count;
                answer = a; // 새로운 최빈값 수립
            } else if (count == maxCount) {
                answer = -1; // 최빈값이 중복되면 -1로 마킹
            }
        }
        
        return answer;
    }
}