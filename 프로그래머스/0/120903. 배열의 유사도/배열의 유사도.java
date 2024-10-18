import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        List<String> common = new ArrayList<>();
        for (String s: s1) {
            if (Arrays.asList(s2).contains(s)) {
                common.add(s);
            }
        }
        int answer = common.size();
        return answer;
    }
}