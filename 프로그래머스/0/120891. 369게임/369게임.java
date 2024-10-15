import java.util.*;
class Solution {
    public int solution(int order) {
        int answer = 0;
        List<String> threeSixNine = Arrays.asList("3","6","9");
        for (String s : Integer.toString(order).split("")) {
            if (threeSixNine.contains(s)) {
                answer++;
            }
        }
        return answer;
    }
}