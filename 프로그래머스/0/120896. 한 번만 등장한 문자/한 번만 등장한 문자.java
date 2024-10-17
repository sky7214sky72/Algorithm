import java.util.*;
class Solution {
    public String solution(String s) {
        Set<String> strSet = new HashSet<>(Arrays.asList(s.split("")));
        List<String> uniqueStr = new ArrayList<>();
        String answer = "";
        for (String str : strSet) {
            s = s.replaceFirst(str, "");            
            if (!s.contains(str)) {
               answer+=str;
            }
        }        
        char[] charArray = answer.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}