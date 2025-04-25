import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] numStr = new String[numbers.length];
        for (int i=0;i<numbers.length;i++) {
            numStr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(numStr, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        if ("0".equals(numStr[0])) return "0";
        StringBuilder answer = new StringBuilder();
        for (String numS : numStr) {
            answer.append(numS);
        }
        return answer.toString();
    }
}