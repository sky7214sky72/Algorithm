import java.util.*;
class Solution {
    public int[] solution(String[] strlist) {
        List<String> strs = Arrays.asList(strlist);
        return strs.stream()
            .mapToInt(it -> {
                return it.length();
            })
            .toArray();
    }
}