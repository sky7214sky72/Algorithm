import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder nums = new StringBuilder();
        for (int i=0;i<my_string.length();i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {
                nums.append(String.valueOf(ch));
            } else {
                if (!"".equals(nums.toString())) {
                    answer+=Integer.parseInt(nums.toString());
                    nums = new StringBuilder();
                }
            }
        }
        if (nums.length() > 0) {
            answer+=Integer.parseInt(nums.toString());
        }
        return answer;
    }
}