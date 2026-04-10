import java.util.*;

class Solution {    
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            numMap.put(num, num);
        }
        answer = nums.length / 2 >= numMap.size() ? numMap.size() : nums.length / 2;
        return answer;
    }
}