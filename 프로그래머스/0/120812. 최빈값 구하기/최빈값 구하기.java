import java.util.*;

class Solution {
    public int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : array) {
            int count = map.getOrDefault(n, 0) + 1;
            if (count > maxCount) {
                maxCount = count;
                answer = n;
            } else if (count == maxCount) {
                answer = -1;
            }
            map.put(n, count);
        }
        return answer;
    }
}