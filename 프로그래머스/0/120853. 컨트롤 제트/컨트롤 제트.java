import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (String a : s.split(" ")) {
            if (a.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(a));
            }
        }
        for (Integer i : stack) {
            answer+=i;
        }
        return answer;
    }
}