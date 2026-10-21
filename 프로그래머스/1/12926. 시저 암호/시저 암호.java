import java.util.*;
class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                char cc = (char) ('A' + (c - 'A' + n) % 26);
                answer.append(cc);
            } else if (c>='a'&&c<='z') {
                char cc = (char) ('a' + (c - 'a' + n) % 26);
                answer.append(cc);
            } else {
              answer.append(String.valueOf(c));
            }
        }
        return answer.toString();
    }
}