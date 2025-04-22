import java.util.*;
class Solution {
    public String solution(String s) {
        String[] strs = s.split("");
        Arrays.sort(strs, Collections.reverseOrder());
        StringBuilder answer = new StringBuilder();
        for (String str : strs) {
            answer.append(str);
        }
        return answer.toString();
    }
}