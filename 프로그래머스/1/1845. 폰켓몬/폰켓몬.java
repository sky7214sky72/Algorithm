import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, n);
        }
        int answer = nums.length / 2 >= map.size() ? map.size() : nums.length / 2;
        return answer;
    }
}