import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string) {
        Set<String> set = new LinkedHashSet<>();
        for (int i=0;i<my_string.length();i++) {
            set.add(String.valueOf(my_string.charAt(i)));
        }
        return set.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}