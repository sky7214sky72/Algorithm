import java.util.*;

class Solution {
    public int[] solution(int n) {
        int i = 2;
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (n%i == 0) {
                set.add(i);
                n = n / i;
            } else {
                i++;
            }
        }
        int[] answer = set.stream().mapToInt(Integer::intValue).sorted().toArray();
        return answer;
    }
}