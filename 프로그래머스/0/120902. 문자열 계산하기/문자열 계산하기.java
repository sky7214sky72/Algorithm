import java.util.*;
class Solution {
    public int solution(String my_string) {
        String[] my = my_string.split(" ");
        int answer = 0;
        String flag;
        for (int i=0;i<my.length;i++) {
            if (i == 0) {
                answer = Integer.parseInt(my[i]);
            } else if (i%2 ==0) {
                switch(my[i-1]) {
                    case "+":
                        answer+=Integer.parseInt(my[i]);
                        break;
                    case "-":
                        answer-=Integer.parseInt(my[i]);
                        break;
                }
            }
        }
        return answer;
    }
}