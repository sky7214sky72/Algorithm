import java.util.*;
class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        List<String> nums = Arrays.asList(String.valueOf(num).split(""));
        for (String n : nums) {
            if (k == Integer.parseInt(n)) {
                answer = nums.indexOf(n) + 1;
                break;
            }
        }
        return answer;
    }
}