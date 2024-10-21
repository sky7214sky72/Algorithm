import java.util.*;
class Solution {
    public String solution(String my_string) {
        char[] array = new char[my_string.length()];
        int index = 0;
        for (char a : my_string.toCharArray()) {
            array[index] = Character.toLowerCase(a);
            index++;
        }
        Arrays.sort(array);
        String answer = "";
        for (char r : array) {
            answer += String.valueOf(r);
        }
        return answer;
    }
}