import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        List<String> answer = new ArrayList<String>();
        for (String q : quiz) {
            String[] u = q.split(" ");
            int result = Integer.parseInt(u[u.length-1]);
            int r = 0;
            if (u[1].equals("+")) {
                r = Integer.parseInt(u[0]) + Integer.parseInt(u[2]);
            } else {
                r = Integer.parseInt(u[0]) - Integer.parseInt(u[2]);
            }                        
            if (result == r) {
                answer.add("O");
            } else {
                answer.add("X");
            }
        }        
        return answer.toArray(new String[0]);
    }
}