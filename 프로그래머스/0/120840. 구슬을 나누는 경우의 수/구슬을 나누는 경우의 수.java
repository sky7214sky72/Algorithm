import java.util.*;
class Solution {
    public int solution(int balls, int share) {
        //balls! / (balls-share)! * share!
        if (balls <= share) {
            return 1;
        }
        return (int) Math.round(factorial(balls) / (factorial(balls-share) * factorial(share)));
    }
    
    public double factorial(int n) {
        if (n==1) return 1;
        return n * factorial(n-1);
    }
}