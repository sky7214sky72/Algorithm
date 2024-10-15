import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int minDiff = Math.abs(n - answer);
        for (int a : array) {
            int diff = Math.abs(n - a);
            if (diff < minDiff || (diff == minDiff && a < answer)) {
                minDiff = diff;
                answer = a;
            }
        }        
        return answer;
    }
}