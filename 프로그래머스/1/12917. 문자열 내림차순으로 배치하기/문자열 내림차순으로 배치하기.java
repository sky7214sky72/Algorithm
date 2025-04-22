import java.util.*;
class Solution {
    public String solution(String s) {
        String[] strs = s.split("");
        Arrays.sort(strs, Collections.reverseOrder());
        String answer = "";
        for (String str : strs) {
            answer+=str;
        }
        return answer;
    }
}