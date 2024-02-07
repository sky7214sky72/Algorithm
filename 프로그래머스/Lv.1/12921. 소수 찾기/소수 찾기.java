import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 1;
        for (int i=3;i<=n;i++) {
            if (sosu(i)) {
                answer++;
            }
        }
        return answer;
    }
    
    public boolean sosu(int num) {
        for (int i=2;i<=(int) Math.sqrt(num);i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
}